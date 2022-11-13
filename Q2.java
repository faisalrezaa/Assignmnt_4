//PRINT DUPLICATES

public class Q2 {
	public static void main(String [] args) {
		String s = "BANANATOMATO";
		StringBuilder sb = new StringBuilder(s);
		int length = sb.length();
		boolean flag = true;
		
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
					flag = false;
				}
			}
			if(count>1)
			{
				System.out.println("Char " + sb.charAt(i) + " is present " + count + " times.");
			}
			
		}
		if(flag == true)
		{
		System.out.println("No duplicates found.");	
		}
	}
}
