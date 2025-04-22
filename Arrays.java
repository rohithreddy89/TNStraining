package com.tns.kprit.arrays;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		  System.out.println("Enter size of array: "); 
		  int a = sc.nextInt(); 
		  int arr[]= new int[a];
		  
		  System.out.println("Enter Elements: "); 
		  for(int i = 0; i<arr.length;i++) {
		  arr[i]=sc.nextInt(); }
		  
		  
		  System.out.println("Single Dimentional array: "); 
		  for(int i =0;i<arr.length;i++) { 
			  System.out.print(arr[i]+" "); 
		  }
		 
		
		
		
		//Two Dimentional array
		
		System.out.println("Enter size of row and coloum");
		int m= sc.nextInt();
		int n = sc.nextInt();
		
		int ar[][]=new int[m][n];
		
		System.out.println("enter Elements: ");
		for(int i = 0 ; i< m;i++) {
			for(int j = 0 ; j < n;j++) {
				ar[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Two Dimentional Array :");
		for(int i = 0; i<m;i++) {
			for(int j = 0;j<n;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
