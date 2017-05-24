package Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Employee.Developer;
import Employee.Employee;

public class EmployeeDetails {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String oldstring = "2011-01-18 00:00:00.0";
		Employee emp = new Employee(100,"zameer", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(oldstring), oldstring, 0, false, 0);
		
	}
	 Developer developer = new Developer(1001, "zameer", "Android Dev", "01-03-2017",
             "Nayanesh", "Permanent", true, 900154, (short) 15,
             (short) 22745, 0, (short) 25);
     


}
