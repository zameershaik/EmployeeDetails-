package Employee;

import java.util.Date;

public class Employee {
	private int empID;
	private String empName;
	private Date empJoiningDate;
	
	
	
	public Employee(int empID, String empName, Date empJoiningDate) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empJoiningDate = empJoiningDate;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getEmpJoiningDate() {
		return empJoiningDate;
	}
	public void setEmpJoiningDate(Date empJoiningDate) {
		this.empJoiningDate = empJoiningDate;
	}
	
	
	
}
