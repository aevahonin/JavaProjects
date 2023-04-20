package AdvancedOOPFeatures.homework_1.src.main.java;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        System.out.println(staff);
    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {
        staff.sort((o1, o2) -> {
            int zp = o1.getSalary().compareTo(o2.getSalary());
                    if (zp != 0 ){
                        return zp;
                    }
                    return o1.getName().compareTo(o2.getName());

        });

        //staff.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));

        //TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.
    }
}