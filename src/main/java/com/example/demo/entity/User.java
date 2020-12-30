package com.example.demo.entity;

import lombok.Data;

/**
 * @author HP
 */
public class User implements Comparable<User> {

    private int id;

    private String name;

    private String password;

    private Dog dog;

    /**
     * 用户状态
     */
    private String status;

    public User(String name) {
        this.name = name;
    }

    public User(){

    }



    @Override
    public int compareTo(User o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", dog=" + dog +
                ", status='" + status + '\'' +
                '}';
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
