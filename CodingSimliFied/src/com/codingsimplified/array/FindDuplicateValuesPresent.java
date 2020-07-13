package com.codingsimplified.array;

import java.util.Arrays;

public class FindDuplicateValuesPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,3,2,5,1};
		//findDuplicateValue(arr);
		System.out.println(findIt(arr));
	}
	public static int findIt(int []arr) {
		if(arr.length <= 1) {
			return -1;
		}
		int i =0;
		while(i <arr.length) {
			if(arr[i] != arr[arr[i] - 1]) {
				int  otherIndex = arr[i] - 1;
				int x = arr[i];
				arr[i] = arr[otherIndex];
				arr[otherIndex] = x;
			} else {
				i++;
			}
		}
		return arr[arr.length-1];
	}
}
