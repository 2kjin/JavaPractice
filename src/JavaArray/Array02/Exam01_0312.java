package JavaArray.Array02;

import java.util.Scanner;

public class Exam01_0312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 크기 입력하세요 : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;

        System.out.println("숫자 입력하세요 : ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        for (int i : arr){
            double ratio = (i / (double) sum) * 100;
            for (int j = 0; j < (int)ratio; j++){
                System.out.print("*");
            }
            System.out.printf("(%.16f%%)\n", ratio);
        }

    }
}
