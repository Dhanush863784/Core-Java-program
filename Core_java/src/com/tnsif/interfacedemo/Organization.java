package com.tnsif.interfacedemo;

interface TechnicalRole{
	void designArchitecture();
	
}

interface ManagementRole{
	void MangeTeam();
}

class ProjectManager implements TechnicalRole,ManagementRole{
	

	private String name;
	private String Projectname;
	private int teamsize;
	private double projectBudget;
	
	

	public ProjectManager(String name, String projectname, int teamsize, double projectBudget) {
		super();
		this.name = name;
		Projectname = projectname;
		this.teamsize = teamsize;
		this.projectBudget = projectBudget;
	}

	@Override
	public void MangeTeam() {
		System.out.println("Managing a team of "+teamsize+" Developers");
		
	}

	@Override
	public void designArchitecture() {
		System.out.println(name +" is architecture for "+Projectname);
		
	}
	
	void checkBudget() {
		if(projectBudget>1000000) {
			System.out.println("High Budget project");
		}
		else {
			System.out.println("Standard budget project");
		}
	}
	
	void displayProjectdetails() {
		System.out.println("project details:");
		System.out.println("Manager "+name);
		System.out.println("project :"+Projectname);
		System.out.println("Team :"+teamsize);
		System.out.println("Budget :"+projectBudget);
	}
	
}


public class Organization {
public static void main(String[] args) {
	ProjectManager m=new ProjectManager ("Dhanush","E-Commerance Platform",8,250000);
	m.designArchitecture();
	m.MangeTeam();
	m.checkBudget();
	m.displayProjectdetails(); 
}
}