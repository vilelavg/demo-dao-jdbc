package app;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
			
		SellerDAO sellerDAO = DAOFactory.createSellerDao();
		
		System.out.println("==== TEST 1: seller findById ====");		
		Seller seller = sellerDAO.findById(3);		
		System.out.println(seller);
		
		sc.close();
	}

}
