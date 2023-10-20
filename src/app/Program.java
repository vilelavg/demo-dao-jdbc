package app;

import java.util.Date;
import java.util.List;
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

		/* System.out.print("Digite o ID do vendedor: ");

		int n = sc.nextInt(); 

		Seller seller = sellerDAO.findById(3);
		 System.out.println(seller);

		System.out.println("Vendedor por departamento");

		System.out.print("ID do Departamento: ");
		int x = sc.nextInt();

		Department department = new Department(x, null);
		List<Seller> list = sellerDAO.findByDepartment(department);

		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("Todos os vendedores");
		list = sellerDAO.findAll();

		for (Seller slr : list) {
			System.out.println(slr);
		}

		System.out.println("inserindo vendedor");
		Seller newSeller = new Seller(null, "Greg Mendez", "greg@gmail.com", new Date(), 3590.0, department);
		sellerDAO.insert(newSeller);
		System.out.println(newSeller); */
		
		System.out.println("Atualizando vendedor...");
		Seller seller = sellerDAO.findById(10);
		seller.setName("Martha Waine");
		seller.setEmail("marthaw@gmail.com");
		sellerDAO.update(seller);
		
		System.out.println("Completed");

		sc.close();
	}

}
