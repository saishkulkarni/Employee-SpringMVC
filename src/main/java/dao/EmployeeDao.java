package dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dto.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	EntityManager manager;

	public void save(Employee employee) {
		manager.getTransaction().begin();
		manager.persist(employee);
		manager.getTransaction().commit();
	}

	public List<Employee> fetchAll() {
		return manager.createQuery("select x from Employee x").getResultList();
	}

	public Employee findById(int id) {
		return manager.find(Employee.class, id);
	}

	public void delete(Employee employee) {
		manager.getTransaction().begin();
		manager.remove(employee);
		manager.getTransaction().commit();
	}

	public void update(Employee employee) {
		manager.getTransaction().begin();
		manager.merge(employee);
		manager.getTransaction().commit();
	}

	public List<Employee> fetchEmail(String content) {
		return manager.createQuery("select x from Employee x where email like ?1").setParameter(1, "%" + content + "%")
				.getResultList();
	}

	public List<Employee> fetchName(String content) {
		return manager.createQuery("select x from Employee x where name like ?1").setParameter(1, "%" + content + "%")
				.getResultList();
	}

	public List<Employee> fetchDesignation(String content) {
		return manager.createQuery("select x from Employee x where designation like ?1")
				.setParameter(1, "%" + content + "%").getResultList();
	}

	public List<Employee> fetchId(int content) {
		return manager.createQuery("select x from Employee x where id like ?1").setParameter(1, content)
				.getResultList();
	}

}
