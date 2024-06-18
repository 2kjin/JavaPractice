package SelectControlStatement;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a){
            case 1:
                System.out.println("dog");
                break;
            case 2:
                System.out.println("cat");
                break;
            case 3:
                System.out.println("chick");
                break;
            default:
                System.out.println("I don't know.");
                break;
        }
        /*String str = sc.next();
        switch (str){
            case "Number? 1":
                System.out.println("dog");
                break;
            case "Number? 2":
                System.out.println("cat");
                break;
            case "Number? 3":
                System.out.println("chick");
                break;
            default:
                System.out.println("I don't know.");
                break;
        }*/
    }
}
