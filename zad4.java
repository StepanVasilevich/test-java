import java.io.*;
import java.util.Scanner;
  public class PalinDrom {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//InputStreamReader q = new InputStreamReader(System.in);
		
	      System.out.println("Введите слово, которое необходимо перевернуть:"); 
		     String orig = in.next();
	          String palindrom = new StringBuffer(orig).reverse().toString();
	         if (palindrom .equals  (orig))  {
	        		 
	            System.out.print(orig+" слово палиндром");
	          }
	          else System.out.println("Слово не палиндромно");
		        

}}
	

	        
	      