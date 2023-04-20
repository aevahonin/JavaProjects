public class BankAccount {
  protected double cardCheck;

  public double getAmount() {
    return cardCheck;
  }

  public void put(double amountToPut) {
    if (amountToPut > 0) {
      cardCheck += amountToPut;
    }
  }

  public void take(double amountToTake) {
    if (amountToTake < cardCheck) {
      cardCheck -= amountToTake;
    }
  }
}
