import java.time.LocalDate;

public class DepositAccount extends BankAccount {
    LocalDate lastIncome = null;
    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
        lastIncome = LocalDate.now();
    }
    @Override
    public void take(double amountToTake) {
        LocalDate currentIncome = LocalDate.now();
            if (currentIncome.isBefore(lastIncome.plusMonths(1))) {
              return;
            }
            super.take(amountToTake);
    }
}
