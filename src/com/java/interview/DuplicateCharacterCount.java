package com.java.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacterCount {

	private static void subMethodUsingMap() {

		Map<Character, Integer> m = new HashMap<>();
		String s = "welcome";

		char[] ch = s.toCharArray();// convert the String into Character

		for (char c : ch) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> e = m.entrySet(); // to iterate the values one by one

		for (Entry<Character, Integer> et : e) {
			System.out.println(et);
		}

	}

	
	public static void dubAgain() {
		
		
		Map<Character,Integer> s = new HashMap<>();
		
		String v = "hey hi this surendar";
		
		char[] c = v.toCharArray();
		
		//String[] split = v.split("");
		
		for(char j : c) {
			
			if(s.containsKey(j)) {
				
				s.put(j, s.get(j)+1);
				
				
			}else {
				s.put(j, 1);
				
			}
			
		}
		
		
		
		//System.out.println(s);
		
		
		Set<Entry<Character, Integer>> entrySet = s.entrySet();
		for(Entry<Character, Integer> i : entrySet) {
			System.out.println(i);
			
		}
		
		//System.out.println(entrySet);
		
		
		
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		//subMethodUsingMap();
		dubAgain();
	}

}
