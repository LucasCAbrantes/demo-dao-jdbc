package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Main2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== teste 1 : findById === \n");
		
		Department department = departmentDao.findById(2);
		
		System.out.println(department);
		
		System.out.println("=== teste 2 : findAll === \n");
		List<Department> list = new ArrayList<>();
		
		list = departmentDao.findAll();
		
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== teste 2 : findAll === \n");
		
		Department newDepartment = new Department(null, "Food");
		departmentDao.insert(newDepartment);
		System.out.println(newDepartment);
		

	}

}
