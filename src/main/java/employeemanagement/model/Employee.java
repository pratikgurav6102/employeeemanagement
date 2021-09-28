package employeemanagement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Employee {
	
	@Id
	@NotNull(message="is required")
	private Integer empNo;
	
	@NotNull(message="is required")
	@Pattern(regexp="[a-zA-Z][a-zA-Z ]+[a-zA-Z]$", message="only chars allowed")
	private String empName;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@NotNull(message="is required")
	@Past(message="invalid date")
	private Date dateOfJoining;
	
	@NotNull(message="is required")
	private String dept;
	
	@NotNull(message="is required")
	private long salary;

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	
	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", dateOfJoining=" + dateOfJoining + ", dept="
				+ dept + ", salary=" + salary + "]";
	}

	
}
