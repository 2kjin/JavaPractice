package Quiz.MorningQuiz240627.ClassQ20;

import java.util.Scanner;

public class BankApplication {

  Scanner sc = new Scanner(System.in);

  String[][] Account = new String[100][3];
  int cnt = 0;

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

    for(int i = 0; i < Account.length; i++){
      if (cnt == i){
        System.out.print("계좌번호 : ");
        Account[i][0] = sc.next();
        System.out.print("계좌주 : ");
        Account[i][1] = sc.next();
        System.out.print("초기입금액 : ");
        Account[i][2] = sc.next();
        System.out.println("결과 : 계좌가 생성되었습니다.");
      }
    }
    cnt++;
  }

  public void accountList(){
    System.out.println("-------");
    System.out.println("계좌 목록");
    System.out.println("-------");
    for (int i = 0; i < cnt; i++) {
      for (int j = 0; j < Account[i].length; j++) {
          System.out.print(Account[i][j] + "     ");
        }
      System.out.println();
      }
    }

  public void deposit(){
    System.out.println("-------");
    System.out.println(" 예  금 ");
    System.out.println("-------");

    System.out.print("계좌번호 : ");
    String accountNum = sc.next();
    System.out.print("예금액 : ");
    String credit = sc.next();
    int creditInt = Integer.parseInt(credit);

    for (int i = 0; i < cnt; i++) {
      if (accountNum.equals(Account[i][0])) {
        int totalAmount = Integer.parseInt(Account[i][2]);
        totalAmount = totalAmount + creditInt;
        String totalAmountString = Integer.toString(totalAmount);
        Account[i][2] = totalAmountString;
      }
    }

  }

  public void withdraw(){
    System.out.println("-------");
    System.out.println(" 출  금 ");
    System.out.println("-------");

    System.out.print("계좌번호 : ");
    String accountNum = sc.next();
    System.out.print("출금액 : ");
    String credit = sc.next();
    int withdrawal = Integer.parseInt(credit);

    for (int i = 0; i < cnt; i++) {
      if (accountNum.equals(Account[i][0])) {
        int totalAmount = Integer.parseInt(Account[i][2]);
        totalAmount = totalAmount - withdrawal;
        String totalAmountString = Integer.toString(totalAmount);
        Account[i][2] = totalAmountString;
      }
    }
  }

  public void exit(){
    System.out.println("프로그램 종료");
    System.exit(0);
  }
}
