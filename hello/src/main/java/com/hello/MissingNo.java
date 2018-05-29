package com.hello;

public class MissingNo {

	public static void missingNumber(int array[], int n){
		int actualSum=0;
		int expectedResult=n*(n+1)/2;
		for(int i:array){
			actualSum=actualSum+i;
		}
		int result= expectedResult-actualSum;
		System.out.println(result);
		}
	
	
public static void main(String[] args) {

	int array[]={1,2,4,3};
	missingNumber(array,6);
	}

}
