package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UpdateItemQuantityLogic;

@WebServlet("/Inventory2")
public class Inventory2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/Inventory2.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		//入力内容取得
		String itemCode = request.getParameter("itemCode");
		Double suryou = Double.parseDouble(request.getParameter("suryou"));

		//UPDATE文処理
		UpdateItemQuantityLogic UpdateLogic = new UpdateItemQuantityLogic();
		UpdateLogic.execute(itemCode, suryou);
	}

}
