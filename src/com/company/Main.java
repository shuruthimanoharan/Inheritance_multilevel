package com.company;




class Student{
    void display()
    {
        System.out.println(" display");
    }
}
class Student1  extends Student
{
    String name="geetha";
    void  tamil()
    {
        System.out.println(name);
    }
}
class Student2  extends Student1
{
    String name="swathi";
    void english()
    {

        System.out.println(name);
    }
}
class Student3  extends Student2
{
    String name="shuruthi";
    void maths()
    {
        System.out.println(name);
    }
}
public class Main
{
    public static void main(String[] arguments) {
        Student3 student3 = new Student3();
        student3.display();
        student3.tamil();
        student3.english();
        student3.maths();
    }
}
