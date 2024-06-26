package RepeatControlStatement;

import java.util.Scanner;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;

        while (true){
            int n = sc.nextInt();

            if (n < 0 || n > 100) {
                break;
            }
            sum += n;
            cnt++;
        }

        double avg = (double) sum / cnt;

        System.out.println(sum);
        System.out.printf("%.1f",avg);

    }
}

