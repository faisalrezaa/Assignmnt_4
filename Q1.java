//DELETE DUPLICATE

public class Q1 {
	public static void main(String [] args) {
		String s = "BANANA";
		StringBuilder sb = new StringBuilder(s);
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
		String ss = sb.toString();
		System.out.println(ss);
	}
}
