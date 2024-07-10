package API._01;

import java.util.Objects;

public class Vehicle {

  Owner owner;
  int price;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(owner, vehicle.owner);
  }

  @Override
  public String toString() {
    return "소유주정보 : 이름은 " + owner + "이고, " +
        "\n차량정보 : 가격은 " + price + "입니다.";
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
