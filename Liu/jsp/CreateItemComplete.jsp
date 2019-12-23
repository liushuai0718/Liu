<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import = "model.Item" %>
<%  Item item = (Item)request.getAttribute("item"); %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>品目新規登録完了</title>
	</head>
	<body>
		<p>
			品目新規登録完了しました！<br>登録内容は下記となります。
		</p>

		<table border = "1">
			<tr>
				<td>品目コード：</td>
				<td><%= item.getItemCode() %></td>
			</tr>

			<tr>
				<td>品目名称：</td>
				<td><%= item.getItemName() %></td>
			</tr>

			<tr>
				<td>単位：</td>
				<td><%= item.getUnit() %></td>
			</tr>

			<tr>
				<td>分類：</td>
				<td><%= item.getBunrui() %></td>
			</tr>

			<tr>
				<td>お客様コード：</td>
				<td><%= item.getCustomer() %></td>
			</tr>

			<tr>
				<td>単価：</td>
				<td><%= item.getPrice() %></td>
			</tr>

		</table>

		<hr>
		<a href = "/esoft/Items">品目マスタ画面へ戻る</a>
	</body>
</html>