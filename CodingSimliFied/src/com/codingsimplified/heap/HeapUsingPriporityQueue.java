package com.codingsimplified.heap;

import java.util.PriorityQueue;

public class HeapUsingPriporityQueue {
	public static void minHeap(int []arr) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		//insert
		for(int i = 0; i<arr.length; i++) {
			pq.add(arr[i]);
		}
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = pq.poll();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {10, 7, 11, 5, 2, 13, 1, 45};
		HeapUsingPriporityQueue.minHeap(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}
}
