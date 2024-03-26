import java.util.Scanner;
public class Program10
{
int eNo;
String eName;
double eSalary;
public void getdetails()
{
Scanner sc = new Scanner(System.in);
System.out.print("employee number:");
eNo=sc.nextInt();
System.out.print("name:");
sc.nextLine();
eName=sc.nextLine();
System.out.print("Salary:");
eSalary=sc.nextDouble();
}
void  display()
{
System.out.println("employee no:"+eNo);
System.out.println("name:"+eName);
System.out.println("salary :"+eSalary+"\n");
}
public static void main (String[] args)
{
System.out.println("\n enter the no. of employee");
Scanner sc1=new Scanner(System.in);
int num=sc1.nextInt();
System.out.println("enter the employee details");
Program10 arr[]=new Program10[num];
for(int i=0;i<num;i++)
{
arr[i]=new Program10();
arr[i].getdetails();
}
System.out.println("Information of Employee");
for(int i=0;i<num;i++)
arr[i].display();
boolean state=false;
System.out.println("enter the emp no. to get details");
int num2=sc1.nextInt();
for(int i=0;i<num;i++)
{
if(arr[i].eNo==num2)
{
System.out.println("emp details");
arr[i].display();
}
}
}
}
