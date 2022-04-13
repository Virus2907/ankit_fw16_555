package sprint1day5question1;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary ;
	private double netSalary;
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public Employee(int employeeId, String employeeName, double salary,int pfprcnt) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		calculateNetSalary(pfprcnt);
	}

	public Employee() {
		
	}
	
	 public void calculateNetSalary(int pfpercentage) {
		 	double netsal=salary-(((double)pfpercentage/100)*salary);
		 	setNetSalary(netsal);
	 }
	public static void main(String[] args) {
		
	
		
		
		
	}

}
