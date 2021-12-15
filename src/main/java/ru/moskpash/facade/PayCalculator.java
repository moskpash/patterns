package ru.moskpash.facade;

public class PayCalculator {
    Double calculatePay(Employee employee, Double hours) {
        return employee.getSalaryPerHour() * hours;
    }
}
