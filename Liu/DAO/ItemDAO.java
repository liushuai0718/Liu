package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Item;;

public class ItemDAO {
//	private final String JDBC_URL = "jdbc:h2:~/esoft";
	private final String JDBC_URL = "jdbc:h2:tcp://localhost/~/esoft";
	private final String DB_USER = "liu";
	private final String DB_PASS = "liu";

	public boolean CreateItem(Item item) {

		//データベース接続
		try(Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {

			//INSERT文の準備
			String sql = "INSERT INTO ITEM VALUES(?, ?, ?, ?, ?, ?); INSERT INTO INVENTORY(ITEMCODE) VALUES(?);";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			pStmt.setString(1, item.getItemCode());
			pStmt.setString(2, item.getItemName());
			pStmt.setString(3, item.getUnit());
			pStmt.setString(4, item.getBunrui());
			pStmt.setInt(5, item.getCustomer());
			pStmt.setDouble(6, item.getPrice());
			pStmt.setString(7, item.getItemCode());

			//INSERT文を実行
			int result = pStmt.executeUpdate();
			if(result != 1) {
				System.out.println("失敗");
				return false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		System.out.println("成功");
		return true;
	}

}
