package BasicJavaStudy._01;

import java.util.Scanner;

public class Prob1 {

  public static void main(String args[]) {

    int inputInt = 0;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");

    inputInt = keyboard.nextInt();
    // 프로그램을 구현하세요.

    for (int i = 1; i < 10 ; i++){
      System.out.println(inputInt + " * " + i + " = " + (inputInt*i));
    }
  }
}