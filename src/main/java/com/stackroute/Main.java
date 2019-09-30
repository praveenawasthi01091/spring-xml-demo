package com.stackroute;


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
        /*without property*/
        Movie movie = (Movie) applicationContext.getBean("movie1");
        System.out.println(movie);
        /* with  property byName*/
        Movie movie1=(Movie)applicationContext.getBean("movie2");
        System.out.println(movie1);

        /* with constructor */
        Movie movie2=(Movie)applicationContext.getBean("movie3");
        System.out.println(movie2);

    }

}
