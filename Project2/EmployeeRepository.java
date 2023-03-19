package Test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Test.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
}
