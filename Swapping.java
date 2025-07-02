package com.task;

import java.util.Arrays;

//swap numbers in array e.g.Input:  {2,5,6,7,8,6}       output: {5,2,7,6,6,8}

public class Swapping {
	
	public static void main(String[] args) {
		
		int[] arr = {8,4,6,2,7,3,1,5};
	
		
		for(int i =0 ; i<arr.length;i+=2) {
			int temp = arr[i];
			arr[i]=arr[i+1];
			arr[i+1] =  temp;
		}
		System.out.println("Swapping Array : " + Arrays.toString(arr));
	}

}
