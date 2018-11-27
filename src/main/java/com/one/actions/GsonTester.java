package com.one.actions;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author One
 * @description 认识 Gson
 * @date 2018/11/27
 */
public class GsonTester {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        Student student = gson.fromJson(jsonString, Student.class);
        System.out.println(student);
        // Student [ name: Mahesh, age: 21 ]

        jsonString = gson.toJson(student);
        System.out.println(jsonString);
        /**
         * {
         *   "name": "Mahesh",
         *   "age": 21
         * }
         */

    }

}
class Student {
    private String name;
    private int age;
    private int rollNo;

    public Student(){}

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
    @Override
    public String toString() {
        return "Student [ name: "+name+", age: "+ age+ " ]";
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
