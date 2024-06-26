package RepeatControlStatement;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int n;

        while (true) {
            n = sc.nextInt();

            if (n == 0) {
                break;
            }
            if (n % 3 == 0 || n % 5 == 0){
                continue;
            }else {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
