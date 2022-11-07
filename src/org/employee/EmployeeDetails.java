package org.employee;

import org.client.ClientDetails;

public class EmployeeDetails {

	// private -> access specifier for given method
	// void    -> return type
	// empName -> method name
	// ()      -> arguments place / input / parameters
	// {}      -> block of the method
	
	//           method 1
	private void empName() {
		System.out.println("Employee name : Anand");
	}
	
//  method 1
	private void empMobile() {
		System.out.println("Employee mobile num: 8939278836");
	}
	
//  main method
	public static void main(String[] args) {
		
		//            obj/ref
		EmployeeDetails e = new EmployeeDetails();
		
		// method call
		e.empName();
		e.empMobile();
		
		Company c = new Company();
		c.comName();
		c.comID();
		
		ClientDetails cl = new ClientDetails();
		cl.clName();
		cl.clLocation();
		
	}
	
	
	
	
}
