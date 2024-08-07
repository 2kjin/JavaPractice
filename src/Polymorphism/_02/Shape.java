package Polymorphism._02;

public abstract class Shape {
  private double area;
  private String name;

  public Shape(){
  }

  public Shape(String name) {
    this.name = name;
  }

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  abstract void calculationArea();

  public void print() {
    System.out.println(getName() + "의 면적은 " + getArea());
  }
}
