package edu.wmich.cs1120.PMT.SKhan;

public class Sales_Manager extends Employee {

	private int monthlySale;

	public Sales_Manager(String name, int monthlySale) {
		super(name);
		this.monthlySale = monthlySale;
	}

	@Override
	public double getMonthlyWage() {
		int baseSal = 6000 + 1000 + 500 + 1000;
		if (monthlySale >= 100000) {
			return (baseSal + (3600 / 12));
		} else {
			return baseSal;
		}
	}

}
