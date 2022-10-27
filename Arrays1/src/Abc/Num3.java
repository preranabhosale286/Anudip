package Abc;

public class Num3 {
public static void main(String[] args) {
	int sum=0;
	int a[][]= {{1,3,4},{2,4,3}};
	int b[][]=new int[3][2];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			b[j][i]=a[i][j];
			
		}
	}
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b[i].length;j++)
		{
			System.out.println(b[i][j]+" ");
		}
		System.out.println();
	}
}
}
