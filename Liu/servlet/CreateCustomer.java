package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CreateCustomerLogic;
import model.Customer;

@WebServlet("/CreateCustomer")
public class CreateCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/CreateCustomer.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int customerCode = Integer.parseInt(request.getParameter("customerCode"));
		String customerName = request.getParameter("customerName");
		String address = request.getParameter("address");
		String tel = request.getParameter("tel");
		String tsuka = request.getParameter("tsuka");

		Customer c = new Customer(customerCode, customerName, address, tel, tsuka);
		CreateCustomerLogic createLogic = new CreateCustomerLogic();
		createLogic.execute(c);

	}

}
