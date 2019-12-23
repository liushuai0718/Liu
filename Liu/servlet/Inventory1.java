package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Item;
import model.SelectItemLogic;

@WebServlet("/Inventory1")
public class Inventory1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/Inventory1.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		Item item = null;

		//入力内容取得
		String itemCode = request.getParameter("itemCode");

		//データベースから検索結果取得
		SelectItemLogic selectLogic = new SelectItemLogic();
		item = selectLogic.execute(itemCode);

		//リクエストスコープにお客様情報を保存
		request.setAttribute("item", item);

		//登録完了画面へ移動
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/Inventory1_result.jsp");
		dispatcher.forward(request, response);


	}

}
