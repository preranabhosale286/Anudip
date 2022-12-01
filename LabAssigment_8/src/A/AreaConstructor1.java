package A;

class AreaConstructor1
{
	private double pi;
	private int r;
	
	 public int getR() // getter method
	 {
		return r;
	}

	public void setR(int r) // setter method
	{
		this.r = r;
	}

	public AreaConstructor1(int r) // parameterized constructor
	{
		super();
		this.r = r;
	}

	public void Area() // method
	{	
		 double pi=3.14;
		 double area=pi*r*r;  //calculate area of circle
		 System.out.println("Area of circle is :"+area);
		 
	}
}

public class AreaConstructor1 
{

	public static void main(String[] args) 
	{
		// constructor overloading
		AreaConstructor1 c = new AreaConstructor1(4);  // parameter pass
		c.Area();
		AreaConstructor1 c1=new AreaConstructor1(20);  // parameter pass
		c1.Area();
	}

}