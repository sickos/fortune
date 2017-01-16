package com.sd.game;

import java.util.Scanner;

public class SDgame {
   public static void main(String args[]) {
      while (true) {
         Scanner scanner = new Scanner(System.in);
         int count_a = 0;
         int count_b = 0;
         int a1, b1;
         int res_a = 0;
         int res_b = 0;
         int score[] = new int[4];
         
         for (int i = 0; i < 5; i++) {
            int a2 = ((int) (Math.random() * 10) + 1);
            int b2 = ((int) (Math.random() * 10) + 1);
            System.out.println(i + 1 + "라운드 !\n");

            System.out.print("A의 숫자를 입력하세요.");
            a1 = scanner.nextInt();
            if (a1 < 1 || a1 > 10) {
               System.out.print("잘못 입력하셨습니다. A 숫자를 다시 입력하세요 ! \n");
               i = i - 1;
               continue;
            }
            System.out.print("B의 숫자를 입력하세요. ");
            while (true) {
               b1 = scanner.nextInt();

               if (b1 < 1 || b1 > 10) {
                  System.out.print("잘못 입력하셨습니다. B 숫자를 다시 입력하세요 ! \n");
                  continue;
               } else
                  break;
            }
            System.out.print("A의 첫 번째 패 숫자 = " + a1 + "     ");
            System.out.println("A의 랜덤 패 숫자= " + a2);
            System.out.print("B의 첫 번째 패 숫자 = " + b1 + "     ");
            System.out.println("B의 랜덤 패 숫자 = " + b2);

            if (a1 == a2) {
               switch (a1) {
               case 1:
                  System.out.println("1땡");
                  res_a = 10;
                  break;
               case 2:
                  System.out.println("2땡");
                  res_a = 11;
                  break;
               case 3:
                  System.out.println("3땡");
                  res_a = 13;
                  break;
               case 4:
                  System.out.println("4땡");
                  res_a = 14;
                  break;
               case 5:
                  System.out.println("5땡");
                  res_a = 15;
                  break;
               case 6:
                  System.out.println("6땡");
                  res_a = 16;
                  break;
               case 7:
                  System.out.println("7땡");
                  res_a = 17;
                  break;
               case 8:
                  System.out.println("8땡");
                  res_a = 18;
                  break;
               case 9:
                  System.out.println("9땡");
                  res_a = 19;
                  break;
               case 10:
                  System.out.println("장땡");
                  res_a = 20;
                  break;
               default:
                  break;
               }
            } else if (a1 == 3 & a2 == 8 || a1 == 8 & a2 == 3) {
               System.out.println("38광땡!!!!!");
               res_a = 21;
            } else {
               res_a = a1 + a2;
               if (res_a >= 10) {
                  res_a = res_a - 10;
               }
               switch (res_a) {
               case 0:
                  System.out.println("망통");
                  break;
               case 1:
                  System.out.println("1끗");
                  break;
               case 2:
                  System.out.println("2끗");
                  break;
               case 3:
                  System.out.println("3끗");
                  break;
               case 4:
                  System.out.println("4끗");
                  break;
               case 5:
                  System.out.println("5끗");
                  break;
               case 6:
                  System.out.println("6끗");
                  break;
               case 7:
                  System.out.println("7끗");
                  break;
               case 8:
                  System.out.println("8끗");
                  break;
               case 9:
                  System.out.println("9끗");
                  break;
               default:
                  break;
               }

            }

            if (b1 == b2) {
               switch (b1) {
               case 1:
                  System.out.println("1땡");
                  res_b = 10;
                  break;
               case 2:
                  System.out.println("2땡");
                  res_b = 11;
                  break;
               case 3:
                  System.out.println("3땡");
                  res_b = 13;
                  break;
               case 4:
                  System.out.println("4땡");
                  res_b = 14;
                  break;
               case 5:
                  System.out.println("5땡");
                  res_b = 15;
                  break;
               case 6:
                  System.out.println("6땡");
                  res_b = 16;
                  break;
               case 7:
                  System.out.println("7땡");
                  res_b = 17;
                  break;
               case 8:
                  System.out.println("8땡");
                  res_b = 18;
                  break;
               case 9:
                  System.out.println("9땡");
                  res_b = 19;
                  break;
               case 10:
                  System.out.println("장땡");
                  res_b = 20;
                  break;
               default:
                  break;
               }
            } else if (b1 == 3 & b2 == 8 || b1 == 8 & b2 == 3) {
               System.out.println("38광땡!!!!!");
               res_b = 21;
            } else {
               res_b = b1 + b2;
               if (res_b >= 10) {
                  res_b = res_b - 10;
               }
               switch (res_b) {
               case 0:
                  System.out.println("망통");
                  break;
               case 1:
                  System.out.println("1끗");
                  break;
               case 2:
                  System.out.println("2끗");
                  break;
               case 3:
                  System.out.println("3끗");
                  break;
               case 4:
                  System.out.println("4끗");
                  break;
               case 5:
                  System.out.println("5끗");
                  break;
               case 6:
                  System.out.println("6끗");
                  break;
               case 7:
                  System.out.println("7끗");
                  break;
               case 8:
                  System.out.println("8끗");
                  break;
               case 9:
                  System.out.println("9끗");
                  break;
               default:
                  break;
               }

            }

            if (res_a > res_b)
               count_a++;
            if (res_a < res_b)
               count_b++;
            if (res_a == res_b) {
               count_a++;
               count_b++;
            }

            if (res_a > res_b)
               System.out.println("************ A 승리 ************\n");
            if (res_a < res_b)
               System.out.println("************ B 승리 ************\n");
            if (res_a == res_b)
               System.out.println("************ A와 B 무승부 ************\n");
         }
         if (count_a > count_b)
            System.out.println("************ A님 축하합니다. 승리 하셨습니다 ************");
         else if (count_a < count_b)
            System.out.println("************ B님 축하합니다. 승리 하셨습니다 ************");
         else if (count_a == count_b)
            System.out.println("************ 아쉽네요. 무승부입니다. ************");

         System.out.println("계속하시겠습니까? (y/n)");
         scanner.nextLine();
         if (scanner.nextLine().equals("n")) {
            System.out.println("게임이 종료 되었습니다.");
            break;
         }
      }
   }
}