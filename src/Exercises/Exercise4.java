package Exercises;

import java.util.Scanner;

public class Exercise4 {
	
//	S(n) = 1/2 + 1/4 + ... + 1/2n
/*	Công thức là: 
 * 1) chúng ta sẽ cho biến check luôn luôn + 1 mỗi lần recursion và khi check = n thì dừng
 * 2) biến i = 1 và luôn x2 sau mỗi lần recursion
 * s += (float) 1/i
 * **/
	
	public static float sum(int check, int i, int n, float s) {
		if(check > n) { // 1 > 0 => S(n) = 0 
			return s;
		}else { // 1 < n
			s += (float)1/(i*2);
			
			return sum(check + 1, i+1, n, s);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of n for function S(n): ");
		int number = scanner.nextInt();
		float sum_of_series = sum(1, 1, number, 0);
		System.out.println("S("+number+") = "+sum_of_series);
		
		scanner.close();
	}
}
