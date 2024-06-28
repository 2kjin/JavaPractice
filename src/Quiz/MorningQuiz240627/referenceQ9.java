package Quiz.MorningQuiz240627;

import java.util.Scanner;

public class referenceQ9 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    boolean quit = false;
    while (!quit){
      referenceQ9 m = new referenceQ9();
      m.menu();
      System.out.print("선택> ");
      int num = sc.nextInt();
      int[] scores = new int[3];

      int sum = 0;
      int sumcnt = 0;
      int maxnum = 0;

      switch (num) {
        case 1:
          System.out.print("학생수> ");
          int cnt = sc.nextInt();
          break;
        case 2:
          System.out.print("scores[0]> ");
          scores[0] = sc.nextInt();
          System.out.print("scores[1]> ");
          scores[1] = sc.nextInt();
          System.out.print("scores[2]> ");
          scores[2] = sc.nextInt();
          break;
        case 3:
          System.out.println("scores[0]> " + scores[0]);
          System.out.println("scores[1]> " + scores[1]);
          System.out.println("scores[2]> " + scores[2]);
          break;
        case 4:
          for ( int i : scores ) {
            if( maxnum < i ){
              maxnum = i;
            }
          }
          for ( int i : scores) {
            sum += i;
            sumcnt++;
          }
          double avg = (double) sum / sumcnt ;
          System.out.println("최고 점수 : " + maxnum);
          System.out.printf("평균 점수 : %.1f\n",avg);
          break;
        case 5:
          System.out.println("프로그램 종료");
          quit = true;
          break;
        default:
          System.out.println("잘못된 입력입니다. 다시 입력해주세요.\n");
      }
    }

  }
  void menu(){
    System.out.println("------------------------------------------------");
    System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
    System.out.println("------------------------------------------------");
  }

  void studentNum(){

  }
}
