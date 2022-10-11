package String;
public class Spilt_No {
public static void main(String[] args) {
	String text="java is a fun programming langauge";
	String num="11#22#33#44#55";
	String[] result=num.split(" #");
	String[]res= {"11","22","33","44","55"};
	System.out.println(result);
	for(String i:result)
	{
		if(i.equals("11"))
		System.out.println(i);
		
	}
}
}
