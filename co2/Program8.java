import java.util.Scanner;
public class Program8
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.print("enter the number of words :");
int size =sc.nextInt();
String[] words=new String[size];
System.out.println("Enter the words");
for(int i=0;i<size;i++)
words[i]=sc.next();
System.out.print("enter the word to search: ");
String searchWord=sc.next();
boolean found= false;
for(String word: words)
{
if(word.equals(searchWord))
{
found=true;
break;
}
}
if(found)
System.out.println("the word " +searchWord+ " is found");
else
System.out.println("the word " +searchWord+ " is not found");
}
}
