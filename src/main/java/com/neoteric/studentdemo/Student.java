package com.neoteric.studentdemo;

public class Student {
    public static void main(String[] args) {

        Address studentAddress = new Address();
        studentAddress.city= "kukatpally";
        studentAddress.district="kphb";
        studentAddress.houseNo="2-33";
        studentAddress.pincode="52205";
        studentAddress.state="hyd";

        Address schoolAddress = new Address();
        schoolAddress.state="hyd";
        schoolAddress.pincode="52200";
        schoolAddress.houseNo="33";
        schoolAddress.district="miyapur";
        schoolAddress.city="hello";

        Studentform student = new Studentform();
        student.name ="manjith";
        student.age=22;
        student.mobileNo="998995021";
        student.rollNo="22";
        student.standard="8th";
        student.studentAddress=studentAddress;
        student.schoolAddress=schoolAddress;
        System.out.println(student);

    }
}
