package Switch_Loops;
import java.util.Scanner;
public class Arithematic {
public static void main(String[] args) {
	int a,b;
	char op;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter two integers");
	 a=obj.nextInt();
	 b=obj.nextInt();
	System.out.println("enter the operator");
	op=obj.next().charAt(0);
	switch(op)
	{
	case '+':
		System.out.format("%d+%d=%d\n",a,b,a+b);
		break;
	
	case '-':
	System.out.format("%d-%d=%d\n",a,b,a-b);
		break;

	 case '*':
	 System.out.format("%d*%d=%d\n",a,b,a*b);
		break;
	 case '/':
		 System.out.format("%d/%d=%d\n",a,b,a/b);
	default:
	   System.out.println("invaild input");

}
}
}
