<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>在庫調整</title>
	</head>

	<body>
		<h1>在庫調整</h1>
		<hr>

		<form action = "/esoft/Inventory2" method = "post">
			<table border = "1">
				<tr>
					<th>品目コード</th>
					<th>品目名称</th>
					<th>調整数量</th>
				</tr>

				<tr>
					<td><input type = "text" name = "itemCode"/></td>
					<td></td>
					<td><input type = "text" name = "suryou" /></td>
				</tr>
			</table>
			<input type = "submit" value = "確定" />
			<input type = "reset" value = "入力内容リセット" />
		</form>

		<hr>
		<a href = "/esoft/InventoryMenu">在庫管理メニューへ戻る</a>
	</body>

</html>