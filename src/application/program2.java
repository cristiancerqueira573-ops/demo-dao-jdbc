package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("---------- Test 1: Insert Department ------------");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = new Department(null, "Sports");
		//departmentDao.insert(department);
		
		
		System.out.println("---------- Test 2: findById Department ------------");
		department = departmentDao.findById(2);
		System.out.println(department);
		
		//System.out.println("---------- Test 3: DeletebyID Department ------------");
		//System.out.println("Enter the id: ");
		//int id = sc.nextInt();
		//departmentDao.deleteById(id);
		
		
		
		System.out.println("---------- Test 5: Update Department ------------");
		department = departmentDao.findById(6);
		System.out.println(department);
		department.setName("Finance");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		
		
		
		
		
		System.out.println("---------- Test 4: findAll Department ------------");
		List<Department> list = departmentDao.findAll();
		for(Department dep : list) {
			System.out.println(dep);
		}
	}

}
