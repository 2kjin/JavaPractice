package Polymorphism._01;

public class Truck extends Wheeler {

  public Truck(int velocity, String carName, int wheelNum) {
    super(velocity, carName, wheelNum);
  }

  @Override
  public void speedUp(int speed) {
    velocity += speed * 5;
    if (velocity > 100) {
      velocity = 100;
      System.out.println("트럭의 최고속도위반으로 속도를 100 으로 낮춥니다.");
      return;
    }
    System.out.println(getCarName() + "의 현재 속도는 " + velocity + " 입니다.");
  }

  @Override
  public void speedDown(int speed) {
    velocity -= speed * 5;
    if (velocity < 50) {
      velocity = 50;
      System.out.println("트럭의 최저속도위반으로 속도를 50 으로 올립니다.");
      return;
    }
    System.out.println(getCarName() + "의 현재 속도는 " + velocity + " 입니다.");
  }
}