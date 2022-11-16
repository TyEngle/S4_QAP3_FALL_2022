package com.keyin.people;

public class Person {
    protected String myName;
    protected int myAge;
    protected String myGender;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public String getMyGender() {
        return myGender;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }

    public Person(String newName, int newAge, String newGender){
        this.myName = newName;
        this.myAge = newAge;
        this.myGender = newGender;

    }

    @Override
    public String toString() {
//method to output Person object--
//along with any attributes, in a
//more formatted string
        return "Person{" +
                "Name: '" + myName + '\'' +
                ", Age: " + myAge +
                ", Gender: '" + myGender + '\'' +
                '}';
    }
}
