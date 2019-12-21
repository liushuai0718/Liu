package model;

import DAO.ItemDAO;

public class SelectItemLogic {
	public Item execute(String itemCode) {

		Item item = null;

		ItemDAO dao = new ItemDAO();
		item = dao.selectItem(itemCode);

		return item;
	}

}
