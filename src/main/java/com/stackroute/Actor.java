package com.stackroute;

public class Actor {
    private String name;
    private String gender;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void act(){
        System.out.println("Actor " + name + " of " + gender +" gender is " + age + " years old" );
    }
}
