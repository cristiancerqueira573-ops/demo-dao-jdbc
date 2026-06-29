package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1,"Books");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/YYYY");
		
		Seller obj1 = new Seller(1, "João", "joaoPedro@gmail.com", new Date(), 2000.0,obj);

		System.out.println(obj1);
	}

}
