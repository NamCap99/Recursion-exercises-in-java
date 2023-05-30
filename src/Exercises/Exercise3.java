package Exercises;

import java.util.Scanner;

public class Exercise3 {
	
//	S(n) = 1 = 1/2 + 1/3 + ... 1/n
	public static float sum(int i, int n, float s ) {
		if (i > n) { // 1 > 0 => S(n)
			return s;
		}else {  // 1 < n
			s+= (float)1/i;
			
			return sum( i + 1, n, s); // i += 1 each time
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number n for function S(n): ");
		int number = scanner.nextInt();
		float sum_of_series = sum(1, number, 0);
		System.out.println("S("+number+") = " + sum_of_series);
		
		scanner.close();
	}
}
