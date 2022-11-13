//PANGRAM (I am assuming that pangram only contains alphabets and not digits or symbols)

public class Q6 {
	public static void main (String[] args)
	{
		String str = "Quick brown fox jumps over the lazy dog"; 
		str = str.toLowerCase();
		StringBuilder sb = new StringBuilder(str);
		sb = removeSpace(sb);
		sb = deleteDuplicate(sb);
		if(sb.length()==26)
		{
			System.out.println("Given string is a pangram."); //Because after removing space and duplicates, only unique alphabets should be present.
		}
		else
		{
			System.out.println("Given string is not a pangram.");
		}
	}

	static StringBuilder deleteDuplicate(StringBuilder sb) {
		int length = sb.length();
		for(int i = 0; i<length; i++)
		{
			for(int j = i+1; j<length; j++)
			{
				if(sb.charAt(i)==sb.charAt(j))
				{
					sb.deleteCharAt(j);
					length--;
				}
			}
		}
		return sb;
	}

	static StringBuilder removeSpace(StringBuilder sb) {
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == ' ') {
				sb.deleteCharAt(i);
				i--;
			}
		}
		return sb;
	}
}
