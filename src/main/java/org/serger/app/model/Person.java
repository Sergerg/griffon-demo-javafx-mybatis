package org.serger.app.model;

/**
 * Created with IntelliJ IDEA.
 * User: Serger
 * Date: 23.03.2016
 * Time: 13:28
 */
public class Person {
    private int id;
    private String name;
    private String lastname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
