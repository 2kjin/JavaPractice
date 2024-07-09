package Exception._02;

public class CellPhone {
  String model;
  double battery;

  public CellPhone(String model) {
    this.model = model;
  }

  void call(int time){
    System.out.println("충전 시간 : " + time);
    try {
      if (time < 0) {
        throw new IllegalArgumentException("통화시간입력오류");
      }
      battery = Math.max(0, battery - (time * 0.5));
    } catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }
  }

  void charge(int time){
    System.out.println("충전 시간 : " + time);
    try {
      if (time < 0) {
        throw new IllegalArgumentException("충전시간입력오류");
      }
      battery = Math.min(100, battery + (time * 3));
    } catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }
  }

  void printBattery(){
    System.out.println("남은 배터리 양 : " + battery);
  }

}
