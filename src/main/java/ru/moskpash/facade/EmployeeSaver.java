package ru.moskpash.facade;

public class EmployeeSaver {
    private final Employee employee;

    public EmployeeSaver(Employee employee) {
        this.employee = employee;
    }

    public void saveEmployee() {
        System.out.println("Работник сохранен");
    }

    public void loadEmployee() {
        System.out.println("Работник загружен");
    }
}
