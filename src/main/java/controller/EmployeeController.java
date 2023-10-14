package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dto.Employee;
import service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/")
	public String loadHome() {
		return "Home";
	}

	@GetMapping("/insert")
	public String loadInsert() {
		return "Insert";
	}

	@PostMapping("/insert")
	public String insertData(ModelMap map, Employee employee) {
		return employeeService.insert(employee, map);
	}

	@GetMapping("/fetch")
	public String loadFetch(ModelMap map) {
		return employeeService.fetchAll(map);
	}

	@GetMapping("/delete")
	public String delete(@RequestParam int id, ModelMap map) {
		return employeeService.delete(id, map);
	}

	@GetMapping("/edit")
	public String loadEdit(@RequestParam int id, ModelMap map) {
		return employeeService.edit(id, map);
	}
	
	@PostMapping("/update")
	public String updateData(ModelMap map, Employee employee) {
		return employeeService.update(employee, map);
	}
	
	@PostMapping("/search")
	public String search(@RequestParam String content,ModelMap map)
	{
		return employeeService.search(content,map);
	}
}
