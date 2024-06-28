package JavaArray.Array01.prob;

import java.util.Random;

public class ArrayExam02 {

  public static void main(String[] args) {

    int[] array = new int[5];

    for(int i : array){
      i = (int)((Math.random() * 100 + 1));
      System.out.print(i + " ");
    }

  }

}
