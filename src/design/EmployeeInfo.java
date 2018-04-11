package design;

import java.util.Scanner;

public class EmployeeInfo extends EmpAbastrct implements Employee {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	public static String getAddress() {

		return address;
	}

	public static void setAddress(String address)
	{
		EmployeeInfo.address = address;
	}

	public static String getCompanyName() {

		return companyName;
	}

	public static void setCompanyName(String companyName)
	{
		EmployeeInfo.companyName = companyName;
	}

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String address;
	private static String companyName;
	private String name;
	private int employeeId;
	private int employeeAge;
	private int performance;
	public static int salary;
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId){

		this.employeeId=employeeId;
	}
    public EmployeeInfo(String name, int employeeId){
		this.name=name;
		this.employeeId=employeeId;
		
	}
	public EmployeeInfo(String name, int employeeId, int employeeAge) {
		this.name = name;
		this.employeeId = employeeId;
		this.employeeAge = employeeAge;
	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */                                     //int numberOfYearsWithCompany
	public static double calculateEmployeeBonus( int salary, int performance){
		double total=0;
	 if (performance==10){
	 	total= salary + (salary*.10);
	 }else if(performance==8){
	 	total=salary +(salary+.8);
	 }else if (performance==6){
	 	total=salary +(salary*6);
	 } else if(performance==4){
	 	total=salary + (salary*.2);
	 }else{
	 	total=total;
	 }
		return total;

	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static double calculateEmployeePension(int salary){
		double total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
		//Calculate pension
		String startYear = convertedJoiningDate.substring(convertedJoiningDate.length()-4);
		String currentYear = convertedTodaysDate.substring(convertedTodaysDate.length()-4);

		int start = Integer.parseInt(startYear);
		int current = Integer.parseInt(currentYear);

		if((current-start)==1){
			total =salary * .05;                               //total = salary *.05;
		}else if((current-start)>=2){
			total = salary*.1;
		}else if((current-start)<=1) {
			total = 0;
		}
		System.out.println("Employee Pension is = $ " +total);
		return total;
	}


	//Encapsulation
	public String getName() {
		return name;
	}

	public String setName(String name) {
		this.name = name;
		return name;
	}

	//Employee Interface
	@Override
	public int employeeId()
	{
		return 0;
	}

	public String employeeName() {

		return null;
	}

	public void assignDepartment() {

	}

	public int calculateSalary()
	{
		return 0;
	}

	public void benefitLayout() {

	}

	//abstract method
    public void EmpBreakTime(){

		System.out.println("Employee will take 30 min break");
	}
	//Employee Own method
	public void EmpBenefits() {
	System.out.println(" Employee will get health care benefits ");
	}


	private static class DateConversion {

		public DateConversion(Months months) {
		}

		public static String convertDate(String date) {
			String[] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
		public class nestedClass {
			public void nestedMethod() {
				System.out.println("Name");
			}
		}
	}