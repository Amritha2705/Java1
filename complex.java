import java.util.Scanner;
public class complex
{
int r,i;
complex (int real,int img){
r=real;
i=img;
}
void display()
{
System.out.print(r +"+"+i+"i");
}
static void add(int r1,int i1,int r2,int i2)
{
r1=r1+r2;
i1=i1+r2;
System.out.println("\nAfter Addittion="+r1+"+"+i1+"i" );
}
public static void main(String[] args)
{
complex first=new complex(5,4);
complex second=new complex(5,4);
System.out.println("complex number are: ");
first.display();
second.display();
add(first.r,first.i,second.r,second.i);
}}
