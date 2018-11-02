package hw03;

public class NameLength {
	// public int result;
	public int nameLengthAverage(String[] names) {
		int result2 = 0;
		for (String name : names) {
			result2 = result2 + name.length();
		}
		return result2 / names.length;
	}

	public void minMaxLength(String[] input) {
		String minLength = input[0];
		String maxLength = input[0];
		for (String element : input) {
			if (element.length() > maxLength.length()) {
				maxLength = element;
			} else if (element.length() < minLength.length()) {
				minLength = element;
			}
			System.out.println(element);
		}
		System.out.println("Shortest name: "+minLength+" (" +minLength.length()+")");
		System.out.println("Longest name: "+maxLength+" (" +maxLength.length()+")");


	}

	public static void main(String[] args) {
		NameLength nameLength = new NameLength();
		String[] names = { "Jakab", "Eufrozina", "John", "Magdi" };
		// System.out.println(nameLength.nameLengthAverage(names));
		nameLength.minMaxLength(names);
		nameLength.minMaxLength(new String[]{"Alfonz"});
	}

}
