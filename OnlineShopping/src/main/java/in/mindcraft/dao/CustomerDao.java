package in.mindcraft.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import in.mindcraft.pojos.Customer;
import in.mindcraft.pojos.Product;
import in.mindcraft.utils.DBUtils;

@Component
public class CustomerDao {
	
	private Connection cn;

	private PreparedStatement psmt1;
	private PreparedStatement psmt2;
	private PreparedStatement psmt3;
	private PreparedStatement psmt4;
	private PreparedStatement psmt5;
	private PreparedStatement psmt6;
	
	public void addCustomer(Customer c) throws ClassNotFoundException, SQLException {
		cn = DBUtils.openConnection();
		
		psmt1 = cn.prepareStatement("Insert into customer values(?,?,?)");
		psmt1.setInt(1, c.getCid());
		psmt1.setString(2, c.getName());
		psmt1.setDouble(3, c.getBalance());
		psmt1.execute();
		
		DBUtils.closeConnection(null, psmt1, cn);
	}
	
	public boolean checkCustomer(String username) throws ClassNotFoundException, SQLException {
		boolean b = false;
		cn = DBUtils.openConnection();
		psmt4 = cn.prepareStatement("select * from customer where cid = ?");
		psmt4.setString(1, username);
		ResultSet resultSet = psmt4.executeQuery();
        b = resultSet.next();
        return b;
	}

	public List<Customer> showCustomer() throws ClassNotFoundException, SQLException {
		cn = DBUtils.openConnection();
		
		List<Customer> customer_list = new ArrayList<>();
		
		psmt2 = cn.prepareStatement("select * from customer");
		
		ResultSet rst = psmt2.executeQuery();
		
		while(rst.next()) {
			customer_list.add(new Customer(rst.getInt(1), 
					rst.getString(2), rst.getDouble(3)));
		}
		
		DBUtils.closeConnection(rst, psmt1, cn);
		
		return customer_list;
	}
	
	public void removeCustomer(int cid) throws ClassNotFoundException, SQLException {
		cn = DBUtils.openConnection();
		
		psmt3 = cn.prepareStatement("DELETE FROM customer WHERE cid = ?");
		
		psmt3.setInt(1, cid);
		
		psmt3.execute();

		DBUtils.closeConnection(null, psmt1, cn);
	}
	
	// Method to check if a customer with the given ID and name exists
    public boolean checkCustomerLogin(int cid, String name) throws ClassNotFoundException, SQLException {
        boolean isValid = false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DBUtils.openConnection();
            String selectQuery = "SELECT * FROM customer WHERE cid = ? AND name = ?";
            preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setInt(1, cid);
            preparedStatement.setString(2, name);
            resultSet = preparedStatement.executeQuery();
            isValid = resultSet.next();
        } finally {
            DBUtils.closeConnection(resultSet, preparedStatement, connection);
        }

        return isValid;
    }

	
	public boolean checkBalance(String username, double amt) throws ClassNotFoundException, SQLException {
		double balance = 0.0;
		boolean isSufficient = false;
		
		cn = DBUtils.openConnection();
		
		psmt4 = cn.prepareStatement("select balance from customer where cid = ?");
		
		psmt4.setString(1, username);
		
		ResultSet resultSet = psmt4.executeQuery();
        if(resultSet.next()) {
        	balance = resultSet.getDouble(1);
        }
        System.out.println(balance);
        if(amt < balance) {
        	isSufficient = true;
        	balance = balance - amt;
        	psmt5 = cn.prepareStatement("update customer set balance = ? where cid = ?");
        	
        	psmt5.setDouble(1, balance);
        	psmt5.setString(2, username);
        	psmt5.execute();
        	
        	psmt6 = cn.prepareStatement("update cart set invoiced = 'Yes' where cid = ?");
        	psmt6.setString(1, username);
        	psmt6.execute();
        }
		return isSufficient;
	}
	
}

