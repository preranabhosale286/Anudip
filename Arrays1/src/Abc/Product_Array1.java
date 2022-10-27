package Abc;
public class Product_Array1 {
public static void main(String[] args) {
	int num[]= {2,4,6,8};
	int sum=1;
	for(int x:num)
	{
		sum+=x;
	}
	System.out.println("total avervage : "+(sum/num.length));	
}
}
