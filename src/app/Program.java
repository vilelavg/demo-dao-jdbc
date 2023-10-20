package app;

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
		
		System.out.print("Digite o ID do vendedor: ");
		
		int n = sc.nextInt();
		
		Seller seller = sellerDAO.findById(n);		
		System.out.println(seller);
		
		System.out.println("Vendedor por departamento");
		
		System.out.print("ID do Departamento: ");
		int x = sc.nextInt();
		
		Department department = new Department(x, null);
		List <Seller> list = sellerDAO.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		
		sc.close();
	}

}
