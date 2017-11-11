package com.bike.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD,})
@Retention(RetentionPolicy.RUNTIME)
@Bean
@Primary
@AndProfile
@Profile({"!heroku","dev"})
@Autowired
public @interface DevNonHeroku {
}
