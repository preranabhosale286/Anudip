package String;
import java.util.Scanner;
public class Reverse_String {
public static void main(String[] args) {
	String Str="MALAYALAM";
	Str=Str.toLowerCase();
	System.out.println(Str);
	String reversestr=" ";
	for(int i=Str.length()-1;i>=0;i--)
	{
		reversestr +=Str.charAt(i);
		
	}
	if(Str.equals(reversestr))
	{
		System.out.println("this is palindrome string"+Str);
		
	}
}
}
