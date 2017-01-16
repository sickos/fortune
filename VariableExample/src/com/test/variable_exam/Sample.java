package com.test.variable_exam;

import java.util.Scanner;

public class Sample {
	public static void main(String args[]){
	 
		Scanner scanner = new Scanner(System.in);
        System.out.print("A의 원하는 숫자를 입력하세요. ");
        int a1 = scanner.nextInt();
        System.out.println("a1 = " + a1);
        
        System.out.print("B의 원하는 숫자를 입력하세요. ");
        int b1 = scanner.nextInt();
        System.out.println("b1 = " + b1);
        
        
        
        int a2 = ((int)(Math.random()*10)+1);
        int b2 = ((int)(Math.random()*10)+1);
        System.out.println("a2 = " + a2);
        System.out.println("b2 = " + b2);
        
        
	 int res_a=0;
	 int res_b=0;
	 
	
	 
	 

		 
			 
			 if(a1 == a2)	{
		 	
				 if(a1 == 1 &  a2==1){
					 
		 		System.out.println("1땡");
		 		res_a = 10;
				 }
				 
				 else if(a1 == 2 &  a2==2){
		 		System.out.println("2땡");
		 		res_a = 11;
				 }
				 
				 else if(a1 == 3 &  a2==3){
					 System.out.println("3땡");
					 res_a = 12;
				 }
				 else if(a1 == 4 &  a2==4){
		 		System.out.println("4땡");
		 		res_a = 14;
				 }
				 else if(a1 == 5 &  a2==5){
		 		System.out.println("5땡");
		 		res_a = 15;
				 }
				 else if(a1 == 6 &  a2==6){
		 		System.out.println("6땡");
		 		res_a = 16;
				 }
				 else if(a1 == 7 &  a2==7){
		 		System.out.println("7땡");
		 		res_a = 17;
				 }
				 else if(a1 == 8 &  a2==8){
		 		System.out.println("8땡");
		 		res_a = 18;
				 }
				 else if(a1 == 9 &  a2==9){
		 		System.out.println("9땡");
		 		res_a = 19;
				 }
		 	
				 else if(a1 == 10 &  a2==10){
		 		System.out.println("장땡");
		 		res_a = 20;
				 }
		 }
		 
		 
		 else {
			 if(a1 + a2 ==3){
			 		System.out.println("3끗");
			 		res_a = 3;
			 		}
			 
			 if(a1 + a2 ==4){
			 		System.out.println("4끗");
			 		res_a = 4;
			 		}
			 if(a1 + a2 ==5){
			 		System.out.println("5끗");
			 		res_a = 5;
			 		}
			 if(a1 + a2 ==6){
			 		System.out.println("6끗");
			 		res_a = 6;
			 		}
			 if(a1 + a2 ==7){
			 		System.out.println("7끗");
			 		res_a = 7;
			 		}
			 if(a1 + a2 ==8){
			 		System.out.println("8끗");
			 		res_a = 8;
			 		}
			 
			 if(a1 + a2 ==9){
			 		System.out.println("9끗");
			 		res_a = 9;
			 		}
			 
		 if(a1 + a2 ==10){
		 		System.out.println("망통...");
		 		res_a = 0;
		 		}

		    if(a1 + a2 ==11){
		 	if(a1 == 3 & a2==8 || a1 ==8 & a2 ==3){
		  System.out.println("38광땡 !!!");
		  res_a = 21;
		  }
		 	else {
		 		System.out.println("1끗");
		 	res_a = 1;
		 	}
		 }

		 if(a1 + a2 ==12){
		 System.out.println("2끗");
		 res_a = 2;
		 }

		 if(a1 + a2 ==13){
		 System.out.println("3끗");
		 res_a = 3;
		 }

		 if(a1 + a2 ==14){
		 System.out.println("4끗");
		 res_a = 4;
		 }
		 
		 if(a1 + a2 ==15){
		 System.out.println("5끗");
		 res_a = 5;
		 }
		 
		 if(a1 + a2 ==16){
		 System.out.println("6끗");
		 res_a = 6;
		 }
		 
		 if(a1 + a2 ==17){
		 System.out.println("7끗");
		 res_a = 7;
		 }
		 
		 if(a1 + a2 ==18){
		 System.out.println("8끗");
		 res_a = 8;
		 }
		 
		 if(a1 + a2 ==19){
		 System.out.println("9끗");
		 res_a = 9;
		 }
		 
		 if(a1 + a2 ==20){
		 System.out.println("망통...");
		 res_a = 0;
		 }
		 }
	 
	 
	
		if(b1 == b2)	{
				 	
				 if(b1 == 1 &  b2==1){
					 
		 		System.out.println("1땡");
		 		res_b = 10;
				 }
				 else if(b1 == 2 &  b2==2){
		 		System.out.println("2땡");
		 		res_b = 11;
				 }
				 else if(b1 == 3 &  b2==3){
					 System.out.println("3땡");
					 res_b = 12;
				 }else if(b1 == 4 &  b2==4){
		 		System.out.println("4땡");
		 		res_b = 14;
				 }else if(b1 == 5 &  b2==5){
		 		System.out.println("5땡");
		 		res_b = 15;
				 }else if(b1 == 6 &  b2==6){
		 		System.out.println("6땡");
		 		res_b = 16;
				 }else if(b1 == 7 &  b2==7){
		 		System.out.println("7땡");
		 		res_b = 17;
				 }else if(b1 == 8 &  b2==8){
		 		System.out.println("8떙");
		 		res_b = 18;
				 }else if(b1 == 9 &  b2==9){
		 		System.out.println("9땡");
		 		res_b = 19;
				 }
		 	
				 else if(b1 == 10 &  b2==10){
		 		System.out.println("장땡");
		 		res_b = 20;
				 }
		 }

		 
			 
			 
			 else {
				 
				 if(b1 + b2 ==3){
				 		System.out.println("3끗");
				 		res_b = 3;
				 		}
				 if(b1 + b2 ==4){
				 		System.out.println("4끗");
				 		res_b = 4;
				 		}
				 if(b1 + b2 ==5){
				 		System.out.println("5끗");
				 		res_b = 5;
				 		}
				 if(b1 + b2 ==6){
				 		System.out.println("6끗");
				 		res_b = 6;
				 		}
				 if(b1 + b2 ==7){
				 		System.out.println("7끗");
				 		res_b = 7;
				 		}
				 if(b1 + b2 ==8){
				 		System.out.println("8끗");
				 		res_b = 8;
				 		}
				 if(b1 + b2 ==9){
				 		System.out.println("9끗");
				 		res_b = 9;
				 		}
				 
				 
				 
				 
				 
		 	if(b1 + b2 ==10){
		 		System.out.println("망통...");
		 		res_b = 0;
		 		}

		 if(b1 + b2 ==11){
		 	
			 if(b1 == 3 & b2==8 || b1 ==8 & b2 ==3){
		  System.out.println("38광땡 !!!");
		  res_b = 21;}
			 
		 	else {System.out.println("1끗");
		 	res_b = 1;}
		 }

		 if(b1 + b2 ==12){
		 System.out.println("2끗");
		 res_b = 2;
		 }

		 if(b1 + b2 ==13){
		 System.out.println("3끗");
		 res_b = 3;
		 }

		 if(b1 + b2 ==14){
		 System.out.println("4끗");
		 res_b = 4;
		 }
		 if(b1 + b2 ==15){
		 System.out.println("5끗");
		 res_b = 5;
		 }
		 if(b1 + b2 ==16){
		 System.out.println("6끗");
		 res_b = 6;
		 }
		 if(b1 + b2 ==17){
		 System.out.println("7끗");
		 res_b = 7;
		 }
		 if(b1 + b2 ==18){
		 System.out.println("8끗");
		 res_b = 8;
		 }
		 if(b1 + b2 ==19){
		 System.out.println("9끗");
		 res_b = 9;
		 }
		 if(b1 + b2 ==20){
		 System.out.println("망통...");
		 res_b = 0;
		 }
	 }
	
	 
	 
	
	
	
	 if (res_a > res_b)
		 System.out.println("A가 이겼습니다 !");
	 if(res_a < res_b)
			 System.out.println("B가 이겼습니다 !");
		 if(res_a == res_b)
			 System.out.println("A 와 B 가 비겼습니다.");
		 
	
	}
}

	 
	 
	 
	 
	 
 

