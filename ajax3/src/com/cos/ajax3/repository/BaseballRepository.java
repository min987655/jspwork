package com.cos.ajax3.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BaseballRepository {
	private static final String TAG = "BaseballRepository : "; 
	
	private static BaseballRepository instance = new BaseballRepository();
	private BaseballRepository() {}
	public static BaseballRepository getInstance() {
		return instance;
	}
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	/*public List<Product> findAll() {
		final String SQL = "SELECT id, name, type, price, count FROM product ORDER BY id ASC";
		List<Product> products = new ArrayList<>();
		
		try {
			conn = DBconn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				Product product = new Product(
								rs.getInt("id"),
								rs.getString("name"),
								rs.getString("type"),
								rs.getInt("price"),
								rs.getInt("count")
						
				);
				products.add(product);
				System.out.println(TAG + "product : " + product);
			}
			return products;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG + "findAll : " + e.getMessage());
		} finally {
			DBconn.close(conn, pstmt, rs);
		}
		return null;
	}*/
}
