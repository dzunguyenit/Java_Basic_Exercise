package javabasic;

public class Exercise_1A {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 5, 98, 43 };

		int sum = 0;
		for (int i = 0; i < array.length - 1; i++) {
			sum += array[i] + array[i + 1];
		}

		System.out.println("Sum is: " + sum);
	}
}
