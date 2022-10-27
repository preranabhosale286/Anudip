package OOPS1;
public class Student {
public static void main(String[] args) {
		Student obj1=new Student("Prerana"+" ",4106,"Bajaj colany");
		obj1.display();
	}
String name;
int rollno;
String address;
Student(String n,int r,String a)
{
	name=n;
	rollno=r;
	address=a;
}
public void display()
{
	System.out.println(rollno+" "+name+" "+address);
}
}


