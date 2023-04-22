<!DOCTIPE html>
<html>
<head>
    <title>AutoMarket</title>
</head>
<body>
<h1>
    Hello, AutoMarket Blyat!!!
</h1><hr>
<h4>Cars from all the world</h4>
<b> Название товара: </b>${product.title}<br>
<b> Описание: </b>${product.description}<br>
<b> Цена: </b>${product.price}<br>
<b> Город: </b>${product.city}<br>
<b> автор: </b>${product.author}<br>
<hr>
<form action="/product/delete/${product.id}" method="post">
        <input type="submit" value="Удалить товар"/>
</body>
</html>