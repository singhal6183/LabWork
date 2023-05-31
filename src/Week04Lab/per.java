package Week04Lab;

import java.util.*;

public class per {
	public static void main(String[] args) {
	
	
		//public static boolean palindrome(String word) {
		String word = "kayak";
			String revWord="";
			for(int i=0;i<word.length(); i++) {
				revWord+= word.charAt(word.length()-i-1);
			}
			
			if(word.equals(revWord))
			{
				System.out.println("hh");
				}else
				{System.out.println(revWord);}
			
		}

}