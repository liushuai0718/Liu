package model;

import DAO.ItemDAO;

public class UpdateItemQuantityLogic {
	public void execute(String itemCode, double suryou) {
		ItemDAO dao = new ItemDAO();
		dao.updateItemQuantity(itemCode, suryou);

	}
}
