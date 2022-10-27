package Constructors12;

public class Car_Model {
int modelYear;
 String modelName;
 public Car_Model (int year,String name)
 {
	 modelYear=year;
	 modelName=name;
	 
 }
 public static void main(String[] args) {
	Car_Model myCar=new Car_Model(1999,"mustang");
	System.out.println(myCar.modelYear+" "+myCar.modelName);
}
}
