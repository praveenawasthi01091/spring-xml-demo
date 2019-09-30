package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    public BeanLifecycleDemoBean() {
        System.out.println("Object created");
    }

    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("After properties method called");

    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println("Destroyed");
    }

    @Override
    public String toString() {
        return "BeanLifecycleDemoBean{}";
    }

   public void customInit()
    {
        System.out.println("Object Initialized: customInit() called");
    }


    public void customDestroy()
    {
        System.out.println("Object destroyed: customDestroy() called");
    }
}
