package While_Loops;
import java.util.Scanner;
public class Num {
public static void main(String[] args) {
Scanner obj=new Scanner(System.in);
int num=obj.nextInt();
int sum=0;
while(num!=0)
{
	sum=+num;
	num=obj.nextInt();
}
System.out.println(sum);
}
}
