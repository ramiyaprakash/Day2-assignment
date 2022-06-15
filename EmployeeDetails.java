package week1.day2;

public class EmployeeDetails {
	public void printEmployeeName(String empName, int empId) //-> print the empName & empId
	{
		System.out.println("Employee Name is " + empName + " & Employee ID is " + empId);
	}
	public void getEmployeeAddress(String empAddress) //-> print address (eg: Chennai)
	{
		System.out.println("Employee Address is " + empAddress);
		

	}
	public void printEmployeeSalary(double empSalary) //-> print the empSalary
	{
		System.out.println("Employee Salary is " + empSalary);

	}
	public void printEmployeeMobileNumber(long mobNum) //-> print the phoneNumber
	{
		System.out.println("Employee Mobile Number is " + mobNum);

	}

	//Call all the methods from main() and execute
	public static void main(String[] args) {
		EmployeeDetails myemp = new EmployeeDetails();
		myemp.printEmployeeName("Ramiya",12345678);
		myemp.getEmployeeAddress("Pondicherry");
		myemp.printEmployeeSalary(40000.00);
		myemp.printEmployeeMobileNumber(1234567890);


	}
}
