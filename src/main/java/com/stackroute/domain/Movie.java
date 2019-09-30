package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    private ApplicationContext applicationContext;
  private Actor actor;

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }


    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Movie() {

    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException
    {
      //  System.out.println("received the beanFactory: "+ beanFactory);

    }

    @Override
    public void setBeanName(String s)
    {
       // System.out.println("The name of  bean  is: "+s);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //System.out.println("applicationContext  is: "+ applicationContext);
        this.applicationContext=applicationContext;

    }
}
