package string_coding;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		 
		String s1 = "255.100.50.0";
		char[] ch = new char[s1.length()];
		for(int i = 0; i < ch.length; i++)
		{
			ch[i] = s1.charAt(i);
			if(ch[i] == '.')
			{
				System.out.print("[.]");
			}
			else
			{
				System.out.print(ch[i]);
			}
		}
	}
}
