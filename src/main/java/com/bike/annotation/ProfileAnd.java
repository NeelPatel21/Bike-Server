package com.bike.annotation;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Profile;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;


public class ProfileAnd implements Condition {

    @Override
    public boolean matches(final ConditionContext context,
                           final AnnotatedTypeMetadata metadata) {
        if (context.getEnvironment() != null) {
            final MultiValueMap<String, Object> attrs = metadata.getAllAnnotationAttributes(Profile.class.getName());
            if (attrs != null) {
                for (final Object value : attrs.get("value")) {
                    final String activeProfiles = context.getEnvironment().getProperty("spring.profiles.active");

                    for (final String profile : (String[]) value) {
                        if (profile.trim().startsWith("!"))
                            return !activeProfiles.contains(profile.substring(1));
                        if (!activeProfiles.contains(profile)) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        return true;
    }

}
