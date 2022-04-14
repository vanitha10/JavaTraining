package com.training.intial;

import java.util.Scanner;

public class SortArray {
	 public static void main(String[] args) {
	int n, temp;
  
    Scanner sort1 = new Scanner(System.in);

   
    System.out.print("Enter the values needed  : ");
    n = sort1.nextInt();


    int a[] = new int[n];

    System.out.println("Enter all the values :");
    for (int i = 0; i < n; i++) {
      a[i] = sort1.nextInt();
    }

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (a[i] > a[j]) {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }

 		
    System.out.println("Ascending Order:");
    for (int i = 0; i < n; i++) {
      System.out.println(a[i]);
    }
  }
}
	
	
	

