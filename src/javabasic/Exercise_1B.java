package javabasic;

public class Exercise_1B {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 5, 98, 43 };

		int sum = 0;

		int i = 0;
		while (i < array.length - 1) {
			sum += array[i] + array[i + 1];
			i++;
		}

		System.out.println("Sum is: " + sum);
	}
}
