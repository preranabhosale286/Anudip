package Abc;
public class Methods2 {
	public static int absolute(int num)
	{
		if (num>=0)
			return num;
		else
	return -num;
	}
	
	public static void main(String[] args) {
	System.out.println(Methods2.absolute(5));
	System.out.println(Methods2.absolute(-7));
	}
}
class Number1 extends Methods2
{
	public static void Sound()
	{
		System.out.println("dog makes sound bow bow");
		
	}
}


