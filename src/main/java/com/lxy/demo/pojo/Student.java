package com.lxy.demo.pojo;

public class Student {
    private String idNo;
    private String name;
    private int age;
    private int score;
    private int classroom;

    public Student(){

    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNo='" + idNo + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", classroom=" + classroom +
                '}';
    }
}
