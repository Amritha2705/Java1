class Box{
double width;
double height;
double depth;
double volume()
{
return width*height*depth;
}
void setDim(double w, double h,double d)
{
width=w;
height=h;
depth=d;
}
}
class ClassDemo5{
public static void main(String[] args){
Box mybox1=new Box();
double vol;
mybox1.setDim(10,20,15);
vol=mybox1.volume();
System.out.println("volume" +vol);
}
}
