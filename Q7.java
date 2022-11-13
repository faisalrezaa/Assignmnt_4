//ALL UNIQUE OR NOT

public class Q7 {
	public static void main(String [] args) {
		String s = "Quick fox";
		s = s.toLowerCase();
		StringBuilder sb = new StringBuilder(s);
		sb = removeSpace(sb);
		boolean flag = true;
		for(int i = 0; i<sb.length(); i++)
		{
			for(int j = i+1; j<sb.length(); j++)
			{
				if(sb.charAt(i)==sb.charAt(j))
				{
					System.out.println("String doesn't contain all unique characters.");
					flag = false;
				}
			}
		}
		if(flag == true)
		{
			System.out.println("String contains all unique characters.");
		}
	}
	static StringBuilder removeSpace(StringBuilder sb)
	{
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == ' ') {
				sb.deleteCharAt(i);
				i--;
			}
		}
		return sb;
	}
}
