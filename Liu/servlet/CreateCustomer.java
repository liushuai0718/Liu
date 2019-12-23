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
		//画面入力内容取得
		int customerCode = Integer.parseInt(request.getParameter("customerCode"));
		String customerName = request.getParameter("customerName");
		String address = request.getParameter("address");
		String tel = request.getParameter("tel");
		String tsuka = request.getParameter("tsuka");

		//お客様初期化
		Customer customer = new Customer(customerCode, customerName, address, tel, tsuka);

		//ルクエストスコープにお客様情報を保存
		request.setAttribute("customer", customer);

		//入力内容をデータベースに保存
		CreateCustomerLogic createLogic = new CreateCustomerLogic();
		createLogic.execute(customer);

		//登録完了画面へ移動
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/CreateCustomerComplete.jsp");
		dispatcher.forward(request, response);

	}

}
