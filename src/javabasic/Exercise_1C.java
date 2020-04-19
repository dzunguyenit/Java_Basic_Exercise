package javabasic;

public class Exercise_1C {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 5, 98, 43 };

		int sum = 0;

		int i = 0;

		do {
			sum += array[i] + array[i + 1];
			i++;
		} while (i < array.length - 1);

		System.out.println("Sum is: " + sum);
	}
}
