package edu.wmich.cs1120.PMT.SKhan;

public class Sales_Trainee extends Employee {

	private int monthlySale;

	public Sales_Trainee(String name, int monthlySale) {
		super(name);
		this.monthlySale = monthlySale;
	}

	@Override
	public double getMonthlyWage() {
		int baseSal = 1500 + 500 + 400;
		if (monthlySale >= 10000) {
			return (baseSal + (1200 / 12));
		} else {
			return baseSal;
		}
	}

}
