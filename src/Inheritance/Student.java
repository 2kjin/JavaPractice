package Inheritance;

public class Student {

  private String name;
  private String subject;
  private int fee;
  private double returnFee;

  public Student(String name, String subject, int fee){
    this.name = name;
    this.subject = subject;
    this.fee = fee;
  }

  public void calcReturnFee(){
    if(subject.equals("javaprogram")){
      returnFee = fee * 0.25;
    }else if(subject.equals("jspprogram")){
      returnFee = fee * 0.2;
    }else {
      System.out.println("그런 과정명은 없습니다");
      return;
    }
  }

  public void print(){
    System.out.println(name + " 씨의 과정명은 " + subject + "이고 교육비는 " + fee + " 이며 환급금은 " + returnFee + " 입니다.");
  }
}
