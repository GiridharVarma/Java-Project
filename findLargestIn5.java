package com.te.learnJava8.logics;

import java.util.Arrays;

public class findLargestIn5 {

	public static void main(String[] args) {
		
		
		int a=10;
		int b=20;
		int c=80;
		
		int d=60;
		int e=50;
		
		
		int[] ar = new int[5];
		
		ar[0]=a;
		ar[1]=b;
		ar[2]=c;
		ar[3]=d;
		ar[4]=e;
		
	
		for(int i=0;i<ar.length;i++)
		{
			
			System.out.println(ar[i]);
			
		}
		
		Arrays.sort(ar);
		
		System.out.println("---------------------");
		
		for(int i=0;i<ar.length;i++)
		{
			
			System.out.println(ar[i]);
			
		}
		
	     System.out.println("The largest number is "  );
		System.out.println(ar[4]);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
