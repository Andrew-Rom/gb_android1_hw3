package org.example;

import java.text.DecimalFormat;

import static org.example.Boss.payBonus;
import static org.example.Employee.compareDate;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("Ivan", "Petrovich", "Sidorov",
                        2000, "Manager", "+79990000001", 90000),
                new Employee("Irina", "Sergeevna", "Ivanova",
                        1990, "Account manager", "+79990000002", 100000),
                new Employee("Max", "Olegovich", "Petrov",
                        1980, "Lawyer", "+79990000003", 120000),
                new Employee("Olga", "Petrovna", "Dmitrova",
                        1976, "Logistic manager", "+79990000004", 110000),
                new Employee("Nick", "Petrovich", "Nikolaev",
                        1975, "Support manager", "+79990000005", 120000),
                new Boss("Yara", "Ivanovich", "Bosko",
                        1974, "CEO", "+79990000005", 200000),
                new Boss("Yana", "Nikolaevna", "Bosko",
                        1975, "CFO", "+79990000005", 200000),
        };


        for (Employee employee : employees) {
            System.out.println(employee);
        }
        payBonus(employees, 45, 15500);
        System.out.println("<<< Paid bonus to 45 years old employees except Bosses >>>");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("<<< Paid bonus to all employees except Bosses >>>");
        payBonus(employees, 0, 17777);
        for (Employee employee : employees) {
            System.out.println(employee);
        }


        System.out.println("Average Salary: " + averageSalary(employees));
        System.out.println("Average Age: " + averageAge(employees));


        System.out.println(compareDate(2023, 10, 23,
                2023, 1, 25));
    }


    private static float averageSalary(Employee[] employees) {
        float salaries = 0;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        for (Employee employee : employees) {
            salaries += employee.getSalary();
        }
        return Float.parseFloat(decimalFormat.format(salaries / employees.length).replace(',', '.'));
    }

    private static int averageAge(Employee[] employees) {
        float ages = 0;
        for (Employee employee : employees) {
            ages += employee.getAge();
        }
        return Math.round(ages / employees.length);
    }

}