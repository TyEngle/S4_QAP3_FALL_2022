package com.keyin.people;

public class Teacher extends Person{
    //instance var of subject(String)
    //instance var for salary(double)
    //get and sets
    //format output to string
    private String mySubject;


//gets and sets start here
    public String getMySubject() {
        return mySubject;
    }

    public void setMySubject(String mySubject) {
        this.mySubject = mySubject;
    }

    public double getMySalary() {
        return mySalary;
    }

    public void setMySalary(double mySalary) {
        this.mySalary = mySalary;
    }

    private double mySalary;



    public Teacher(String newMyName, int newMyAge, String newMyGender, String newMySubject, double newMySalary){
        super(newMyName, newMyAge, newMyGender);
        this.myName = newMyName;
        this.myAge = newMyAge;
        this.myGender = newMyGender;
        this.mySubject = newMySubject;
        this.mySalary = newMySalary;
    }


    @Override
    public String toString() {
//method to output Teacher object--
//along with any attributes, in a
//more formatted string
        return "Teacher{" +
                "Subject of expertise: '" + mySubject + '\'' +
                ", Salary: " + mySalary +
                '}';
    }


}
