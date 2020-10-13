package com.litan_06;
/*
    学生类
 */
public class Student {
    private String sno;
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String sno, String name, int age, String address) {
        this.sno = sno;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
