package Ass1;
import java.util.Scanner;
public class Kids {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	System.out.println("enter the sides:");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if(a<b+c && b<a+c && c<a+b)
	{
		if(a==b && b==c)
			System.out.println("kid will get 1st prize");
		else if(a==b || b==c || c==a)
			System.out.println("kid will get 2nd prize");
		else
			System.out.println("kid will get 3rd prize");
	}
	else
	System.out.println("Cannot form a triangle");
}
}

