//NUMBER OF VOWELS, CONSONENTS AND SPECIAL CHARACTERS

public class Q4 {

	public static void main(String[] args) {
		String line = "I_am_fslrxa@gmail.com";
		int vowels = 0, consonants = 0, splchar = 0;
		line = line.toLowerCase();
		for (int i = 0; i < line.length(); ++i) {
			char ch = line.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			} else if ((ch >= 'a' && ch <= 'z')) {
				consonants++;
			} else
				splchar++;
		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		System.out.println("Special Characters: " + splchar);
	}
}