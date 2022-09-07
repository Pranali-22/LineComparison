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
		System.out.println("Enter points for first1 line x1,y1,x2,y2 respectively");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		System.out.println("Enter points for second line x3,y3,x4,y4 respectively"); 
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();

		double a1 = Math.pow(x2-x1 , 2);
		double b1 = Math.pow(y2-y1 , 2);
		double length1 = Math.sqrt(a1+b1);
		System.out.println("Lenght of line between points (" +x1+ "," +y1+ ") and (" +x2+ "," +y2+ ") = "+length1);

		double a2 = Math.pow(x4-x3 , 2);
		double b2 = Math.pow(y4-y3 , 2);
		double length2 = Math.sqrt(a2+b2);
		System.out.println("Lenght of line between points (" +x3+ "," +y3+ ") and (" +x4+ "," +y4+ ") = "+length2);

		if(length1==length2) {
			System.out.println("Both lines are equal");
		}
		else{
			System.out.println("Both lines are not equal");
		}

		sc.close();
	}

}
