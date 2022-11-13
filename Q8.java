//MAXIMUM OCCURING CHARACTER (I just changed Q2 code a little.)

public class Q8 {
	public static void main(String [] args) {
		String s = "Apple is good for health";
		s = s.toUpperCase();
		StringBuilder sb = new StringBuilder(s);
		sb = removeSpace(sb);
		int length = sb.length();
		int max = 0;
		char charMax = ' ';
		for(int i = 0; i<length; i++)
		{
			int count = 1;
			for(int j = i+1; j<length; j++)
			{
				if(sb.charAt(i)==sb.charAt(j))
				{
					count++;
					sb.deleteCharAt(j);
					length--;
				}
			}
			if (count>max)
			{
			max = count;
			charMax = sb.charAt(i);
			
			}
			
		}
		System.out.println("Character '" + charMax + "' appears maximum time.");
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
