package com.codingsimplified.dynamicprogramming;

public class Fibbonaci {

	public static int getFibbonaciNumber(int n) {
		if(n < 2) {
			return n;
		}
		return getFibbonaciNumber(n-1) + getFibbonaciNumber(n-2);
	}
	public static int getBottomUp(int n) {
		int []f = new int[n+1];
		f[0] = 0;
		f[1] = 1;
		
		for(int i = 2; i<=n; i++) {
			f[i] =f[i-1] + f[i-2];
		}
		
		return f[n];
	}
	public static int getBottomUpLessSpace(int n) {
		int a = 0;
		int b = 1;
		int c;
		for(int i = 2; i<=n; i++) {
			c = a+b;
			a =b;
			b = c;
		}
		
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.out.println(getFibbonaciNumber(5));	
	 System.out.println(getBottomUp(5));
	 System.out.println(getBottomUpLessSpace(5));
	}

}




