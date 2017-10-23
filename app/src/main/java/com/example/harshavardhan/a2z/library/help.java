package com.example.harshavardhan.a2z.library;

import java.util.Scanner;

public class help {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	String a = new String("Hello1");
	String b=new String("Hello");
	if(a.contentEquals(b))
		System.out.println("Yes");
	else
		System.out.println("NO");
	
	in.close();
}
}
