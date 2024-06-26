package RepeatControlStatement3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int cnt = 0;

        for (int i = 1; sum < n; i++){
            if(i % 2 != 0){
                sum +=i;
                cnt++;
            }
        }
        System.out.println(cnt + " " + sum);
    }
}
