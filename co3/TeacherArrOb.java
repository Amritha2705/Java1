import java.util.Scanner;
class Employee
{
protected int empId;
protected String name;
protected double salary;
protected String address;
public Employee(int empId,String name,double salary,String address)
{
this.empId=empId;
this.name=name;
this.salary=salary;
this.address=address;
}
}
class Teacher extends Employee{
private String dept;
private String sub;
public Teacher(int empId,String name,double salary,String address,String dept,String sub)
{
super(empId,name,salary,address);
this.dept=dept;
this.sub=sub;
}
public void display()
{
System.out.println("Employe Id: " +empId);
System.out.println("name: " +name);
System.out.println("salary:" +salary);
System.out.println("Address:" +address);
System.out.println("Department:" +dept);
System.out.println("Subject: " +sub);
System.out.println();}
}
public class TeacherArrOb
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.print("enter the number of teachers: ");
int N= sc.nextInt();
sc.nextLine();
Teacher[] teachers=new Teacher[N];
System.out.println("enter the details");
for(int i=0;i<N;i++)
{
System.out.print("employe id:");
int empId=sc.nextInt();
sc.nextLine();
System.out.print("name:");
String name=sc.nextLine();
System.out.print("Salary");
double salary=sc.nextDouble();
sc.nextLine();
System.out.print("Address:");
String address=sc.nextLine();
System.out.print("Department:");
String dept=sc.nextLine();
System.out.print("Subject taught:");
String sub=sc.nextLine();
teachers[i]=new Teacher(empId,name,salary,address,dept,sub);
}
System.out.println("|n Details of all teachers:");
for(Teacher teacher: teachers)
teacher.display();
}
}

