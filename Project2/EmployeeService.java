package Test.Service;

import java.util.List;

import Test.Entity.Employee;

public interface EmployeeService {
	
	Employee createEmployee(Employee emp);
	
	List<Employee> getAllEmployee();
	
	Employee getAnEmployee(int empid);
	
	Employee update (Employee emp, int empid);
	
	String delete (int empid);
}
