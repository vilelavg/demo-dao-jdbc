package model.dao;

import model.dao.impl.SellerDAOjdbc;

public class DAOFactory {

	public static SellerDAO createSellerDao () {
		return new SellerDAOjdbc();
	}
	
}
