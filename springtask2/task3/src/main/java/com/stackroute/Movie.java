package com.stackroute;

public class Movie {
    private Actor actor;
    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void callingActor(){
        System.out.println(actor.toString());
    }
}
