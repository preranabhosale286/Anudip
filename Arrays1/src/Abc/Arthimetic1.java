package Abc;
public class Arthimetic1 {
static int sum1(int a,int b)
{
return a+b;
}
static int sub(int a,int b)
{
return a-b;

}
static int mul(int a,int b)
{
return a*b;

}
static int div(int a,int b)
{
return a/b;
}
public static void main(String[] args) {
	System.out.println("addition:"+sum1(8,7));
	System.out.println("subtraction:"+sub(8,7));
	System.out.println("multiplication:"+mul(8,7));
	System.out.println("division:"+div(8,7));
}
}
