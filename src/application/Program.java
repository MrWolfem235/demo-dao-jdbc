package application;

import java.util.Date;

import mode.entities.Seller;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {

		Department dp = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, dp);
		
		System.out.println(seller);
		
	}

}
