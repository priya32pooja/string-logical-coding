package string_coding;

public class RetainingWhiteSpace {
	public static void main(String[] args) {
		String s1 = "hello sir how are you";
		String s2 = "";
		
		for(int i = 0, j = s1.length() - 1; j >= 0; i++, j--)
		{
			if(s1.charAt(i) ==' ')
			{
				s2 +=' ';
				j++;
				continue;
			}
			if(s1.charAt(j) !=' ')
			{
				s2 += s1.charAt(j);
			}
			else
			{
				i--;
			}
		}
		System.out.println(s1);
		System.out.println(s2);
	}
}

// reverse the string by retaining white spaces