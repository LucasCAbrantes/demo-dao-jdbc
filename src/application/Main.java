package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("==== test 1 : test findById==== ");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		

	}

}
