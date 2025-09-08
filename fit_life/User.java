package com.example.fit_life;

public class User {
    public String name, email;

    // Default Constructor (Required for Firebase)
    public User() {}

    // Parameterized Constructor
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
