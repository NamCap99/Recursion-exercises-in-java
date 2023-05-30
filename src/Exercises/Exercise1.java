package Exercises;

import java.util.Scanner;

public class Exercise1 {
//	 T(n) = 1/2 + 2/3 + 3/4 + ... + n/(n + 1)
	public static float sum(int i, int n, float s) {
		if (i > n) {
			return s;
		} else {
			s += (float)i/(i+1);
			
			return sum(i + 1, n, s);
		}
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of n for T(n): ");
		int number = scanner.nextInt();
		float sumS = sum(1,number, 0);
		System.out.println("T(" + number + ") = " + sumS);
		scanner.close();
	}
}
