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
<#list products as product>
    <div>
        <p><b>${product.title}</b> ${product.price} руб. | <a href="/product/${product.id}">Подробнее...</a> <br></p>
    </div>
</#list>
<hr>
<h3>Создать новый товар </h3>
<form action="/product/create" method="post">
    название Обьявления: <input type="text", name="title"/><br><br>
    Описание: <input type="text", name="description"/><br><br>
    Цена: <input type="number", name="price"/><br><br>
    Город: <input type="text", name="city"/><br><br>
    Автор: <input type="text", name="author"/><br><br>


    <input type="submit" value="Добавить товар"/>

</body>
</html>