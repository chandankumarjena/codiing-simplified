package com.codingsimplified.array;

public class ArrayReverse {
	public int[] withExtraSpace(int []arr) {
		if(arr.length <=1) {
			return arr;
		}
		int []B = new int[arr.length];
		int j = arr.length;
		for(int i = 0; i<arr.length ; i++) {
			B[--j] = arr[i];
		}
		return B;
	}
	
	public void withoutExtraSpace(int []myArray) {
		if(myArray.length <=1) {
			return ;
		}
		int j = myArray.length -1;
		for(int i = 0; i<myArray.length/2; i++) {
			int temp = myArray[i];
			myArray[i] = myArray[j];
			myArray[j] = temp;
			j--;
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,2,3,4,5};
		ArrayReverse arrayReverse = new ArrayReverse();
		int []B = arrayReverse.withExtraSpace(arr);
		System.out.print("the reverse array is");
		for(int i : B) {
			System.out.println(i);
		}
		
		int []myArray = {11,12,13,14,15};
		arrayReverse.withoutExtraSpace(myArray);
		System.out.println("using second technique");
		for(int i: myArray) {
			System.out.println(i);
		}
	}

}


