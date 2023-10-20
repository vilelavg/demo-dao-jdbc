package model.dao;

import db.DB;
import model.dao.impl.DepartmentDAOjdbc;
import model.dao.impl.SellerDAOjdbc;

public class DAOFactory {

	public static SellerDAO createSellerDao () {
		return new SellerDAOjdbc(DB.getConnection());
	}
	
	public static DepartmentDAO createDepartmentDao () {
		return new DepartmentDAOjdbc(DB.getConnection());
	}
}
