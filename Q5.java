//ANAGRAM

public class Q5 {
	static StringBuilder removeSpace(StringBuilder sb) {
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == ' ') {
				sb.deleteCharAt(i);
				i--;
			}
		}
		return sb;
	}

	public static void main(String[] args) {
		String s1 = "a gentleman";
		String s2 = "elegant man";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		StringBuilder sb1 = new StringBuilder(s1);
		StringBuilder sb2 = new StringBuilder(s2);
		sb1 = removeSpace(sb1);
		sb2 = removeSpace(sb2);

		if (sb1.length() == sb2.length()) {
			sb1 = sort(sb1);
			sb2 = sort(sb2);
		}
		System.out.println(sb1);
		System.out.println(sb2);
		boolean flag = true;
		for (int i = 0; i < sb1.length(); i++) {
			if (sb1.charAt(i) != sb2.charAt(i)) {
				System.out.println("The set of strings is not an Anagram.");
				break;
			} else {
				flag = false;
			}
		}
		if (flag == false) {
			System.out.println("The set of strings is Anagram.");
		}
	}

	static StringBuilder sort(StringBuilder sb) {
		int n = sb.length();
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (sb.charAt(j - 1) > sb.charAt(j)) {
					char temp = sb.charAt(j - 1);
					sb.setCharAt(j - 1, sb.charAt(j));
					sb.setCharAt(j, temp);

				}
			}

		}
		return sb;
	}

}
/*I THINK IF I HAD USED ARRAY, IT WOULD BE EASIER. BUT I DID IT USING STRINGBUILDER 
AND IT WORKED OUT TO BE A LITTLE LENGTHY.*/
