package com.stackroute;

public class Movie {
    private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
        System.out.println("setter called");
    }
    public void callActing(){
        actor.act();
    }
}
