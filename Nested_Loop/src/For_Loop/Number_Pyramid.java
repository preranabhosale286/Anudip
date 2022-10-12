package For_Loop;

public class Number_Pyramid {
public static void main(String[] args) {
	int x=0;
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=x+1;j--)
		{
			System.out.print(j);
			
		}
		for(int k=x+1;k<=5;k++)
		{
			System.out.print(k);	
		}
		System.out.println();
		x=x+1;
	}
}
}
