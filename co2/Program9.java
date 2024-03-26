import java.util.Scanner;
public class Program9
{
public static void main(String[] args)
{
System.out.println("enter the string");
Scanner sc = new Scanner(System.in);
String str1=sc.nextLine();
System.out.println("length of String="+str1.length());
System.out.println("charachter at first position=" +str1.charAt(1));
System.out.println("string ends withe:"+str1.endsWith("e"));
System.out.println("lowercase:"+str1.toLowerCase());
System.out.println("uppercase"+str1.toUpperCase());
System.out.println("Character at 2nd & 4th position "+str1.charAt(1)+ "," +str1.charAt(3));
System.out.println("the sub string using start index only is "+str1.substring(5));
System.out.println("the sub string using start index only is "+str1.substring(0,4));
}
}

