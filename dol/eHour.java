package dol;

public class eHour extends person {

	private int hour;
	private int tar;
	private int xHour;
	private int xTar;
	private int BruteWage;
	private double NetSalary;
	
	public eHour() {
		super();
		// TODO Auto-generated constructor stub
	}
	public eHour(String names, String lNames, String id, Double iNSS, Double iR, Double toDedud) {
		super(names, lNames, id, iNSS, iR, toDedud);
		// TODO Auto-generated constructor stub
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getTar() {
		return tar;
	}
	public void setTar(int tar) {
		this.tar = tar;
	}
	public int getxHour() {
		return xHour;
	}
	public void setxHour(int xHour) {
		this.xHour = xHour;
	}
	public int getxTar() {
		return xTar;
	}
	public void setxTar(int xTar) {
		this.xTar = xTar;
	}
	public int getBruteWage() {
		return BruteWage;
	}
	public void setBruteWage(int bruteWage) {
		BruteWage = bruteWage;
	}
	public double getNetSalary() {
		return NetSalary;
	}
	public void setNetSalary(double netSalary) {
		NetSalary = netSalary;
	}
	
	
	
	
}
