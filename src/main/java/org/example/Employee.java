package org.example;

import java.time.Year;
import java.util.Date;

public class Employee {
    private final String firstName;
    private String secondName;
    private final String lastName;
    private int currentYear = Year.now().getValue();
    private final int birthYear;
    private int birthMonth;
    private int birthDay;

    private String title;
    private String phone;
    private int salary;

    public Employee(String firstName,
                    String secondName,
                    String lastName,
                    int birthYear,
                    String title,
                    String phone,
                    int salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.title = title;
        this.phone = phone;
        this.salary = salary;
    }

    public Employee(String firstName,
                    String lastName,
                    int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return currentYear - birthYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void upSalary(int bonus) {
        this.salary += bonus;
    }

    @Override
    public String toString() {
        return String.format("Employee{" +
                firstName + " " + secondName + " " + lastName +
                ", age=" + getAge() +
                ", title=" + title +
                ", phone=" + phone +
                ", salary=" + salary +
                '}');
    }

    public static int compareDate(int firstDateYear, int firstDateMonth, int firstDateDay,
                                  int secondDateYear, int secondDateMonth, int secondDateDay) {
        Date firstDate = new Date(firstDateYear, firstDateMonth - 1, firstDateDay);
        Date secondDate = new Date(secondDateYear, secondDateMonth - 1, secondDateDay);
        return (int) ((firstDate.getTime() - secondDate.getTime()) / (24 * 60 * 60 * 1000)); //(24ч*60мин*60сек*1000мс)
    }
}
