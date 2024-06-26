package BasicJavaStudy._01;

public class Prob0 {

  public static void main(String[] args) {
    int sum = 0;
    int oddSum = 0;
    int evenSum = 0;

    for(int i = 1 ; i <= 1000; i++){
      sum += i;
    }

    for(int i = 1 ; i <= 1000; i++){
      if(i % 2 == 0){
        evenSum += i;
      }
    }

    for(int i = 1 ; i <= 1000; i++){
      if(i % 2 != 0){
        oddSum += i;
      }
    }

    System.out.println("총합 : " + sum);
    System.out.println("홀수 총합 : " + oddSum);
    System.out.println("짝수 총합 : " + evenSum);
  }
}
