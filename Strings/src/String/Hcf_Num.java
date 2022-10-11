package String;
public class Hcf_Num {
public static void main(String[] args) {
	int num1=8;
	int num2=12;
	int a,hcf=0;
	for(a=1;a<=num1 || a<=num2;a++)
	{
		if(num1%a==0 && num2%a==0)
		{
			hcf=a;
		}
		System.out.println(hcf);
	}
}
}
