public class Manager  implements Employee {

    private final double earnedMoneyByEmployee = (115000 + (Math.random() * 25000));

    @Override
    public double getMonthSalary() {
        return fixedPart + (earnedMoneyByEmployee * 0.05);
    }

    public double getEarnedMoneyByEmployee() {
        return earnedMoneyByEmployee;
    }

}
