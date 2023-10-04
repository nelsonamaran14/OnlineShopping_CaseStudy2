package in.mindcraft.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import in.mindcraft.pojos.Customer;
import in.mindcraft.pojos.Product;
import in.mindcraft.utils.DBUtils;


public class ShopCartDao {
	private Connection cn;
	private PreparedStatement psmt1;
	private PreparedStatement psmt2;
	private PreparedStatement psmt3;
	private PreparedStatement psmt4;
	private PreparedStatement psmt5;
	private PreparedStatement psmt6;
	
	public ShopCartDao(String string, int int1, String string2, double double1, int int2, double double2,
			String string3) {
		// TODO Auto-generated constructor stub
	}

	public double calculateSum(List<Double> numbers) {
        return numbers.stream().mapToDouble(Double::doubleValue).sum();
    }
	
	public void addItems(String username, int id, String product_name, double product_cost,int quantity ,double discount,String invoiced) throws ClassNotFoundException, SQLException {
		
		cn = DBUtils.openConnection();
		
		psmt1 = cn.prepareStatement("Insert into cart values(?,?,?,?,?,?,?)");
		psmt1.setString(1, username);
		psmt1.setInt(2, id);
		psmt1.setString(3, product_name);
		psmt1.setDouble(4, product_cost);
		psmt1.setInt(5, quantity);
		psmt1.setDouble(6, discount);
		psmt1.setString(7, invoiced);
		psmt1.execute();
		
		psmt2 = cn.prepareStatement("Update product set quantity = quantity - 1 where id = ?"); 
		psmt2.setInt(1, id);
		psmt2.execute();		
		
		DBUtils.closeConnection(null, psmt1, cn);
	}
	
	public List<ShopCartDao> showCart(String username) throws ClassNotFoundException, SQLException {
		cn = DBUtils.openConnection();
		
		List<ShopCartDao> cart_list = new ArrayList<>();
		
		psmt2 = cn.prepareStatement("select * from cart where cid = ? and invoiced = 'No'");
		
		psmt2.setString(1, username);
		
		ResultSet rst = psmt2.executeQuery();
		
		while(rst.next()) {
			cart_list.add(new ShopCartDao(rst.getString(1), rst.getInt(2), rst.getString(3), rst.getDouble(4),rst.getInt(5), rst.getDouble(6), rst.getString(7)));
		}
		
		DBUtils.closeConnection(null, psmt1, cn);
		
		return cart_list;
	}

	
	
	
	
	
}
