public class TopManager  implements Employee {

    public Company company;

    public TopManager (Company company) {
       this.company = company;
    }

    @Override
    public double getMonthSalary() {
        if (company.getIncome() > 10000000) {
            return fixedPart + (fixedPart * 1.5);
        } else {
            return fixedPart;
        }
    }
}
