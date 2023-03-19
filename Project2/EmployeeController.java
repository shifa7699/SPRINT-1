package Test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Test.Entity.Employee;
import Test.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	 // get all employee
	@GetMapping("/employees")
	public List<Employee> getCAllEmployee()
	{
		return employeeService.getAllEmployee();
	}
	// Get an Employee detail by id
	@GetMapping("/employees/{id}")
	public Employee getCAEmployee(@PathVariable int empid) {
		return employeeService.getAnEmployee(empid);
	}
	// Create an Employee
	@PostMapping("/employees")
	public Employee createAnewEmployee(@RequestBody Employee emp)
	{
		return employeeService.createEmployee(emp);
	}
	// Update an Employee 
	@PutMapping("/employees/{id}")
	public Employee updateCAnEmployee(@PathVariable int empid, @RequestBody Employee emp)
	{
		return employeeService.update(emp, empid);
	}
	//Delete an existing Employee by id
	@DeleteMapping("/students/{id}")
	public String deleteCAnEmployee(int empid)
	{
		return employeeService.delete(empid);
	}
}
