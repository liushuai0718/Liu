<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>品目新規登録</title>
	</head>

	<body>
		<h1>品目新規登録</h1>
		<hr>

		<form action = "/esoft/CreateItem" method = "post">
			<table border="1">
				<tr>
					<td>品目コード：</td>
					<td><input type = "text" name = "itemCode"></td>
				</tr>

				<tr>
					<td>品目名称：</td>
					<td><input type = "text" name = "itemName"></td>
				</tr>

				<tr>
					<td>単位：</td>
					<td><input type = "text" name = "unit"></td>
				</tr>

				<tr>
					<td>分類：</td>
					<td><input type = "text" name = "bunrui"></td>
				</tr>

				<tr>
					<td>お客様コード：</td>
					<td><input type = "text" name = "customer"></td>
				</tr>

				<tr>
					<td>単価：</td>
					<td><input type = "text" name = "price"></td>
				</tr>

			</table>

			<input type = "submit" value = "登録">
			<input type = "reset" value = "入力内容リセット">

		</form>

		<hr>
		<a href = "/esoft/Items">品目マスタ画面へ戻る</a>
	</body>

</html>