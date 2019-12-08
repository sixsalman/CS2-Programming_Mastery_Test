package edu.wmich.cs1120.PMT.SKhan;

public class Sales_Executive extends Employee {

	private int monthlySale;

	public Sales_Executive(String name, int monthlySale) {
		super(name);
		this.monthlySale = monthlySale;
	}

	@Override
	public double getMonthlyWage() {
		int baseSal = 3000 + 800 + 200 + 500;
		if (monthlySale >= 50000) {
			return (baseSal + (2400 / 12));
		} else {
			return baseSal;
		}
	}

}
