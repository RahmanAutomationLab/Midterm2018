package design;

import databases.ConnectDB;

import java.io.IOException;
import java.sql.SQLException;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException{

		EmployeeInfo emp=new EmployeeInfo(101);
		EmployeeInfo emp1=new EmployeeInfo("MD",102);
		EmployeeInfo emp2=new EmployeeInfo("Kaniz",103,25);

		EmployeeInfo.nestedclass nestedreff=emp.new nestedclass();
		nestedreff.nestedMethod();

		emp1.setName("PeopleNtech");
		System.out.println(emp1.getName());

		EmployeeInfo.calculateEmployeeBonus(12000,8);
		EmployeeInfo.calculateEmployeePension(12000);


		 ConnectDB connecttion=new ConnectDB();
		 connecttion.insertProfileToMySql("md_rahman","employeeId","employeename");




	}


}
