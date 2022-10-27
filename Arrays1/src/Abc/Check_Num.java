package Abc;
import java.util.Scanner;
public class Check_Num {
public static void main(String[] args) {
	System.out.println("Enter number");
	int []my_array1= {1789,2035,1899,1456,2013,1458,2458};
	Scanner obj=new Scanner(System.in);
	int a=obj.nextInt();

	for(int y:my_array1)
	{
		if(y == a)
		{
			System.out.println("this number is an  array");
	}
		else
		{
			System.out.println("this is not an array");
		}
	
}
}
}