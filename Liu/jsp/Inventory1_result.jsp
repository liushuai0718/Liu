<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import = "model.Item" %>
<%  Item item = (Item)request.getAttribute("item"); %>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>在庫明細照会</title>
	</head>

	<body>
		<h1>在庫明細照会</h1>
		<hr>

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
				<td>手持ち数量：</td>
				<td><%= item.getOnHand() %></td>
			</tr>

			<tr>
				<td>出荷予定数量：</td>
				<td><%= item.getShuka() %></td>
			</tr>

			<tr>
				<td>入荷予定数量：</td>
				<td><%= item.getNyuka() %></td>
			</tr>

		</table>

		<hr>
		<a href = "/esoft/InventoryMenu">在庫管理メニューへ戻る</a>
	</body>

</html>