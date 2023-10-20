package app;

import java.util.Locale;
import java.util.Scanner;

import model.dao.DAOFactory;
import model.dao.DepartmentDAO;
import model.dao.SellerDAO;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		// SellerDAO sellerDAO = DAOFactory.createSellerDao();

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
		
		/*
		System.out.println("Atualizando vendedor...");
		Seller seller = sellerDAO.findById(10);
		seller.setName("Martha Waine");
		seller.setEmail("marthaw@gmail.com");
		sellerDAO.update(seller);
		
		System.out.println("Completed"); */
		
		/* System.out.println("Deletar vendedor");
		System.out.print("ID do Vendedor: ");
		int n = sc.nextInt();
		
		sellerDAO.deleteById(n);
		
		System.out.println("Processo finalizado"); */
		
		DepartmentDAO departmentDAO = DAOFactory.createDepartmentDao();
		
		/* System.out.println("Criar novo departamento");
		System.out.print("Nome do dept.: ");
		String nameDept = sc.next();
		
		Department dept = new Department(null, nameDept);
		
		departmentDAO.insert(dept); */
		
		System.out.println("Atualizar dept.");
		System.out.print("ID do Dept.: ");
		int n = sc.nextInt();
		
		departmentDAO.findById(n);
		
		System.out.print("Novo nome: ");
		String nameDept = sc.next();
		
		Department dept = new Department(n, nameDept);
		
		departmentDAO.update(dept);
		

		sc.close();
	}

}
