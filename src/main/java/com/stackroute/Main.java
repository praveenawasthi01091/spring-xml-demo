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
       /* System.out.println( "Hello World!" );
        Actor  actor= new Actor("Salman","Male",29);
        System.out.println(actor); */

        /* 1st method */
       /* Resource resource= new ClassPathResource("beans.xml");
        BeanFactory factory= new XmlBeanFactory(resource);
        Actor actr1=(Actor) factory.getBean("actr1");
        System.out.println(actr1); */
/*        BeanFactory factory= new XmlBeanFactory(resource);
        Movie movie3=(Movie) factory.getBean("movie1");
        System.out.println(movie3);

        System.out.println("2nd method"); */


        /* 2nd method*/
        /*
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Actor actr2 = (Actor) applicationContext.getBean("actr2");
        System.out.println(actr2); */

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = (Movie) applicationContext.getBean("movie1");
        System.out.println(movie);

        //applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie2 = (Movie) applicationContext.getBean("movie1");
        System.out.println(movie2);
        System.out.println("Without scope property");
        System.out.println((Movie) applicationContext.getBean("movie1")==(Movie) applicationContext.getBean("movie1"));
        /* with scope prototype*/
        System.out.println("With scope property");
        System.out.println((Movie) applicationContext.getBean("movie2")==(Movie) applicationContext.getBean("movie2"));
        /* use name */
        Movie movie13=(Movie) applicationContext.getBean("movie3");
        Movie movie14=(Movie) applicationContext.getBean("movie4");
        System.out.println(movie13);
        System.out.println(movie14);


       /* BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        reader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        Movie movie4= (Movie) ((DefaultListableBeanFactory) (beanDefinitionRegistry)).getBean("movie2");
        System.out.println(movie4); */


    }


}
