import java.util.Scanner;

public class LC_3 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Input: ");
		String word = console.next();
		System.out.println("Output: " + lengthOfLongestSubstring(word));
	}
	
	public static int lengthOfLongestSubstring(String s) {
		String temp = "";			//Stores the words from String s
		int count = 0, max = count;				//max will be returned 
		int j = 0;
		for(int i = 0; i < s.length(); i++) {	//
			if(isUnique(s.charAt(i), temp)) {
				temp += s.charAt(i);
				count++;
				j = temp.length();
				max = Integer.max(max, count);
			}else {
				System.out.println(temp.length() + " i: " + i);
				System.out.println(temp.length() + " < " + i + "? : " + (temp.length() < i));
				if(temp.length() < i) {
					if(temp.charAt(i - 1) == s.charAt(i)) {
						temp = "" + s.charAt(i);
						count = 1;
					}else {
						temp = "" + s.charAt(i - 1) + s.charAt(i);
						count = 2;
					}
				}
				
			}
		}
		return max;
	}	
	
	public static boolean isUnique(char c, String temp) {
		for(int i = 0; i < temp.length(); i++) {
			if(temp.charAt(i) == c)
				return false;
		}	
		return true;
	}
}
