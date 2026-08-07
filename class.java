import java.io.*;
import java.util.*;
class Student {code 
String name;
int rollNo;
int marks;
Student(String name, int rollNo, int marks) {
this.name = name;
this.rollNo = rollNo;
this.marks = marks;
}

void display() {
System.out.println("Name : " + name);
System.out.println("Roll No : " + rollNo);
System.out.println("Marks : " + marks);
System.out.println("Grade : " + calculateGrade());
System.out.println();
}

String calculateGrade() {
if (marks >= 90)
return "A";
else if (marks >= 75)
return "B";
else if (marks >= 60)
return "C";
else if (marks >= 40)
return "D";
else
return "F";
}

public static void main(String[] args) {
Student s1 = new Student("Rahul", 101, 85);
Student s2 = new Student("Priya", 102, 67);

s1.display();
s2.display();
}
}