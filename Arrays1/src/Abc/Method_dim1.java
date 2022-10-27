package Abc;
public class Method_dim1 {
public static void display(String name) {
	System.out.println("hello " +name);	
}
public static void main(String[] args) {
	Method_dim1 obj=new Method_dim1(); //nonstatic method
	display("Prerana");//static method
}
}
