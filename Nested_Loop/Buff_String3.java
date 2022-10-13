package Buffer123;
import java.util.Scanner;
public class Buff_String3 {
public static void main(String[] args) {
	String str2=("world");
	StringBuffer sb=new StringBuffer("Hello");
	sb.append("Folks");
//	System.out.println(str);
	System.out.println(sb);
	sb.insert(10,"java");
	System.out.println(sb);
}
}
