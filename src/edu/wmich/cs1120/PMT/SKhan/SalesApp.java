package edu.wmich.cs1120.PMT.SKhan;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SalesApp implements ISalesApp {

	private List<IEmployee> employees = new LinkedList<IEmployee>();

	@Override
	public void addEmployee(IEmployee m) {
		employees.add(m);
	}

	@Override
	public double getMonthlyEmployeeWages() {
		Iterator<IEmployee> empIterator = employees.iterator();
		double totWages = 0;
		while (empIterator.hasNext()) {
			totWages += empIterator.next().getMonthlyWage();
		}
		return totWages;
	}

	@Override
	public List<IEmployee> getEmployees() {
		return employees;
	}

}
