package String;
import java.util.Scanner;

enum Level{LOW,MEDIUM,HIGH}
public class Spilt_Mul {	
public static void main(String[] args) {
	System.out.println("enter the string");
	Scanner obj=new Scanner(System.in);
	String num=obj.nextLine();
	String[]numarr=num.split(",");
	int mul=1;
	for(String i:numarr)
	{
		mul *=Integer.parseInt(i);
	}
	System.out.println("multiplication of 5 numbers are :"+mul);



}
}