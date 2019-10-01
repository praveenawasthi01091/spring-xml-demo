package com.stackroute;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
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

        Movie movie4=(Movie)applicationContext.getBean("movie4");
        System.out.println(movie4);

        /* Exception while using byType*/

       /*Exception in thread "main" org.springframework.beans.factory.UnsatisfiedDependencyException:
        Error creating bean with name 'movie3' defined in class path resource
        [beans.xml]: Unsatisfied dependency expressed through bean property 'actor';
        nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
        No qualifying bean of type 'com.stackroute.domain.Actor' available:
        expected single matching bean but found 3: actor*/

    }


}
