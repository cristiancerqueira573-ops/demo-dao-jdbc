package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Test 1: seller findById ====");
		Seller seller = sellerDao.findById(3);
		
		System.out.println("=== Test 2: seller findByIdDepartment ====");
		Department depart = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(depart);
		for( Seller seller1 : list) {
			System.out.println(seller1);
			
			
	
		
	}
		System.out.println("=== Test 3: seller findAll ====");
		 list = sellerDao.findAll();

		for(Seller seller1 : list) {
			System.out.println(seller1);
		
		
		
		
		
	}
		
		
		
		
		//System.out.println("=== Test 4: seller Insert ====");
		
		// Seller seller2 = new Seller(null,"Greg","greg@gmail.com",new Date(),4500.00,depart);
		 //sellerDao.insert(seller2);
			
		//System.out.println(seller2.getId());
		
		System.out.println("=== Test 5: seller Update ====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed");

		System.out.println("=== Test 6: seller Delete ====");
		System.out.println("Enter id test deletion: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
	}
		
		
}


