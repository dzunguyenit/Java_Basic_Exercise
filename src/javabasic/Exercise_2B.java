package javabasic;

public class Exercise_2B {
	public static void main(String[] args) {
		int a = 500;
		int sum = 0;
		for (int i = 0; i <= a; i++) {
			if (i == 300 || i == 450) {
				continue;
			}
			sum += i;
		}

		System.out.println("Sum is: " + sum);
	}
}
