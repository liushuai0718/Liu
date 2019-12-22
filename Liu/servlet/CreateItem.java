package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.CreateItemLogic;
import model.Item;

@WebServlet("/CreateItem")
public class CreateItem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/CreateItem.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//画面入力内容取得
		String itemCode = request.getParameter("itemCode");
		String itemName = request.getParameter("itemName");
		String unit = request.getParameter("unit");
		String bunrui = request.getParameter("bunrui");
		int customer = Integer.parseInt(request.getParameter("customer"));
		double price = Double.parseDouble(request.getParameter("price"));

		//品目初期化
		Item item = new Item(itemCode, itemName, unit, bunrui, customer, price);

		//セッションスコープにお客様情報を保存
		HttpSession session = request.getSession();
		session.setAttribute("item", item);

		//入力内容をデータベースに保存
		CreateItemLogic createLogic = new CreateItemLogic();
		createLogic.execute(item);



		//登録完了画面へ移動
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/CreateItemComplete.jsp");
		dispatcher.forward(request, response);


	}

}
