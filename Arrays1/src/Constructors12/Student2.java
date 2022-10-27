package Constructors12;

public class Student2 {
int id;
String name;
Student2(int i,String n)
{
	id=i;
	name=n;
}
void display()
{
	System.out.println(id+" "+name);
}
public static void main(String[] args) {
	Student2 s1=new Student2(111,"prerana");
	Student2 s2=new Student2(333,"priya");
	s1.display();
	s2.display();
	
}
}

