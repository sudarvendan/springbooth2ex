package com.javalearning.springbooth2ex.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {

    private int id;
    private String name;
    private int age;
    private String email;

    @Id
    @Column
    public int getId(){
        return id;
    }

    @Column
    public String getName(){
        return name;
    }

    @Column
    public int getAge(){
        return age;
    }

    @Column
    public String getEmail(){
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
