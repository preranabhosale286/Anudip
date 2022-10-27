package Constructors12;
public class Num1 {
int x,a;
public Num1(int y,int z)
{
	x=y;
	a=z;
}
public static void main(String[] args) {
Num1 myObj=new Num1(5,7);
System.out.println(myObj.x);
System.out.println(myObj.a);
}
}
