package com.stackroute;


import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.beans.XMLDecoder;
import java.io.FileNotFoundException;


public class Main
{
    public static void main( String[] args ) throws FileNotFoundException
    {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        BeanLifecycleDemoBean   beanLifecycleDemoBean=(BeanLifecycleDemoBean)applicationContext.getBean("blcd1");
        System.out.println(beanLifecycleDemoBean);

        ClassPathXmlApplicationContext cxt=(ClassPathXmlApplicationContext)applicationContext;
        cxt.close();

    }

}
