package com.testpreauthorize.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public final class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected final Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ RootConfig.class };
    }

    @Override
    protected final Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { Config.class, MethodSecurityConfig.class };
    }

    @Override
    protected final String[] getServletMappings() {
        return new String[]{"/"};
    }

}
