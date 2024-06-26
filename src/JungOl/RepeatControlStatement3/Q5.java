package RepeatControlStatement3;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for ( int i = 0; i < n + 3 ; i++){
            for ( int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = n +2; j > i; j--){
                System.out.print("*");
            }
            n = n-1;
            System.out.println();
        }
    }
}
