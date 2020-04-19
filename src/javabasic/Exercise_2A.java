package javabasic;

public class Exercise_2A {
	public static void main(String[] args) {
		int a = 500;
		for (int i = 0; i <= a; i++) {
			if (i == 300 || i == 450) {
				continue;
			}
			System.out.println(i);
		}
	}
}
