package edu.wmich.cs1120.PMT.SKhan;

import java.util.List;

public interface ISalesApp {
	/**
	 * Return an arrayList of the Sales employees
	 * 
	 * @return A list of the Sales employees
	 */
	List<IEmployee> getEmployees();

	/**
	 * Add the employee object to the list of employees of the Sales Company.
	 * 
	 * @param m The employee to be added
	 */
	void addEmployee(IEmployee m);

	/**
	 * Computes and returns the total monthly wages of all the employees of the
	 * Company.
	 * 
	 * @return Total wages of all employees
	 */
	double getMonthlyEmployeeWages();
}
