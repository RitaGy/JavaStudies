package hw03;

public class NameLength {
	//public int result;
	public int nameLengthAverage(String[] names) {
		int result2 = 0;
		for (String name: names) {
			result2= result2+ name.length();
		}
		return result2/names.length;
	}

	public static void main(String[] args) {
		NameLength nameLength = new NameLength();
		String[] names={"Jakab", "Eufrozina","John", "Magdi"};
		System.out.println(nameLength.nameLengthAverage(names));
	}
}
