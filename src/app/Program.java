package app;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Department dpt = new Department(2, "books");
		Seller slr = new Seller(1, "bob", "bob@gmail.com", new Date(), 3200.0, dpt);
		
		System.out.println(slr);
		
		sc.close();
	}

}
