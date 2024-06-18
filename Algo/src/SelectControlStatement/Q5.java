package SelectControlStatement;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float score1 = sc.nextFloat();
        float score2 = sc.nextFloat();

        if(score1 >= 4.0 && score2 >= 4.0){
            System.out.println("A");
        }else if(score1 >= 3.0 && score2 >= 3.0){
            System.out.println("B");
        }else {
            System.out.println("C");
        }
    }
}
