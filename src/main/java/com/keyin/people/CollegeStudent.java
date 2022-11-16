package com.keyin.people;

public class CollegeStudent extends Student{
//collegestudent class to extend student class
    //instance var for major(String)
    private String myMajor;
    private int myYearsInSchool;

    public CollegeStudent(String newName, int newAge, String newGender, String newIdCode, int newGPA, int newSchoolLevelInYears, String newMajor){
//parameterized constructor to create a new collegestudent obj
//utilizes super() to grab attributes from parent class
        super(newName, newAge, newGender, newIdCode, newGPA);
        this.myName = newName;
        this.myAge = newAge;
        this.myGender = newGender;
        this.myIdCode = newIdCode;
        this.myGPA = newGPA;
        this.myYearsInSchool = newSchoolLevelInYears;
        this.myMajor = newMajor;

    }

    @Override
    public String toString() {
//method to output collegestudent object--
//along with any attributes, in a
//more formatted string
        return "CollegeStudent{" +
                "Majors in: '" + myMajor + '\'' +
                ", Years currently punched: '" + myYearsInSchool +
                ", Student code: '" + myIdCode + '\'' +
                ", Current GPA: " + myGPA +
                ", Name: '" + myName + '\'' +
                ", Age: " + myAge +
                ", Gender: '" + myGender + '\'' +
                '}';
    }
//instance var for year(int)
    //constructor w 7 parameters:
        //myName, myAge, myGender,
        //myIdNum, myGPA, year, and major
    //sets and gets
    //format output to string
    //reference SUper() for anything
        //already done by Student class
}
