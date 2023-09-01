package com.nissan.app;
//Write a Java program to return the sum of the digits present in the
//given string. If there is no digits the sum return is 0. 
import java.util.Scanner;

public class strings_q1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=scan.nextLine();
		int sum=0;
		for(int i=0;i<str.length();i++){ 
		if(str.charAt(i)>='0' && str.charAt(i)<='9'){
		sum+=(str.charAt(i)-'0');
		}
		}
		System.out.println("Sum of all digits " +sum );
		}
		}
