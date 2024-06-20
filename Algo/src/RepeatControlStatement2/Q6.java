package RepeatControlStatement2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int cnt = 0;


        for(int i = 1 ; i <=n; i++){
            int score = sc.nextInt();
            sum += score;
            cnt++;
        }

        double avg = (double) sum / cnt;
        if (avg >= 80){
            System.out.printf("avg : %.1f",avg);
            System.out.println("pass");
        }else {
            System.out.printf("avg : %.1f\n",avg);
            System.out.println("fail");
        }

    }
}
