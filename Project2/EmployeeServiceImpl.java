package Test.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Test.Entity.Employee;
import Test.Repository.EmployeeRepository;
import Test.Service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public Employee createEmployee(Employee emp)  {
		return employeeRepository.save(emp);
	}
	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}
	@Override
	public Employee getAnEmployee(int empid)  {
		return employeeRepository.findById(empid).get();
	}
	@Override
	public Employee update(Employee emp, int empid)  {
		Employee emp1= employeeRepository.findById(empid).get();
		emp1.setAddress(emp.getAddress());
		emp1.setMobno(emp.getMobno());
		return employeeRepository.save(emp1);
	}
	@Override
	public String delete(int empid)
	{
		employeeRepository.deleteById(empid);
		return "The Student with id: "+empid+" has been deleted!!!";
	}
	
}
