package hw03;

public class NameLength {
	public int result;
	public int nameLengthAverage(String[] names) {
		for (String name: names) {
			result= result+ name.length();
		}
		return result/names.length;
	}

	public static void main(String[] args) {
		NameLength nameLength = new NameLength();
		String[] names={"Jakab", "Eufrozina","John", "Magdi"};
		System.out.println(nameLength.nameLengthAverage(names));
	}
}
