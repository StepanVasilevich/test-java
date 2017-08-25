
import java.util.Scanner;
public class ProstNum 
 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число:");
		int n = in.nextInt();
	    System.out.println("Ваше число:" + n);
				int num, arg;
	  	for(num = 2; num <= n; num++)
	  	{
	  		for(arg = 2; (num % arg) > 0; arg++) {} 
	  		if(arg == num) System.out.println(num);
	  	}
	}
 }
	







