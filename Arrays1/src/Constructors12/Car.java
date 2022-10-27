package Constructors12;//imp access modifier,oops,overloading,overriding,string
//multithreading 
public class Car {
	public static void main(String[] args) {
		Car obj1=new Car("bmw",300,"black");
		obj1.display();
	}
String brand;
int speed;
String color;
Car(String b,int s,String c)
{
	brand=b;
	speed=s;
	color=c;
}
public void display()
{
	System.out.println(brand+" "+speed+" "+color);
}

}
