package string_coding;

public class ReverseString {
	public static void main(String[] args) {
		String s1 = "priya";
		
//		for(int i = s1.length() - 1; i >= 0; i--)
//		{
//			System.out.print(s1.charAt(i));
//		}
		char[] e1 = s1.toCharArray();
		for(int i = 0; i < e1.length / 2; i++)
		{
			char temp = e1[i];
			e1[i] = e1[e1.length - 1 - i];
			e1[e1.length - 1 - i] = temp;
		}
		s1 = new String(e1);
		System.out.println(s1);
	}
}
