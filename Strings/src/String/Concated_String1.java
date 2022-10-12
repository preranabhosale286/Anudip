package String;
import java.util.Scanner;
public class Concated_String1 {
public static void main(String[] args) {
	System.out.println("enter string");
	Scanner Hd=new Scanner(System.in);
	String a=Hd.nextLine();
	System.out.println("enter second string");
	String b=Hd.nextLine();
	System.out.println(a.concat(b));
	System.out.println(a+""+b);
	
}
}
