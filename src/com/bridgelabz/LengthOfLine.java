/**
 * 
 */
package com.bridgelabz;
import java.util.*;
import java.math.*;
/**
 * @author Dell
 *
 */
public class LengthOfLine {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1,y1,x2,y2 respectively");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		double a = Math.pow(x2-x1 , 2);
		double b = Math.pow(y2-y1 , 2);
		double length = Math.sqrt(a+b);
		System.out.println("Lenght of line between points (" +x1+ "," +y1+ ") and (" +x2+ "," +y2+ ") is "+length);

		sc.close();
	}

}
