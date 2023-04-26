package com.bridgelabz.employeepayrollservice;

import java.util.*;

public class EmployeePayrollService {

	public enum IOService {
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	}

	private List<EmployeePayrollData> employeePayrollList;

	public EmployeePayrollService() {

	}

	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
		super();
		this.employeePayrollList = employeePayrollList;
	}

	public static void main(String[] args) {
		ArrayList<EmployeePayrollData> employeeList = new ArrayList<>();
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeeList);
		Scanner consoleInputReader = new Scanner(System.in);
		employeePayrollService.readEmployeePatrollData(consoleInputReader);
		employeePayrollService.writeEmployeePayrollData();
	}

	private void readEmployeePatrollData(Scanner consoleInputReader) {
		System.out.println("Enter Employee ID: ");
		int id = consoleInputReader.nextInt();
		System.out.println("Enter Employee name: ");
		String name = consoleInputReader.next();
		System.out.println("Enter Employee salary: ");
		double salary = consoleInputReader.nextDouble();
		employeePayrollList.add(new EmployeePayrollData(id, name, salary));
	}

	private void writeEmployeePayrollData() {
		System.out.println("\nWriting Employee Payroll Roaster to Console \n" + employeePayrollList);
	}

}
