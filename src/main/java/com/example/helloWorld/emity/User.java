package com.example.helloWorld.emity;

import java.io.Serializable;

public class User implements Serializable{
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public String toString(){
        return this.id+""+this.name;
    }
}