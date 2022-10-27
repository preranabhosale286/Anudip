package OOPS1;
import java.util.Scanner;
public class Twin_Prime_Num {
public static void main(String[] args) {
	        int num1 = 76;
	        int num2 =43;
	        if (prime(num1) && prime(num2) && (Math.abs(num1 - num2) == 2))
	        {
	         System.out.println(num1+" and "+num2+" are Twin Primes");
	        }
	        else
	        {
	        System.out.println(num1+" and "+num2+" are Not Twin Primes");
	        }
	    }
	    static boolean prime(int num)
	    {
	        int iter = 2;
	        boolean flag = true;
	        while (num > iter)
	        {
	            if (num % iter == 0)
	            {
	                flag = false;
	                break;
	            }
	            iter++;
	        }
	        return flag;
	    }
	
}

