package OOPS1;
import java.util.Scanner;
public class Vowels {
	void findVowelOrNot(char ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
		System.out.println("Entered character "+ch+" is  Vowel"); 
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			System.out.println("Entered character "+ch+" is Consonent");
		      else
			System.out.println("Not an alphabet");		
	}
	public static void main(String[ ] arg)
	{
		 Vowels  c = new Vowels();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character : ");
		char in=sc.next( ).charAt(0);	 		
		c.findVowelOrNot(in);
	}

}