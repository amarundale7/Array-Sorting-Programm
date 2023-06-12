package com.array.sorting;

public class SumOfTwoNumber {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		int sum = 6;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[j]==sum-a[i]) {
					
					System.out.println(a[j]+ "+" +a[i]);
					
					count++;
				}
				
			}
			System.out.print(count);
		}
	}

}
