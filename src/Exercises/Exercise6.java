package Exercises;

import java.util.Scanner;

public class Exercise6 {
	public static int sum(int condition, int x, int n, int s) {
		if(condition > n) {
			return s;
		}else {
			s+= Math.pow(x, condition);
			
			return sum(condition + 1, x, n, s);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of x and n for function S(x,n)");
		System.out.print("number x =  ");
		int x = scanner.nextInt();
		System.out.print("number n = ");
		int n = scanner.nextInt();
		int sumS = sum(1, x, n, 0);
		
		System.out.println("Sum of S("+x+","+n+") = "+sumS);
		scanner.close();
	}
}
