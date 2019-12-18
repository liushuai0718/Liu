package model;

import DAO.CustomerDAO;

public class CreateCustomerLogic {
	public void execute(Customer c) {
		CustomerDAO dao = new CustomerDAO();
		dao.CreateCustomer(c);

	}

}
