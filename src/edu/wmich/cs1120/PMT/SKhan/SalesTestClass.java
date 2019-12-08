package edu.wmich.cs1120.PMT.SKhan;

import java.util.List;

public class SalesTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISalesApp sales = new SalesApp();

		IEmployee emp1 = new Sales_Manager("John Smith", 102500);
// Pass the employee name and monthlySale as parameters to constructor
		IEmployee emp2 = new Sales_Executive("Jane Jones", 40000);
		IEmployee emp3 = new Sales_Trainee("Ruth Sharp", 10000);

		sales.addEmployee(emp1);
		sales.addEmployee(emp2);
		sales.addEmployee(emp3);

		List<IEmployee> employees = sales.getEmployees();
		System.out.println("Employee List");
		System.out.println("=============\n");

		for (int i = 0; i < employees.size(); i++) {
			System.out.printf("%s \t$ %,6.2f\n", employees.get(i).getName(), employees.get(i).getMonthlyWage());
		}
		System.out.printf("\nTotal wages: \t$ %,6.2f\n\n", sales.getMonthlyEmployeeWages());

		IEmployee emp4 = new Sales_Manager("Dempsey Dean", 80000);
		IEmployee emp5 = new Sales_Trainee("Sophia Weather", 20000);

		sales.addEmployee(emp4);
		sales.addEmployee(emp5);

		for (int i = 0; i < employees.size(); i++) {
			System.out.printf("%s \t$ %,6.2f\n", employees.get(i).getName(), employees.get(i).getMonthlyWage());
		}
		System.out.printf("\nTotal wages: \t$ %,6.2f\n", sales.getMonthlyEmployeeWages());

	}
}
