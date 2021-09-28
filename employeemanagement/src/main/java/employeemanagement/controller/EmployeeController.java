package employeemanagement.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import employeemanagement.dao.EmployeeDao;
import employeemanagement.model.Departments;
import employeemanagement.model.Employee;



@Controller
public class EmployeeController {

	@Autowired
	Departments departments;
	
	@Autowired
	EmployeeDao dao;
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/")
	public String showForm(Model theModel) {
		List<Object> l = new ArrayList<Object>();
		l.add(departments);
		l.add(new Employee());
		theModel.addAllAttributes(l);
		return "main-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("employee") Employee employee,
			BindingResult theBindingResult, Model model) {
		if (theBindingResult.hasErrors()) {
			model.addAttribute(departments);
			return "main-form";
		}
		else {
			model.addAttribute("emp", employee);
			dao.saveDetails(employee);
			return "employee-confirmation";
		}
	}
	
	@RequestMapping("/searchDetails")
	public String searchDetails(@RequestParam("empNo") int empNo, Model model) {
		Employee employee = dao.getEmployee(empNo);
		List<Employee> employees = dao.getAllEmployees();
		if(employee != null) {
		for(Employee e: employees) {
			if(e.getEmpNo().equals(employee.getEmpNo())) {
				model.addAttribute(employee);
				return "details";
			}
		}
	
	}
		return "error";
	}
	
}












