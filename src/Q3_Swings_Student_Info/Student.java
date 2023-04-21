package Q3_Swings_Student_Info;

public class Student {
    String name;
    String USN;
    String address;
    int age;
    double cgpa;

    Student(String name, int age, String USN, String address, double cgpa) {
        this.name = name;
        this.age = age;
        this.USN = USN;
        this.address = address;
        this.cgpa = cgpa;
    }

    String printDetails(){
        return "----Printing the Details----\n" + "\nName : " + this.name + "\nAge : " + this.age  + "\nUSN : " + this.USN + "\nAddress : " + this.address + "\nCGPA : " + this.cgpa;
    }
}