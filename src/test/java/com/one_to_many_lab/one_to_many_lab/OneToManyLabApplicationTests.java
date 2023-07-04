package com.one_to_many_lab.one_to_many_lab;

import com.one_to_many_lab.one_to_many_lab.models.Assignment;
import com.one_to_many_lab.one_to_many_lab.models.Department;
import com.one_to_many_lab.one_to_many_lab.models.Employee;
import com.one_to_many_lab.one_to_many_lab.repositories.AssignmentRepository;
import com.one_to_many_lab.one_to_many_lab.repositories.DepartmentRepository;
import com.one_to_many_lab.one_to_many_lab.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OneToManyLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	AssignmentRepository assignmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployee(){
		Department dep1 = new Department("fun");
		departmentRepository.save(dep1);

		Employee employee1 = new Employee("Fred", "Flinstone", "742YABADABADOO", dep1);
		Employee employee2 = new Employee("Panos", "John", "12345", dep1);
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);

		Assignment assignment1 = new Assignment(employee1, "Make trello board");
//		Assignment assignment2 = new Assignment(employee1, "Make wireframe");
		assignmentRepository.save(assignment1);
//		assignmentRepository.save(assignment2);
	}

}
