package Interface._01;

public class Dog extends Animal{

  public Dog(int speed) {
    super(speed);
  }

  @Override
  public void run(int hours) {
    distance += speed * (hours / 2.0);
  }

  @Override
  public double getDistance() {
    return super.getDistance();
  }
}
