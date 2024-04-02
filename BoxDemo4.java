class Box{
double width;
double height;
double depth;
double volume()
{
return width*height*depth;
}
}
class BoxDemo4{
public static void main(String[] args)
{
Box mybox1=new Box();
double vol;
mybox1.width=10;
mybox1.height=20;
mybox1.depth=15;
vol=mybox1.volume();
System.out.println("volume is"+vol);
}
}

