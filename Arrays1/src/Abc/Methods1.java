package Abc;

public class Methods1 {

	public static void Sound()
	{
		System.out.println("animal makes sounds");
	}
	public static void main(String[] args) {
		Methods1.Sound();
		
	}
}
class Number extends Methods1
{
	public static void Sound()
	{
		System.out.println("dog makes sound bow bow");
		
	}
}
