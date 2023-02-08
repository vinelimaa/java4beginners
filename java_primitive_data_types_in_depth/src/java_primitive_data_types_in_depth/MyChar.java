package java_primitive_data_types_in_depth;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public char getMyChar() {
		return ch;
	}

	public void setMyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U')
			return true;
		return false;
	}

	public boolean isConsonant() {
		if (isAlphabet() && !isVowel())
			return true;
		return false;
	}

	public boolean isNumber() {
		if (ch >= 48 && ch <= 57)
			return true;
		return false;
	}

	public boolean isAlphabet() {
		if (ch >= 65 && ch <= 122)
			return true;
		return false;
	}

	public static void printLowerCaseAlphabets() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}

	public static void printUpperCaseAlphabets() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}
}
