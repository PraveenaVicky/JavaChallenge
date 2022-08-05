package JavaChallenge;

import java.util.LinkedHashMap;
import java.util.Map;

public class Tocountcharactersinlastword {

	public static void main(String[] args) {
		
		/*
		 * Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
		 */
		
		//if string is the last key.
		// then count characters..
		
		
		String input= "luffy is still joyboy";
		
		
		String[] str= input.split(" ");
	//	Map<String, Integer> obj =new LinkedHashMap<String, Integer>()	;
		 for (int i = 0; i < str.length; i++) {
			
		System.out.println(str[i]);
		//
		if(str[i]==str[str.length-1])
		{
			char[] charArray = str[str.length-1].toCharArray();	
			System.out.println(charArray.length);
		 	} 
		
		}
		 
	}
		}
		

		
		
		
