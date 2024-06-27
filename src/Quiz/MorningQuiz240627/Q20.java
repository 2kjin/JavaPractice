package Quiz.MorningQuiz240627;

import java.util.Scanner;

public class Q20 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    BankApplication bank = new BankApplication();

    while (true){
      bank.showMenu();
      int num = sc.nextInt();
      bank.choiceMenu(num);
    }
  }

}
