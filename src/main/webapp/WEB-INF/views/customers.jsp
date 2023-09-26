<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Customers</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
    </head>
    <body>
        <section class="container-fluid bg-dark mx-auto p-5">
            <div class="text-white">
                <h1 class="display-1">Customers</h1>
                <p class="lead">List of all customers in store</p>
            </div>
        </section>

        <section class="container-fluid mx-auto p-5">
            <table class="table table-striped table-hover">
                <thead>
                    <tr>
                        <th scope="col">Customer Id</th>
                        <th scope="col">Customer Name</th>
                        <th scope="col">Customer Address</th>
                        <th scope="col">Customer Orders Count</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${customers}" var="customer">
                    <tr>
                        <th scope="row">${customer.customerId}</th>
                        <td>${customer.name}</td>
                        <td>${customer.address}</td>
                        <td>${customer.noOfOrdersMade}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </section>
    </body>
</html>