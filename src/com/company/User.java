package com.company;

public class User{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameException {
        if (name.length()>20){
            throw new NameException("Slishkom dlinnoe imya");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws NameException {
        if (age<0 && age>100){
            throw new NameException("Ne podxodyashui vozract");
        }
        this.age = age;
    }
}

