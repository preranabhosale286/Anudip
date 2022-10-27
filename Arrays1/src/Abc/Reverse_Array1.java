package Abc;
public class Reverse_Array1 {
public static void main(String[] args) {
	int[] Array= {75,4,56,5,36,65,77,18,29,94};
	int n=Array.length;
	int temp=0;
	for(int i=0;i<Array.length/2;i++)
	{
		temp=Array[n-1-i];
		Array[n-1-i]=Array[i];
		Array[i]=temp;
	}
	for(int i=0;i<Array.length;i++)
	{
		System.out.println(Array[i]);
		
	}
}
}
