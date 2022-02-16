package project;

public class NewClass {

	public void EmployeeName(String empName,int empId) {
		System.out.println(empName);
		System.out.println(empId);
	}
    public void getEmployeeAddress( String empAddress) {
    	System.out.println(empAddress);
    }
    public void EmployeeSalary(double empSalary)
    {
    	System.out.println(empSalary);
    }
    public void EmployeeMobileNumber(long mobNum)
    {
    	System.out.println(mobNum);
    }
public static void main(String[] args) {
	
	NewClass detail = new NewClass();
	detail.EmployeeName("ANUP", 987654);
	detail.getEmployeeAddress("METTUR");
	detail.EmployeeSalary(32000.59);
	detail.EmployeeMobileNumber(9876543210L);
}
}
