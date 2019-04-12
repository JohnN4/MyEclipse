package com.jn.edu;

import java.util.Scanner;

public class ConditionalAssignment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter b");
		int b = sc.nextInt();
		//int a =(b<100) ? b-5: b+5;
		int a =(b<100) ? b-5: (b>250)? b+25: b+5;
		System.out.println("a ="+a);
		
	}
}
