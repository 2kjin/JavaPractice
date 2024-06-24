package Quiz;

public class HomeworkBasic {
  public static void main(String[] args) {

  HomeworkBasic hw = new HomeworkBasic();
  hw.method1();

  }

  void method1(){
    System.out.println("java");
    System.out.println(".class");

  }

  void method2(){
    System.out.println("Shape.java");
    System.out.println("Shape");
  }

  void method3(){
    int sum ;
    (sum > 100) ? 100 : 0;
  }

  void method4(){
    System.out.println("2,3,4");
  }

  void method5(){
    int height = 0;
    double size = 0.25;
    double total = (double) height + size;
    char c = 'a';
    String name = "KyeongJin Lee";
  }

  void method6(){
    public class SampleProgram{
      public static void main(String[] args) {
        int k = 10;
        int j = 20;
        int res = k + j;
        System.out.println(res);
      }
    }
  }

  void method7(){
    System.out.println(".java");
  }

  void method8(){
    System.out.println("javac HomeworkBasic");
  }

  void method9(){
    System.out.println("java HomeworkBasic.java");
  }

  void method10(){
    System.out.println("X");
    System.out.println("O");
    System.out.println("O");
    System.out.println("O");
  }

  void method11(){
    System.out.println("Scanner");
  }

  void method12(){
    System.out.println("extends");
  }

  void method13(){
    System.out.println("메소드 오버로딩");
  }

  void method14(){
    System.out.println("int");
  }

  void method15(){
      int add(int a, int b) {
        return a + b;
      }
      int add(int a, int b, int c) {
        return a + b + c;
    }
  }

  void method16(){
    System.out.println("1");
    System.out.println("3");
    System.out.println("5");
    System.out.println("7");
    System.out.println("9");
  }

  void method17(){
    int sum = 0;
    for(int i =1; i<=15; i++){
      sum += i;
    }
    System.out.println("총합 : " + sum);
    System.out.println("120");
  }

}
