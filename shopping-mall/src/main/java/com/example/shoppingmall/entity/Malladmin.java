package com.example.shoppingmall.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Malladmin {

    @Id
    private long id;

    private String name;
    private String password;
    private long phonenumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }
}