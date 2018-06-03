package com.foobar.appfetch;

public class Person {
    long id;
    String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(long id, String name) {

        this.id = id;
        this.name = name;
    }

    public long getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}