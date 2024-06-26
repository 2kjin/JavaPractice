package RepeatControlStatement;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddCnt = 0;
        int evenCnt = 0;

        while (true){
            int n = sc.nextInt();

            if( n == 0){
                break;
            }
            if( n % 2 == 0) {
                evenCnt++;
            } else {
                oddCnt++;
            }
        }

        System.out.println("odd : " + oddCnt);
        System.out.println("even : " + evenCnt);

    }
}
