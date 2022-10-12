package While_Loops;
import java.util.Scanner;
public class Lcm_Num {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	int num1=obj.nextInt();
	int num2=obj.nextInt();
	int lcm;
	if(num1>num2)
	{
		lcm=num1;	
	}
	else
	{
		lcm=num2;
	}
	while(true)
	{
		if(lcm%num1==0 && lcm%num2==0)
		{
          System.out.println("lcm is "+lcm);
          break;
		}
		++lcm;
	}
}
}