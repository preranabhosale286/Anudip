package String;
import java.util.Scanner;
public class Concat_String2 {
public static void main(String[] args) {
	System.out.println("enter the value");
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String str2 = sc.nextLine();
	System.out.println(str.isEmpty());
	System.out.println(str.concat(str2));
	String s = "";
	System.out.println(s.isEmpty());
	String s1 = " ";
	System.out.println(s1.isEmpty());
	String s2 = "bat and ball";
	System.out.println(s2.replace('b','c'));
	System.out.println(s2.indexOf("and"));
	String s3 = "play";
	System.out.println(s2.concat(s3));
}
}
