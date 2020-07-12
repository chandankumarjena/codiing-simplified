package com.codingsimplified.string;

public class DesignTrimFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "   chandan kumar jena    ";
		char[] arr = string.toCharArray();
		
		int startIndex = 0, endindex = 0, count = 0;
		
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] != ' ') {
				startIndex = i;
				break;
			}
		}
		
		for(int i = arr.length-1; i > 0; i--) {
			if(arr[i] !=' ') {
				endindex = i;
				break;
			}
		}
		count = endindex - startIndex + 1;
		
		String newString = new String(arr , startIndex , count);
		System.out.println(newString);
	}

}
