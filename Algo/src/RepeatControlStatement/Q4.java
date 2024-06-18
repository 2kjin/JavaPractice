package RepeatControlStatement;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;
        int number;

        while (true) {
            number = sc.nextInt();
            if (number >= 100) {
                break;
            }
            sum += number;
            cnt++;
        }
        sum += number;
        cnt++;

        double avg = (double) sum / cnt;

        System.out.println(sum);
        System.out.printf("%.1f",avg);

    }
}
