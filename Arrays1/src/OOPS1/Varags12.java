package OOPS1;
import java.util.Scanner;
import static java.lang.System.*;
public class Varags12 {
public static void walk1(int number ,int number2, int...num1)
{
	System.out.println("number1 : "+number);
	System.out.println("number2 : "+number2);
	for(int i=0;i<num1.length;i++)
	{
		System.out.println("varags : "+num1[i]);
	}
}
public static void main(String[] args) {
	walk1(1,2,3,4,5,6,7,8,9);//walk1(1,2,"red","blue","yellow");
	
}
}
class Demo
{
	
}
