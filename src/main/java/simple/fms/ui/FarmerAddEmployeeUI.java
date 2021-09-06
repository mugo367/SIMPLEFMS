package simple.fms.ui;


import simple.fms.model.Employee;
import simple.fms.model.enumFiles.Gender;

import java.text.ParseException;
import java.util.Scanner;

public class FarmerAddEmployeeUI {

    public static Employee getEmployee() throws ParseException {
        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the following details:");
        System.out.println("Enter employee number");
        employee.setEmployeeNumber(scanner.nextLine());

        System.out.println("Enter employee name");
        employee.setEmployeeName(scanner.nextLine());

        System.out.println("Enter date of employment (dd-MM-yyyy)");
        employee.setDateOfEmp(scanner.nextLine());

        System.out.println("Enter Gender");
        employee.setGender(Gender.valueOf(scanner.nextLine()));

        System.out.println("Enter employee email");
        employee.setEmail(scanner.nextLine());

        System.out.println("Enter employee contact");
        employee.setContact(scanner.nextLine());

        System.out.println("Enter employee emergency contact");
        employee.setEmergencyContact(scanner.nextLine());

        return employee;

    }
    public static Employee getEmployeeNumber() throws ParseException {
        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the employee number you want to delete");
        employee.setEmployeeNumber(scanner.nextLine());
        return employee;
    }
}
