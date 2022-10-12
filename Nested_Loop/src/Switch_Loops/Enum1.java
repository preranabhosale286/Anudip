package Switch_Loops;
public class Enum1 {	
enum Level{LOW,HIGH,MEDIUM};
public static void main(String[] args) {
Level var=Level.HIGH;
//System.out.println(var);
switch(var)
{
case HIGH:
	System.out.println("High volume");
	break;

case LOW:
	System.out.println("low volume");
	break;

case MEDIUM:
	System.out.println("medium volume");
	break;
}
}
}
