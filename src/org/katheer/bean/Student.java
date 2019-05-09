package org.katheer.bean;

public class Student {
    private int id;
    private String name;
    private String addr;

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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void getStudentDetails() {
        System.out.println("Student Details");
        System.out.println("----------------");
        System.out.println("Student Name    : " + this.getName());
        System.out.println("Student ID      : " + this.getId());
        System.out.println("Student Addr    : " + this.getAddr());
    }
}
