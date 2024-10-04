package com.bptn.course._06_OOP;

class SalesDepartement extends Departement{
	
	private double totalSalesAmount;
	
	public SalesDepartement(String departementName, int numberOfEmployes, double totalSalesAmount) {
		super(departementName, numberOfEmployes);
		this.totalSalesAmount = totalSalesAmount;
	
	}

}
