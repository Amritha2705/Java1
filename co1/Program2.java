import java.util.Scanner;
class Matrix{
int m,n,i,j;
int[][]a=new int[5][5];
int[][]b=new int[5][5];
int[][]c=new int[5][5];
Scanner sc=new Scanner(system.in);
void get()
{
System.out.println("enter no of rows:");
m=sc.nextInt();
System.out.println("enter no of coloumn:");
n=sc.nextInt();
System.out.println("enter elementof matrix A");
for(i=0;i<m;i++)
for(i=0;j<n;j++)
a[i][j]=sc.nextInt();
System.out.println("enter element of matrix B");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
b[i][j]=sc.nextInt();
}
void add(){
for(i=0;i<m;i++)
for(j=0;j<n;j++)
c[i][j]=a[i][j]+b[i][j];
}
void display()
{
System.out.println("Matrix A");

for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
System.out.println();
}
System.out.println("Matrix B");}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(b[i][j]+" ");
System.out.println();
}
System.out.println("Matrix C");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(c[i][j]+" ");
System.out.println();}
}
}
}
class Program2
{
public static void main(String args[])
{
Matrix ob=new Matrix();
ob.get();
ob.add();
ob.display();
}
}

