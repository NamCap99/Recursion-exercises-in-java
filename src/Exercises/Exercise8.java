package Exercises;

import java.util.Scanner;

public class Exercise8 {
	public static int sumCount(int count, int n, int s) {
		System.out.println("");
		if (count > n) {

			return s;
		} else {
			s = count ;
			System.out.print(s+ " ");
			return sumCount(count + 1, n, s);
		}
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of n for T(n): ");
		int number = scanner.nextInt();
		int sumS = sumCount(1,number, 0);
		System.out.println("\nAll positive number from 1 to "+ number+" is " + sumS + " number(s).");
		scanner.close();
	}
}
