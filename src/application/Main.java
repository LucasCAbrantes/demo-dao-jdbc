package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("==== test 1 : test findById==== ");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		
		System.out.println("==== test 2 :  findByDepartment==== \n");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department );
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("==== test 3 :  findALL==== \n");
		list = sellerDao.findAll();
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("==== test 4:  Insert ==== \n");
		Seller newSeller = new Seller(null,"Greg","greg@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("New Seller id = " + newSeller.getId());
		
		System.out.println("==== test 5:  Updated ==== \n");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("updated completead");
		
		System.out.println("==== test 6:  Delete ==== \n");
		System.out.println("digite o id que deseja remover");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("vendendor deletado com sucesso");
		sc.close();
		
	}

}
