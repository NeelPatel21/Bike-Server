package com.bike.dispatcher;

import com.bike.annotation.Dev;
import com.bike.endpoint.admin.AdminMapping;
import com.bike.endpoint.user.EndUserMapping;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.Registration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

@Dev
@Component
public class DispatcherServletRegistration{

    @Dev
    ServletRegistrationBean defaultDispatcherServlet(){
        DispatcherServlet ds = new DispatcherServlet();
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
//        ac.register(AdminMapping.class);
        ds.setApplicationContext(ac);
        System.out.println("test 1 dscccscscdsccdscscs");

        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(ds);
        servletRegistrationBean.addUrlMappings("/");
        servletRegistrationBean.setName("default-servlet");
        servletRegistrationBean.setLoadOnStartup(1);
        return servletRegistrationBean;
    }

    @Dev
    ServletRegistrationBean adminDispatcherServlet(){
        DispatcherServlet ds = new DispatcherServlet();
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        ac.register(AdminMapping.class);
        ds.setApplicationContext(ac);
        System.out.println("test 2 dscccscscdsccdscscs");

        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(ds);
        servletRegistrationBean.addUrlMappings("/admin/*");
        servletRegistrationBean.setName("admin");
        servletRegistrationBean.setLoadOnStartup(0);
        return servletRegistrationBean;
    }

    @Dev
    ServletRegistrationBean endUserDispatcherServlet(){
        DispatcherServlet ds = new DispatcherServlet();
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        ac.register(EndUserMapping.class);
        ds.setApplicationContext(ac);
        System.out.println("test 3 dscccscscdsccdscscs");

        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(ds);
        servletRegistrationBean.addUrlMappings("/end-user-api/*");
        servletRegistrationBean.setName("end-user-api");
        servletRegistrationBean.setLoadOnStartup(0);
        return servletRegistrationBean;
    }

    @Dev
    ServletRegistrationBean operatorDispatcherServlet(){
        DispatcherServlet ds = new DispatcherServlet();
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        ac.register(EndUserMapping.class);
        ds.setApplicationContext(ac);
        System.out.println("test 4 dscccscscdsccdscscs");

        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(ds);
        servletRegistrationBean.addUrlMappings("/operator-api/*");
        servletRegistrationBean.setName("operator-api");
        servletRegistrationBean.setLoadOnStartup(0);
        return servletRegistrationBean;
    }
}
