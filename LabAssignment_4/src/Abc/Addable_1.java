package Abc;
import java.util.stream.IntStream;

interface Addable
{
	public int add(int a,int b);
}
public class Addable_1 
{
  public static void main(String[] args)
  {
	  Addable A=(x,y)->
	  {
		  return x+y;
	  };
	  System.out.println(A.add(10, 20));
	  String st = "eclipse";
	  IntStream.range(0, st.length())
.mapToObj(i -> i == 0 ? Character.toUpperCase(st.charAt(i)) : st.charAt(i))
	           .forEach(System.out::print);
  }
}