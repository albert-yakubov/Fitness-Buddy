package com.justme.fitnessbuddy.models;

import java.util.concurrent.atomic.AtomicLong;

public class MacrosUser {


    //static means data only available on class level, will always return unique number
    private static final AtomicLong counter = new AtomicLong();

    private long id;
    private String username;
    private String email;
    private String password;

    public MacrosUser(String username, String email, String password) {
        this.id =  counter.incrementAndGet();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getUsername() {
        return username.toLowerCase();
    }
    public void setUsername(String username) {
        this.username = username.toLowerCase();
    }

    public String getEmail() {
        return email.toLowerCase();
    }
    public void setEmail(String email) {
        this.email = email.toLowerCase();
    }
    public String getPassword() {
        return password;

    }
    public void setPassword(String password) {
        this.password = password;
    }
}
