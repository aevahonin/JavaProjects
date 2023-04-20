public class CardAccount extends BankAccount {
    @Override
    public void take(double amountToTake) {
        double commission = amountToTake / 100;
        amountToTake += commission;
        super.take(amountToTake);
    }
}
