<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Products</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
    </head>
    <body>
        <section class="container-fluid bg-dark mx-auto p-5">
            <div class="text-white">
                <h1 class="display-1">Products</h1>
                <p class="lead">List of all available products in store.</p>
            </div>
        </section>
        
        <section class="container-fluid mx-auto p-5">
            <div class="row">
	            <c:forEach items="${products}" var="product">
                <div class="col">
	                <div class="card border-primary h-100">
	                    <div class="card-body">
	                        <h3 class="card-title">${product.name}</h3>
	                        <p class="card-text">${product.description}</p>
	                    </div>
                        <div class="card-footer">
	                        <p class="card-text">USD ${product.unitPrice}</p>
	                        <p class="card-text">Available ${product.unitsInStock} units in stock.</p>
                        </div>
	                </div>
                </div>
	            </c:forEach>
            </div>
        </section>
    </body>
</html>