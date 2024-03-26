class Product
{
int p_code;
String p_name;
int p_price;
Product(int code,String name,int price){
p_code=code;
p_name=name;
p_price=price;
}
void display(){
System.out.println("product code: "+p_code);
System.out.println("product name: "+p_name);
System.out.println("product price: "+p_price);
}
}
class Program1{
public static void main(String args[])
{
Product ob1=new Product(123,"pen",10);
Product ob2=new Product(145,"book",20);
Product ob3=new Product(122,"pencil",30);
System.out.println("\nProduct with lowest price");
if(ob1.p_price<ob2.p_price)
if(ob1.p_price<ob3.p_price)
ob1.display();
else
ob3.display();
else if(ob3.p_price<ob2.p_price)
ob3.display();
else
ob2.display();
}
}


