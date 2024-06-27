package Quiz.MorningQuiz240627;

import java.util.Scanner;

public class BankApplication {

  Scanner sc = new Scanner(System.in);

  String[] Account = new String[100];

  public void showMenu(){
    System.out.println("----------------------------------------------");
    System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4. 출금 | 5.종료");
    System.out.println("----------------------------------------------");
    System.out.print("선택> ");
  }

  public void choiceMenu(int num){
    switch (num){
      case 1:
        creatAccount();
        break;
      case 2:
        accountList();
        break;
      case 3:
        deposit();
        break;
      case 4:
        withdraw();
        break;
      case 5:
        exit();
        break;
    }
  }

  public void creatAccount(){
    System.out.println("-------");
    System.out.println("계좌 생성");
    System.out.println("-------");

    System.out.print("계좌번호 : ");

    String accountNum = sc.next();
    System.out.print("계좌주 : ");
    String accountName = sc.next();
    System.out.print("초기입금액 : ");
    String InitialDepositAmount = sc.next();
    System.out.print("결과 : 계좌가 생성되었습니다.");
  }

  public void accountList(){
    System.out.println("-------");
    System.out.println("계좌 목록");
    System.out.println("-------");

  }

  public void deposit(){
    System.out.println("-------");
    System.out.println(" 예  금 ");
    System.out.println("-------");

  }

  public void withdraw(){
    System.out.println("-------");
    System.out.println(" 출  금 ");
    System.out.println("-------");

  }

  public void exit(){
    System.out.println("프로그램 종료");
    System.exit(0);
  }
}
