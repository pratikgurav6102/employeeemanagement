package employeemanagement.model;

import java.util.LinkedHashMap;
import org.springframework.stereotype.Component;

@Component
public class Departments {

	LinkedHashMap<String, String> depts;

	public Departments(LinkedHashMap<String, String> depts) {
		depts = new LinkedHashMap<String, String>();
		depts.put("AD", "Administration");
		depts.put("IT", "Information Technology");
		depts.put("HD", "Help Desk");
		depts.put("HR", "Human Resource");
		depts.put("OP", "Operation");
		this.depts=depts;
	}

	@Override
	public String toString() {
		return "Departments [map=" + depts + "]";
	}

	public LinkedHashMap<String, String> getDepts() {
		return depts;
	}

	public void setDepts(LinkedHashMap<String, String> depts) {
		this.depts = depts;
	}

	
	
	
	
}
