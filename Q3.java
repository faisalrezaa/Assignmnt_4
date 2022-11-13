//CHECK PALINDROME

public class Q3 {
	public static void main(String[] args)
	{
		String s = "2552";
		int start = 0;
		int last = s.length()-1;
		boolean flag = true;
		while(s.charAt(start)==s.charAt(last))
		{
			start++;
			last--;
			if(start==s.length()/2) 
			{
				System.out.println(s+" is palindrome.");
				flag = false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(s+" is not a palindrome.");
		}
	}
}
