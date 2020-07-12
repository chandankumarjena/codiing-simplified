package com.codingsimplified.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySortUsingHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "hihhihihhiehhehy";
		String result = sortUsingFrequencySort(string);
		System.out.println(result);
		int []array = {4,9};
		

	}

	private static String sortUsingFrequencySort(String string) {
		// TODO Auto-generated method stub
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < string.length(); i++) {
			map.put(string.charAt(i), map.getOrDefault(string.charAt(i), 0)+1);
		}
		
		PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<Map.Entry<Character,Integer>>
		((n1,n2)-> n2.getValue()-n1.getValue());
		
		maxHeap.addAll(map.entrySet());
		StringBuilder stringBuilder = new StringBuilder();
		while(!maxHeap.isEmpty()) {
			Map.Entry<Character, Integer> entry = maxHeap.poll();
			for(int i =0; i < entry.getValue(); i++) {
				stringBuilder.append(entry.getKey());
			}
		}
		return stringBuilder.toString();
	}

}
