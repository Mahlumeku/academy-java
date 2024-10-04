package com.bptn.course._06_OOP;

class Departement {

	private String departemnetName;
	private int numberOfEmployes; 
	
	public Departement(String departementName, int numberOfEmployes) {
		
		this.departemnetName = departementName; 
		this.numberOfEmployes = numberOfEmployes;
	}
	
	public void departementInfo() {
		System.out.println("Name of Departement: " + departemnetName);
		System.out.println("Name of the Employes: " + numberOfEmployes);
		
	}
	
	}
	
