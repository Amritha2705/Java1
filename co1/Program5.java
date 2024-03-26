public class Program5
{
int price;
class Processor
{
int cores;
String producer;
Processor(int noC,String Anu)
{
cores=noC;
producer=Anu;
}
void display()
{
System.out.println("\n Processor info");
System.out.println("no of cores="+cores);
System.out.println("manufacture="+producer+"\n");
}
}
static class RAM
{
int mem;
String manuf;
RAM(int memory,String producer){
mem=memory;
manuf=producer;
}
void display()
{
System.out.println("\n RAM info");
System.out.println("Memory="+mem+"GB");
System.out.println("manufacture="+manuf+"\n");
}
}
public static void main(String[] args)
{
Program5.RAM obj1=new Program5.RAM(8,"intel");
Program5 obj2=new Program5();
Program5.Processor obj3=obj2.new Processor(8,"Samsung");
obj1.display();
obj3.display();
}}
