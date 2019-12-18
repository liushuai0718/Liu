<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>受注オーダー作成</title>
	</head>

	<body>
		<h1>受注オーダー作成</h1>
		<hr>

		<form>
			<h4>受注ヘッド：</h4>
			<table border="1">
				<tr>
					<td>受注オーダー：</td>
					<td>1</td>
				</tr>
				<tr>
					<td>得意先：</td>
					<td><input type = "text" name = "customerCode"></td>
				</tr>
				<tr>
					<td>得意先名称：</td>
					<td>A社</td>
				</tr>
				<tr>
					<td>総金額：</td>
					<td>999</td>
				</tr>
			</table>

			<br>

			<h4>受注明細：</h4>
				<table border="1">
					<tr>
						<th>明細行No.</th>
						<th>品目コード</th>
						<th>品目名称</th>
						<th>数量</th>
						<th>単位</th>
						<th>単価</th>
						<th>金額</th>
						<th>通貨コード</th>
						<th>希望納期</th>
					</tr>

					<tr>
						<td><input type = "text" name = "lineNo"></td>
						<td><input type = "text" name = "itemCode"></td>
						<td>サンプル品A</td>
						<td><input type = "text" name = "suryou"></td>
						<td>PC</td>
						<td>100</td>
						<td><input type = "text" name = "totla"></td>
						<td>JPY</td>
						<td><input type = "text" name = "nouki"></td>
					</tr>

					<tr>
						<td><input type = "text" name = "lineNo"></td>
						<td><input type = "text" name = "itemCode"></td>
						<td>サンプル品B</td>
						<td><input type = "text" name = "suryou"></td>
						<td>PC</td>
						<td>200</td>
						<td><input type = "text" name = "totla"></td>
						<td>JPY</td>
						<td><input type = "text" name = "nouki"></td>
					</tr>
					<tr>
						<td><input type = "text" name = "lineNo"></td>
						<td><input type = "text" name = "itemCode"></td>
						<td>サンプル品C</td>
						<td><input type = "text" name = "suryou"></td>
						<td>KG</td>
						<td>300</td>
						<td><input type = "text" name = "totla"></td>
						<td>JPY</td>
						<td><input type = "text" name = "nouki"></td>
					</tr>
					<tr>
						<td><input type = "text" name = "lineNo"></td>
						<td><input type = "text" name = "itemCode"></td>
						<td>サンプル品D</td>
						<td><input type = "text" name = "suryou"></td>
						<td>KG</td>
						<td>400</td>
						<td><input type = "text" name = "totla"></td>
						<td>JPY</td>
						<td><input type = "text" name = "nouki"></td>
					</tr>

				</table>

			<input type = "submit" value = "確定">
			<input type = "reset" value = "入力内容リセット">

		</form>
		<hr>
		<a href = "/esoft/SaleMenu">販売管理メニューへ戻る</a>

	</body>
</html>