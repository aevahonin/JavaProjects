import java.util.*;

public class Company{
    private double allEarnedMoneyByEmployees = 0;

    ArrayList<Employee> employees = new ArrayList<>();

    public List<Employee> getTopSalaryStaff(int count) {
        return getFilteredLimitedList(count, (o1, o2) -> (int) (o2.getMonthSalary() - o1.getMonthSalary()));
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        return getFilteredLimitedList(count, (o1, o2) -> (int) (o1.getMonthSalary() - o2.getMonthSalary()));
    }

    private List<Employee> getFilteredLimitedList(int count, Comparator<Employee> comparator) {
        List<Employee> copyList = new ArrayList<>(employees);
        copyList.sort(comparator);
        List<Employee> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(copyList.get(i));
        }
        return result;
    }

    public void hire (Employee employee) {
        employees.add(employee);
    }

    public void hireAll (Collection<Employee> employees) {
        this.employees.addAll(employees);
    }

    public void fire (Employee employee) {
        employees.remove(employee);
    }

    public double getIncome() {
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                allEarnedMoneyByEmployees += ((Manager) employee).getEarnedMoneyByEmployee();
            }
        }
        return allEarnedMoneyByEmployees;
    }

    public int countEmployees() {
        return employees.size();
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
