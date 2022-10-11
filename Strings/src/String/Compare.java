package String;
import java.util.Scanner;
public class Compare {
enum Level{LOW,MEDIUM,HIGH}
public static void main(String[] args) {
	String Str1="Helloworld";
	String Str2="Helloworld";
	System.out.println(Str1.compareToIgnoreCase(Str2));
	String s1="hello";
	String s2="hello";
	String s3=new String("hello");
	System.out.println(s1.equals(s3));
	System.out.println(s2 == s3);
	
}
}
