package Abc;
import java.util.Scanner;
public class Max_MinArray2 {
public static void main(String[] args) {
	int []Array= {25,14,56,15,36,56,77,18,29,49};
	int max=0;
	for(int x:Array)
	{
	if(x>max)
	{
		max=x;
	}
	}
		System.out.println(max);
		
}
}
