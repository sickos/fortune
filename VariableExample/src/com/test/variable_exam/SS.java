package com.test.variable_exam;

import java.util.Scanner;

public class SS {
	public static void main(String args[]){
		 
		Scanner a1 = new Scanner(System.in);
        System.out.print("원하는 숫자를 입력하시오 ");
        System.out.println("a1 = " + a1.nextLine());
        
        Scanner b1 = new Scanner(System.in);
        System.out.print("원하는 숫자를 입력하시오 ");
        System.out.println("b1 = " + b1.nextLine());
        
        System.out.println("a2 = " + ((int)(Math.random()*10)+1));
        System.out.println("b2 = " + ((int)(Math.random()*10)+1));
}}
