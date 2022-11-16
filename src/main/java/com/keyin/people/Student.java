package com.keyin.people;

public class Student extends Person{
    protected String myIdCode;
    protected double myGPA;

    public Student(String newName, int newAge, String newGender, String newIdCode, double newGPA) {
        super(newName, newAge, newGender);
        

        this.myIdCode = newIdCode;
        this.myGPA = newGPA;
    }

    public String getMyIdCode() {
        return myIdCode;
    }

    public void setMyIdCode(String myIdCode) {
        this.myIdCode = myIdCode;
    }

    public double getMyGPA() {
        return myGPA;
    }

    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA;
    }

    @Override
    public String toString() {
//method to output Student object--
//along with any attributes, in a
//more formatted string
        return "Student{" +
                "Student code: '" + myIdCode + '\'' +
                ", Current GPA: " + myGPA +
                ", Name: '" + myName + '\'' +
                ", Age: " + myAge +
                ", Gender: '" + myGender + '\'' +
                '}';
    }
}
