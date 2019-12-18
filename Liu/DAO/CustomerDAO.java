package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Customer;

public class CustomerDAO {
	private final String JDBC_URL = "jdbc:h2:~/esoft";
	private final String DB_USER = "liu";
	private final String DB_PASS = "liu";

	public boolean CreateCustomer(Customer c) {

		//データベース接続
		try(Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {

			//INSERT文の準備
			String sql = "INSERT INTO CUSTOMERS VALUES(?, ?, ?, ?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			pStmt.setInt(1, c.getCustomerCode());
			pStmt.setString(2, c.getCustomerName());
			pStmt.setString(3, c.getAddress());
			pStmt.setString(4, c.getTel());
			pStmt.setString(5, c.getTsuka());

			//INSERT文を実行
			int result = pStmt.executeUpdate();
			if(result != 1) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("insert文実行失敗");
			return false;
		}
		System.out.println("登録成功");
		return true;
	}

}
