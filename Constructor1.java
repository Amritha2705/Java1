class Employee{
<<<<<<< HEAD
int eno;
String eName;
Employee()
{
eno=100;
eName="Amritha";
}
void show()
{
System.out.println("\n Employee No:"+eno+"\n Employee name:"+eName);
}
}
class Constructor1
{
public static void main(String args[])
{
Employee obj1=new Employee();
obj1.show();
}
}
=======
int empno;
String eName;
Employee(){
empno = 100;
eName = "Amrita";
}
void show()
{
System.out.println("\n Employee No: " + empno + "\n Employee Name: " + eName);
}
}
class Constructor1{
public static void main(String args[])
{
Employee obj1 = new Employee();
obj1.show();
}
}

>>>>>>> 9da279c4f460731899eb2398eb794d392ab866e8
