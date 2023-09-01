package com.nissan.app;

import java.util.Scanner;

public class string_q5 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String str=s.nextLine();
		System.out.println("Enter string: ");
		String result=str.replace(".#.|#.", "");
		System.out.println("Modifies string: "+result);
		
	}

}
