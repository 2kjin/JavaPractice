package SelectControlStatement;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gender = sc.nextLine();
        int age = sc.nextInt();

        if(age >=18){
            if(gender.equals("M")){
                System.out.println("MAN");
            }else if(gender.equals("F")){
                System.out.println("WOMAN");
            }
        }else {
            if(gender.equals("M")){
                System.out.println("BOY");
            }else if(gender.equals("F")){
                System.out.println("GIRL");
            }
        }
    }
}
