package com.codingsimplified.string;

public class PrintFirstCharacterOfAWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "chandan kumar jena";
		char []arr = s.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != ' ' &&(i == 0 || arr[i-1] == ' ' )) {
				System.out.println(arr[i]);
			}
		}
	}

}
