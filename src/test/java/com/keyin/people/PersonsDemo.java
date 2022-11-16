package com.keyin.people;

public class PersonsDemo {
//demo test to create objects using the constructors created
//one for each class
    //main method
    //create person obj w name age gender
    //person obk w name age gender id gpa
    //person obj w name age gender subject salary
    public static void main(String... args){
//create objects of each class
        Person Ed = new Person("Edward Newgate", 47, "Male");
        Student Light = new Student("Light Yagami", 16, "Male", "C354", 5.0);
        Teacher Bisky = new Teacher("Biscuit Kruger", 23,"Female","Marcial Arts",300000);
        CollegeStudent Ty = new CollegeStudent("Tyler Engle", 27, "Male", "777",4, 3, "Coder");

//call tostring method for each class
        //Ed.toString();
        System.out.println("");
        System.out.println(Ed);
        System.out.println("");
        System.out.println(Light);
        System.out.println("");
        System.out.println(Bisky);
        System.out.println("");
        System.out.println(Ty);
        System.out.println("");



    }
}
