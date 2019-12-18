<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import = "model.Customer" %>
<%  Customer c = (Customer)session.getAttribute("customer"); %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>お客様情報登録完了</title>
	</head>
	<body>
		<p>
			お客様情報を登録完了しました！<br>登録内容は下記となります。
		</p>

		<table border = "1">
			<tr>
				<td>お客様コード：</td>
				<td><%= c.getCustomerCode() %></td>
			</tr>

			<tr>
				<td>お客様名称：</td>
				<td><%= c.getCustomerName() %></td>
			</tr>

			<tr>
				<td>住所：</td>
				<td><%= c.getAddress() %></td>
			</tr>

			<tr>
				<td>電話：</td>
				<td><%= c.getTel() %></td>
			</tr>

			<tr>
				<td>通貨コード：</td>
				<td><%= c.getTsuka() %></td>
			</tr>
		</table>

		<hr>
		<a href = "/esoft/Customers">お客様マスタ画面へ戻る</a>
	</body>
</html>