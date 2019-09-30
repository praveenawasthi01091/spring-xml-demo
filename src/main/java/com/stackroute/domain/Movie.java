package com.stackroute.domain;

public class Movie {
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
}
