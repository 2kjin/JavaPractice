package Interface._01;

public abstract class Animal {
  protected int speed;
  protected double distance;

  public Animal(int speed) {
    this.speed = speed;
    this.distance = 0;
  }

  public abstract void run(int hours);

  public double getDistance() {
    return distance;
  }
}
