package model;

import DAO.CustomerDAO;

public class CreateCustomerLogic {
	public void execute(Customer customer) {
		CustomerDAO dao = new CustomerDAO();
		dao.createCustomer(customer);

	}

}
