package com.practice;

import java.util.Collections;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="xxxxxxxxxxxrxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
		FindDuplicate(s);
		DistinctChar(s);
		
		//s.char
		
		

	}
	
	public static void  FindDuplicate(String s) {
		//Set<String> arr = new HashSet<>();
		//s.
	
		
//		Map<String, Integer> map = new HashMap<>();
//		for(String a : split) {
//			if(map.containsKey(a)) {
//				map.put(a, map.get(a)+1);
//			}
//			else {
//				map.put(a, 1);
//			}
//		}
//		
//		Set<String> keySet = map.keySet();
//		for(String b : keySet) {
//			if(map.get(b)>1) {
//				System.out.println(b+"    "+map.get(b));
//			}
//		}
		
		
		int counter =1;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					counter++;
				}
				
			}
		if(counter>1) {
			System.out.println(s.charAt(i)+"   "+counter);
			String re = Character.toString(s.charAt(i));
			
			s=removeDuplicate(s, re);
			counter=1;
			i=0;
			
		}
		}
	}
	
	public static String removeDuplicate(String a,String ch) {
		
		String replaceAll = a.replaceAll(ch, "");
		return replaceAll;
	
	}
	
	
	public static void  DistinctChar(String s) {
		
		
		
			
		
	}

}
