package com.practice;

import java.util.Arrays;
import java.util.Collections;

public class Example1 {

	//static Scanner s = new Scanner(System.in);

	public static Example ex = new Example();




	public static void main(String[] args) {
		//
		//		int[] array_nums = {14, 43, 1, 0, 2, 3};
		//		
		//		boolean flag=false;
		//		for( int i=0;i<=array_nums.length-3;i++) {
		//			if(array_nums[i]==(array_nums[i+1]-1) && array_nums[i]==(array_nums[i+2]-2)) {
		//				flag=true;
		//			}
		//		}
		//		
		//		if(flag) {
		//			System.out.println("Array contain three adjecent values");
		//		}
		//		else {
		//			System.out.println("Array does not contain three adjecent values");
		//		}
		//		
		//		int[] array_nums = {11, 10, 13, 10, 45, 20, 10, 10};
		//		
		//		int size = array_nums.length;
		//		int i=size-1;
		//		int  count =0;
		//		while(array_nums[i]!=10) {
		//			i--;
		//			count++;
		//		}
		//		System.out.println(i);
		//		System.out.println(count);
		//		
		//		int[] newArray = new int[count];
		//		
		//		for(int j =0;j<newArray.length;j++) {
		//			i++;
		//			newArray[j]=array_nums[i];
		//			
		//			
		//		}
		//		
		//		System.out.println(Arrays.toString(newArray));

		//		String str ="Python";
		//		
		//		System.out.println(str.substring(str.length()-3));

		//		int[] ar1 = {1, 3, -5, 4};
		//		int[] ar2 = {1, 4, -5, -2};
		//		
		//		int counter=0;
		//		while(counter<ar1.length) {
		//			System.out.print(ar1[counter]*ar2[counter]+" ");
		//			counter++;
		//		}

		//		int[] ar1 = {20, 30, 40, 1};
		//		int f=ar1[0];
		//		int l=ar1[ar1.length-1];
		//		int m = ar1[ar1.length/2];
		//		
		//		if(f>l && f>m) {
		//			System.out.println(f);
		//		}
		//		else if(f<l && l>m) {
		//			System.out.println(l);
		//		}
		//		else {
		//			System.out.println(m);
		//		}
		//
		//		
		//		int[] ar1 = {20, 30, 40, 1};
		//		
		//		int f = ar1[0];
		//		int l = ar1[ar1.length-1];
		//		
		//		ar1[0]=l;
		//		ar1[ar1.length-1]=f;
		//		
		//		System.out.println(Arrays.toString(ar1));
		//		
		//		
		//		int[] ar1 = {5,5};
		//		for(int i:ar1) {
		//			if(i==4 || i==7) {
		//				System.out.println(true);
		//			}
		//		}


		//String str="Python";
		//		String str1="xyvsd";
		//		String newString;
		//		if(str1.length()==0) {
		//			newString=str.charAt(0)+"#";
		//		}
		//		else {
		//			newString=str.substring(0, 1)+str1.substring(str1.length()-1);;//+str1.charAt(0);
		//		}
		//		
		//		System.out.println(newString);

//		System.out.println(str.substring(0,(str.length()/2)));
//		int count=1;
//		int sum=0;
//		for(int i=0;i<=1000;i++) {
//			
//			if(count<101) 
//			{
//				if(i%2!=0) {
//					sum=sum+i;
//					count++;
//					System.out.println(count);
//				}
//			}
//
//		}
//			System.out.println(sum);

//
//String str ="the quick brown fox jumps over the lazy dog. ";
//
////System.out.println(str.toUpperCase());
//
//
//String[] str1 = str.split("");
//
////System.out.println(str1);
//
//String st ="";
//
//for(String s : str1) {
//	 System.out.print(s);
//	
//	char upperCase = Character.toUpperCase(s.charAt(0));
//	System.out.println(upperCase);
//	String si = s.substring(1);
//	st=st+upperCase+si;
//	System.out.println(st);
//			
//	
//}
//
////System.out.println(st.trim());


		

int[] a = {34,3,21,45,118,4,103};

int temp;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j] > a[j+1]){   // use < for Descending order
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j]=temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(a));
	










































		}


	}