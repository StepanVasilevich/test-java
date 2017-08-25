import java.util.Scanner;
import java.io.*;
public class MinusNums {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите текст ->");
		String text = in.nextLine();
		 String text2 =  new String (text).replaceAll("[0-9]", "");
		 System.out.println(text2);	
	}

}




	
		

		
