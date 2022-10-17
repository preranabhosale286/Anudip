package Ass1;
import java.util.Scanner;
public class Teacher {
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the roll no");
			int x=sc.nextInt();
			if(x%4==1)
			{
				System.out.println("Sapphire");
				
			}
			else
				if(x%4==2)
				{
					System.out.println("Perl");
					
				}
				else if(x%4==3)
				{
					System.out.println("Ruby");
				}
			if(x%4==0)
			{
				System.out.println("Emerald");
			}
				}
		}

