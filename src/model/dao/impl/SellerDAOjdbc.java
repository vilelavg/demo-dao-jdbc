package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class SellerDAOjdbc implements SellerDAO {
	
	private Connection conn;
	
	public SellerDAOjdbc (Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Seller obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Seller obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Seller findById(Integer id) {
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			pst = conn.prepareStatement(
					"SELECT seller.*,department.Name as DepName "
					+ "FROM seller INNER JOIN department "
					+ "ON seller.DepartmentId = department.Id "
					+ "WHERE seller.Id = ? ");
			
			pst.setInt(1, id);
			
			rs = pst.executeQuery(); // por padrão, essa consulta retorna como 0. Sendo assim, criamos uma condição if com rs.next() para pegar os dados desejados
			
			if (rs.next()) {
				
				Department dep = new Department();
				
				dep.setId(rs.getInt("DepartmentId"));				
				dep.setName(rs.getString("DepName"));
				
				Seller seller = new Seller();
				
				seller.setId(rs.getInt("Id"));
				seller.setName(rs.getString("Name"));
				seller.setEmail(rs.getString("Email"));
				seller.setBaseSalary(rs.getDouble("BaseSalary"));
				seller.setBirthDate(rs.getDate("BirthDate"));
				seller.setDepartment(dep);
				
				return seller;
				
			}
			
			return null;		
			
		} catch (SQLException e) {
			
			throw new DbException(e.getMessage());
		} finally {
			
			DB.closeStatement(pst);
			DB.closeResultSet(rs);
		}
		
		}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
