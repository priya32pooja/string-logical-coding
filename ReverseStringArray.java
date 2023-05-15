package string_coding;

public class ReverseStringArray {
	public static void main(String[] args) {
		String s1 = "pooja";
		char ch[] = s1.toCharArray();
		
		for(int i = s1.length() - 1; i >= 0; i--)
		{
			System.out.print(ch[i]);
		}
	}
}
