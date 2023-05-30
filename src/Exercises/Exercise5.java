package Exercises;
import java.util.Scanner;
public class Exercise5 {
	
	public static float sum(int i, int n, float s) {
		if (i > n) {
			return s;
		} else {
			s += (float) 1 / (i * (i - 1));

			return sum(i + 1, n, s);
		}

	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of n for function S(n) = ");
		int number = scanner.nextInt();
		float sumS = sum(2, number, 0);
		System.out.println("S("+number+") = " + sumS);
		
		scanner.close();
	}
}
