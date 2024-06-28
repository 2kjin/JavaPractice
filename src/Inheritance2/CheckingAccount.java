package Inheritance2;

public class CheckingAccount extends Account{
  String cardNo;

  public CheckingAccount(){
    super();
  }

  public CheckingAccount(String accId, long balance, String ownerName, String cardNo) {
    super(accId, balance, ownerName);
    this.cardNo = cardNo;
  }

  public void pay(String cardNo, long amount){
    if( cardNo.equals(getAccId()) || amount < getBalance() ){
      withdraw(amount);
    }else {
      System.out.println("지불이 불가능합니다.");
    }
  }

  @Override
  public void calcRate() {

  }
}
