package model;

import DAO.ItemDAO;

public class CreateItemLogic {
	public void execute(Item item) {
		ItemDAO dao = new ItemDAO();
		dao.createItem(item);

	}

}
