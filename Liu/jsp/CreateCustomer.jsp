<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>お客様情報登録</title>
	</head>

	<body>
		<h1>お客様情報登録</h1>
		<hr>

		<form action = "/esoft/CreateCustomer" method = "post">
			<table border="1">
				<tr>
					<td>お客様コード：</td>
					<td><input type = "text" name = "customerCode"></td>
				</tr>

				<tr>
					<td>お客様名称：</td>
					<td><input type = "text" name = "customerName"></td>
				</tr>

				<tr>
					<td>住所：</td>
					<td><input type = "text" name = "address"></td>
				</tr>

				<tr>
					<td>電話：</td>
					<td><input type = "text" name = "tel"></td>
				</tr>

				<tr>
					<td>通貨コード：</td>
					<td><input type = "text" name = "tsuka"></td>
				</tr>

			</table>

			<input type = "submit" value = "登録">
			<input type = "reset" value = "入力内容リセット">

		</form>

		<hr>
		<a href = "/esoft/Customers">お客様マスタ画面へ戻る</a>
	</body>

</html>