package employeemanagement.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import employeemanagement.model.Employee;

@Component
public class EmployeeDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void saveDetails(Employee employee) {
		hibernateTemplate.save(employee);
	}
	
	public Employee getEmployee(int empNo) {
		return hibernateTemplate.get(Employee.class, empNo);
	}
	
	public List<Employee> getAllEmployees(){
		List<Employee> employees = this.hibernateTemplate.loadAll(Employee.class);
		return employees;
	}
}
