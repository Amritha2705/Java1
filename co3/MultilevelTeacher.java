import java.util.Scanner;
class Person
{
String name,gender,addr;
int age;
Person(String name,String gender,String addr,int age)
{
this.name=name;
this.gender=gender;
this.addr=addr;
this.age=age;
}
}
class Employee extends Person
{
int empid;
String compName,quel;
double salary;
Employee (String name,String gender,String addr,int age, int empid, String compName,String quel,double salary) 
{
super(name,gender,addr,age);
 this.empid=empid;
 this.compName=compName;
 this.quel=quel;
 this.salary=salary;
 }
 }
 class Teacher extends Employee
 {
 String sub,dept;
 int Tid;
 Teacher(String name,String gender,String addr,int age,int empid,String compName,String quel,double salary,String sub,String dept,int Tid)
 {
 super (name,gender,addr,age,empid,compName,quel,salary);
 this.sub=sub;
 this.dept=dept;
 this.Tid=Tid;
 }
 void display()
 {
 System.out.println("name: " +name);
  System.out.println("gender: " +gender);
   System.out.println("address:" +addr);
    System.out.println("age: " +age);
     System.out.println("employee id: " +empid);
      System.out.println("company namer: " +compName);
       System.out.println("Qualification: " +quel);
        System.out.println("salary: " +salary);
         System.out.println("department: " +dept);
          System.out.println("teacher id: " +Tid);
          }
          }
          public class MultilevelTeacher
          {
          public static void main(String[] args)
          {
          Scanner sc=new Scanner(System.in);
          System.out.print("enter the number of teachers :");
          int n=sc.nextInt();
          Teacher[] teachers=new Teacher[n];
          System.out.println("enter details of teacher");
          for(int i=0;i<n;i++)
          {
          System.out.print("name:");
          String name=sc.next();
           System.out.print("gender:");
          String gender=sc.next();
           System.out.print("address:");
          String addr=sc.next();
           System.out.print("Age:");
          int age=sc.nextInt();
           System.out.print("employee id:");
          int empid=sc.nextInt();
           System.out.print("comp name:");
          String compName=sc.next();
           System.out.print("qualificaton:");
          String quel=sc.next();
           System.out.print("salary:");
          double salary=sc.nextDouble();
           System.out.print("subject:");
          String sub=sc.next();
           System.out.print("department:");
          String dept=sc.next();
           System.out.print("tech id:");
          int Tid=sc.nextInt();
          teachers[i]=new Teacher(name,gender,addr,age,empid,compName,quel,salary,sub,dept,Tid);
          }
           System.out.println("details");
           for (Teacher i:teachers)
           {
           i.display();
           System.out.println();
           }
           }
           }
           
