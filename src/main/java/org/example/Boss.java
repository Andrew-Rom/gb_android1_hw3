package org.example;

public class Boss extends Employee {
    public Boss(String firstName,
                String secondName,
                String lastName,
                int birthYear,
                String title,
                String phone,
                int salary) {
        super(firstName, secondName, lastName, birthYear, title, phone, salary);
    }

    public static void payBonus(Employee[] employees, int age, int bonus) {
        for (Employee employee : employees) {
            if (employee.getAge() > age && !(employee instanceof Boss)) {
                employee.upSalary(bonus);
            }
        }
    }
}
