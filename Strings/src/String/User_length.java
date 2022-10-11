package String;
import java.util.Scanner;
public class User_length {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter string");
	String s1=obj.next();
	if(s1.length()>7)
	{
		System.out.println(s1);
	}
}
}
