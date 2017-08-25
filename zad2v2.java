
import java.util.Scanner;
public class Zad1Var2
 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число ->");
		int n = in.nextInt();
	    System.out.println("Ваше Число->" + n);
				int num, arg;
	  	for(num = 2; num <= n; num++)
	  	{
	  		for(arg = 2; (num % arg) > 0; arg++) {}
	  		
	  		if(arg == num) System.out.println(num + "--простое число");
	  		else System.out.println(num+"--составное");
	  	}
	}
 }
	







