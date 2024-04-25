<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Discount Calculator</title>
</head>
<body>
<h1>Giamr giá sản phẩm </h1>
<form action="discount" method="post">
    <label for="productDesc">Mô tả sản phẩm:</label><br>
    <input type="text" id="productDesc" name="productDesc"><br>
    <label for="listPrice">Giá :</label><br>
    <input type="number" id="listPrice" name="listPrice"><br>
    <label for="discountPercent">Chiết khấu:</label><br>
    <input type="number" id="discountPercent" name="discountPercent"><br><br>
    <input type="submit" value="Calculate Discount">
</form>
</body>
</html>