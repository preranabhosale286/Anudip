package For_Loop;
public class Triangle {
public static void main(String[] args) {
	int i;// rows
	int j;//columns
	int num=6;
	for(i=1;i<=num;i++) // i=1 ,1<7,1++ (1) 
	{
		for(j=0;j<i;j++)// j=0,0<=1,0++ (2)
		{
			System.out.print("*"); 
			
		}
		System.out.println(" ");
	}
	}
}
