package com.codingsimplified.array;

import java.util.Scanner;

public class InsertIntoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[5];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("1:-at first, 2:- at last, 3:- at anywhere");
		int choice = sc.nextInt();
		sc.close();
		switch (choice) {
		case 1:
			int []arr1 = insertAtFirst(arr, 10);
			print(arr1);
			break;
		case 2:
			int []arr2 = insertAtLast(arr, 10);
			print(arr2);
			break;
		case 3:
			int []arr3 = insertAtAnyWhere(arr, 3, 10);
			print(arr3);
			break;

		default:
			System.out.println("wrong choice");
		}
	}

	private static void print(int[] arr1) {
		// TODO Auto-generated method stub
		for(int i : arr1) {
			System.out.println(i +" ");
		}
		
	}

	private static int[] insertAtAnyWhere(int[] arr, int position, int element) {
		// TODO Auto-generated method stub
		int []temp = new int[arr.length +1];
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i+1 == position) {
				temp[count++] = element;
			}
			temp[count++] = arr[i];
		}
		return temp;
	}

	private static int[] insertAtLast(int[] arr, int element) {
		// TODO Auto-generated method stub
		int []temp = new int[arr.length +1];
		int count = 0;
		for(int i : arr ) {
			temp[count++] = i;
		}
		temp[count] = element;
		return temp;
	}

	private static int[] insertAtFirst(int[] arr, int element) {
		// TODO Auto-generated method stub
		int []temp = new int[arr.length +1];
		int count = 0;
		temp[count] = element;
		
		for(int j = 0; j<arr.length; j++) {
			temp[++count] = arr[j];
		}
		return temp;
	}

}
