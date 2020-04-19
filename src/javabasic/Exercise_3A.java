package javabasic;

public class Exercise_3A {
	public static void main(String[] args) {
		String[] arrayString = new String[] { "Thành", "Vĩ", "Lâm", "Thương" };

		for (String name : arrayString) {
			if (name.equals("Thành")) {
				continue;
			}
			System.out.print(name + " ");
		}
	}
}
