package Ass1;
import java.util.Scanner;
public class Num {
public static void main(String[] args) {

Scanner scan= new Scanner (System.in);

System.out.print("Enter the number: ");

 int n=scan.nextInt();

  for (int i = 1; i < n+1; i++) {

for (int k=1; k<n+1-i; k++)
{
	System.out.print("");
	
}

for (int k=1; k<i+1; k++)  
{
	System.out.print(k);
}

for (int k=i-1; k>0; k-=1) 
{
	System.out.print(k);
}

 System.out.println();
}
} 
}