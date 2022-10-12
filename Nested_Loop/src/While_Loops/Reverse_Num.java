package While_Loops;
import java.util.Scanner;
public class Reverse_Num {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int reverse=0,reminder;
		while(num>0)
		{
			reminder=num%10;
			reverse=reverse*10+reminder;
			num=num/10;
		}
		System.out.println("reverse number="+reverse);
		}
	}


