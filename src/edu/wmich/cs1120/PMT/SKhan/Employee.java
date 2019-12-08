package edu.wmich.cs1120.PMT.SKhan;

public abstract class Employee implements IEmployee {

	private String name;

	public Employee(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public abstract double getMonthlyWage();

}
