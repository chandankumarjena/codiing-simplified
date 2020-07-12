package com.codingsimplified.dynamicprogramming;

public class NumberOfSteps {

	public static int getCounts(int numberofSteps) {
		if(numberofSteps==0) return 1;
		if(numberofSteps==1) return 1;
		if(numberofSteps==2) return 2;
		 return getCounts(numberofSteps - 1) + getCounts(numberofSteps - 2) + getCounts(numberofSteps-3);
	}
	public static int getCountsUsingBottomUpApproach(int n) {
		int []arr = new int[n+1];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 2;
		for(int i = 3; i <= n; i++) {
			arr[i] =arr[i-1] + arr[i-2] + arr[i-3];
		}
		return arr[n];
	}
	public static void main(String []args) {
		System.out.println(getCounts(5));
		System.out.println(getCountsUsingBottomUpApproach(5));
	}
}
