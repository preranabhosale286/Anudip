package For_Loop;
import java.util.Scanner;
public class Down_Pyramid {
public static void main(String[] args) {
	for(int i=5;i<=10;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
