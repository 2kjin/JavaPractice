package Inheritance;

public class Drink {
  String name;
  int price;
  int count;

  public Drink(String name, int price, int count) {
    this.name = name;
    this.price = price;
    this.count = count;
  }

  public int getTotalPrice(){
    int sum = price * count;
    return sum;
  }

  public static void printTitle(){
  System.out.println("상품명     단가     수량     금액");
  }

  public void printData(){
    System.out.println(name + "      " + price + "      " + count + "      " + price * count);
  }

}