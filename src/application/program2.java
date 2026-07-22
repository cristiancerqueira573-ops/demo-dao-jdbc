package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class program2 {

	public static void main(String[] args) {
		//System.out.println("---------- Test 1: Insert Department ------------");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = new Department(null, "Sports");
		//departmentDao.insert(department);
		
		
		System.out.println("---------- Test 2: findById Department ------------");
		department = departmentDao.findById(2);
		System.out.println(department);
		
		
		
	}

}
