package RepeatControlStatement2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int three_cnt = 0;
        int five_cnt = 0;

        for (int i = 1 ; i <= 10; i++){
            int n = sc.nextInt();
            if(n % 3 == 0){
                three_cnt++;
            }
            if (n % 5 == 0) {
                five_cnt++;
            }
        }

        System.out.println("Multiples of 3 : " + three_cnt);
        System.out.println("Multiples of 5 : " + five_cnt);

    }
}