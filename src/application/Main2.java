package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
		
		System.out.println("=== teste 3 : findAll === \n");
		
		Department newDepartment = new Department(null, "Food");
		departmentDao.insert(newDepartment);
		System.out.println(newDepartment);
		
		
		
		System.out.println("=== teste 4 : update === \n");
		
		department = departmentDao.findById(3);
		department.setName("Celular");
		departmentDao.update(department);
		
		
		System.out.println(departmentDao.findById(3));
		
		System.out.println("=== teste 5 : delete === \n");
		System.out.println("digite o id que deseja remover");
		int at = sc.nextInt();
		departmentDao.deleteById(at);
		System.out.println("departamento deletado com sucesso");
		sc.close();
	}

}
