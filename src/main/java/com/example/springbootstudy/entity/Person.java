package com.example.springbootstudy.entity;

public class Person {
    private Integer id;

    private String name;

    private Integer websiteid;

    private String password;

    private String sex;

    public Person(Integer id, String name, Integer websiteid, String password, String sex) {
        this.id = id;
        this.name = name;
        this.websiteid = websiteid;
        this.password = password;
        this.sex = sex;
    }

    public Person() {
        super();
    }

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

    public Integer getWebsiteid() {
        return websiteid;
    }

    public void setWebsiteid(Integer websiteid) {
        this.websiteid = websiteid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }
}