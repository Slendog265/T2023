package dol;

public class eMonth extends person {

	private double minWage;
	private double netSalary;
	public eMonth() {
		super();
		// TODO Auto-generated constructor stub
	}
	public eMonth(String names, String lNames, String id, Double iNSS, Double iR, Double toDedud) {
		super(names, lNames, id, iNSS, iR, toDedud);
		// TODO Auto-generated constructor stub
	}
	public double getMinWage() {
		return minWage;
	}
	public void setMinWage(double minWage) {
		this.minWage = minWage;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	
	
	
}
