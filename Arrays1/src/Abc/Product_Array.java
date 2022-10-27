package Abc;
public class Product_Array {
public static void main(String[] args) {
	int num[]= {100,150,200,250,300};
	int num1[]= {2,4,6,8};
	int sum=0;
	for(int i=0;i<num.length;i++)
	{
		sum +=num[i];
	}
	System.out.println("total sum : "+sum);

	for(int i=0;i<num1.length;i++)
	{
		sum +=num1[i];
	}
	System.out.println("total sum : "+sum);
}
}
