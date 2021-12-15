package ru.moskpash.facade;

public class EmployeeFacade {

    private final PayCalculator payCalculator = new PayCalculator();
    private final HourReporter hourReporter = new HourReporter();
    private Employee employee;
    private EmployeeSaver employeeSaver;

    Double calculatePay() {
        return payCalculator.calculatePay(employee, hourReporter.getHours());
    }

    void reportHours() {
        hourReporter.reportHours();
    }

    Double getHours() {
        return hourReporter.getHours();
    }

    public void saveEmployee() {
        employeeSaver = new EmployeeSaver(employee);
        employeeSaver.saveEmployee();
    }

    public void loadEmployee() {
        employeeSaver.loadEmployee();
    }

}
