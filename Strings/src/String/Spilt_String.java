package String;
import java.util.Scanner;
public class Spilt_String {
public static void main(String[] args) {
	String text="java is a fun programming langauge";
	String[] result=text.split(" ");
	for(String i:result)
	{
		System.out.println(i);
		
	}
}
}
