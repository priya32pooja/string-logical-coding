package string_coding;

import java.util.HashMap;
import java.util.Map;

public class Occurrence {
	public static void main(String[] args) {
		String str = "string";
		int[] charCountArray = new int[256]; // assuming ASCII character set

		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		    charCountArray[ch]++;
		}
		for (int i = 0; i < charCountArray.length; i++) {
		    if (charCountArray[i] > 0) {
		        System.out.println("'" + (char)i + "': " + charCountArray[i]);
		    }
		}
	}
}
