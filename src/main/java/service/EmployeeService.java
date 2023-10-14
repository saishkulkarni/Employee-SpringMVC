package service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import dao.EmployeeDao;
import dto.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	public String insert(Employee employee, ModelMap map) {
		employeeDao.save(employee);
		map.put("message", "Data Saved Success");
		return "Home";
	}

	public String fetchAll(ModelMap map) {
		List<Employee> list = employeeDao.fetchAll();
		if (list.isEmpty()) {
			map.put("message", "Data Not Found");
			return "Home";
		} else {
			map.put("list", list);
			return "Fetch";
		}
	}

	public String delete(int id, ModelMap map) {
		Employee employee = employeeDao.findById(id);
		if (employee == null) {
			map.put("message", "Data Doesnt Exist");
			return fetchAll(map);
		} else {
			employeeDao.delete(employee);
			map.put("message", "Data Deleted Successfully");
			return fetchAll(map);
		}
	}

	public String edit(int id, ModelMap map) {
		Employee employee = employeeDao.findById(id);
		if (employee == null) {
			map.put("message", "Data Doesnt Exist");
			return fetchAll(map);
		} else {
			map.put("emp", employee);
			return "Edit";
		}
	}

	public String update(Employee employee, ModelMap map) {
		employeeDao.update(employee);
		map.put("message", "Data Updated Success");
		return fetchAll(map);
	}

	public String search(String content, ModelMap map) {
		HashSet<Employee> list=new LinkedHashSet<Employee>();

		list.addAll(employeeDao.fetchEmail(content));
		list.addAll(employeeDao.fetchName(content));
		list.addAll(employeeDao.fetchDesignation(content));
		
		try {
		list.addAll(employeeDao.fetchId(Integer.parseInt(content)));
		}
		catch (NumberFormatException e) {
		}

		if (list.isEmpty()) {
			map.put("message", "No Data Found");
			return "Fetch";
		} else {
			map.put("message", "Data Found");
			map.put("list", list);
			return "Fetch";
		}

	}

}
