import java.util.Scanner;
import java.io.*;
public class FibbNach {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//try {
		System.out.print("Введите число ->");
				int n = in.nextInt();
		
	    System.out.println("Ваше Число->" + n);
		//} catch (IOException e)
//	{
//			System.err.print("Error ......" + e);
//	}
        long a = 1, b = 1;
        System.out.print(a + " " + b);
       long fibnum = 2, i = 2;
        while (i < n) {
            fibnum = a + b;
            a = b;
            b = fibnum;
            System.out.print(" " + fibnum);
            i++;
        }
    }

		
		
		// TODO Auto-generated method stub

	}

