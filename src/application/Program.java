package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Test 1: seller findById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println("=== Test 2: seller findByIdDepartment ====");
		Department depart = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartment(depart);
		System.out.println(seller);
		for( Seller seller1 : list) {
			System.out.println(seller1);
		}
	}

}
