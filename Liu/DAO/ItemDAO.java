package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Item;;

public class ItemDAO {
//	private final String JDBC_URL = "jdbc:h2:~/esoft";
	private final String JDBC_URL = "jdbc:h2:tcp://localhost/~/esoft";
	private final String DB_USER = "liu";
	private final String DB_PASS = "liu";

	//品目新規登録
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
//				System.out.println("失敗");
				return false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
//		System.out.println("成功");
		return true;
	}

	//品目在庫確認
	public Item selectItem(String itemCode) {
		Item item = null;

		try(Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {

			//SELECT文の準備
			String sql = "select ITEM.itemCode, ITEM.itemName, ITEM.unit, ITEM.bunrui, ITEM.customerCode, ITEM.price, INVENTORY.onHand, INVENTORY.shuka, INVENTORY.nyuka from ITEM join INVENTORY on (ITEM.itemCode = INVENTORY.itemCode) where ITEM.itemCode = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, itemCode);

			//SELECT文を実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			if(rs.next()) {
				String rsItemCode  = rs.getString("itemCode");
				String rsItemName = rs.getString("itemName");
				String rsItemUnit = rs.getString("unit");
				String rsItemBunrui = rs.getString("bunrui");
				int rsItemCustomerCode = rs.getInt("customerCode");
				double rsItemPrice = rs.getDouble("price");
				double rsOnHand = rs.getDouble("onHand");
				double rsShuka = rs.getDouble("shuka");
				double rsNyuka = rs.getDouble("nyuka");

				item = new Item(rsItemCode, rsItemName, rsItemUnit, rsItemBunrui, rsItemCustomerCode, rsItemPrice, rsOnHand, rsShuka, rsNyuka);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("失敗");
			return null;
		}

		return item;
	}

	public boolean UpdateItemQuantity(String itemCode, double suryou) {

		//データベース接続
		try(Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {

			//UPDATE文の準備
			String sql = "update INVENTORY set ONHAND = ? where ITEMCODE = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			pStmt.setString(1, itemCode);
			pStmt.setDouble(2, suryou);
			/*
			pStmt.setString(3, item.getUnit());
			pStmt.setString(4, item.getBunrui());
			pStmt.setInt(5, item.getCustomer());
			pStmt.setDouble(6, item.getPrice());
			pStmt.setString(7, item.getItemCode());
			*/

			//INSERT文を実行
			int result = pStmt.executeUpdate();
			if(result != 1) {
//				System.out.println("失敗");
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("失敗");
			return false;
		}
		return true;
	}

}
