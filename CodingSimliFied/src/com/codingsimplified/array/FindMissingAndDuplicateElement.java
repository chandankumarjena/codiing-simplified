package com.codingsimplified.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindMissingAndDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,4,3,4,2,6};
		List<List<Integer>> list = findListOfMissingAndDuplicate(arr);
		System.out.println(list);

	}

	private static List<List<Integer>> findListOfMissingAndDuplicate(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.parallelSort(arr);
		List<Integer> missing = new ArrayList<>();
		List<Integer> duplicate = new ArrayList<>();
		for(int i=0; i< arr.length; i++) {
			if(i+1 != arr[i]) {
				missing.add(i+1);
				duplicate.add(arr[i]);
			}
		}
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		result.add(duplicate);
		result.add(missing);
		
		return result;
	}

}
