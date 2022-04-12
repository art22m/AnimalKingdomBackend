package com.art22m.demo;

public class Animal {
    String avatar;
    String bio;
    String firstName;
    String id;
    String lastName;
    String title;

    public Animal(String avatar, String bio, String firstName, String id, String lastName, String title) {
        this.avatar = avatar;
        this.bio = bio;
        this.firstName = firstName;
        this.id = id;
        this.lastName = lastName;
        this.title = title;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getBio() {
        return bio;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }
}
