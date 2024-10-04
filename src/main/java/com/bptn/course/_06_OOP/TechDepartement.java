package com.bptn.course._06_OOP;

class TechDepartement extends Departement {
	
	private double totalPurchaseAmount;
	
	public TechDepartement(String departementName, int numberOfEmployes, double totalPurchaseAmount) {
		super(departementName, numberOfEmployes);
		this.totalPurchaseAmount = totalPurchaseAmount;
	}
	
	}

	
