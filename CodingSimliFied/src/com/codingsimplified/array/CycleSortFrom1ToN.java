package com.codingsimplified.array;

public class CycleSortFrom1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {3,4,6,2,1,5};
		cycleSort(arr);
		for(int i : arr) {
			System.out.println(i);
		}

	}

	private static void cycleSort(int[] arr) {
		// TODO Auto-generated method stub
		int i = 0;
		while(i < arr.length) {
			if(arr[i] != i+1) {
				int index = arr[i] -1;
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			} else {
				i++;
			}
		}
	}

}
