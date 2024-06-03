package com.te.learnJava8.logics;

public class findLargest {

	public static void main(String[] args) {
		
		
		int a=10;
		
		int b=20;
		
		int c=80;
		
		int d=120;
		
		int e=90;
		
		
		// without using && or ||
		
		int max;
		
		if(a>b)
			max=a;
		else
			max=b;
		
		if(max<c)
			max=c;
		
		if(max<d)
			max=d;
		if(max<e)
			max=e;
		
		System.out.println("the Maximum Number is " + max);
			

		//using ternary Operator 
		
		int res=(a>b && a>c && a>d && a>e)?a 
				: (b>c && b>d && b>e)?b
				 : (c>d && c>e)?c
			     : (d>e)?d:e ;
		
		System.out.println("The largest of all is " + res);
		
		
	}
	
	

}
