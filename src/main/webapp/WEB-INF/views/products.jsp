<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Products</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
    </head>
    <body>
        <section class="container-fluid mx-auto bg-dark p-5">
            <div class="text-white">
                <h1 class="h1">Products</h1>
                <p class="lead">List of all available products in store.</p>
            </div>
        </section>
        
        <section class="container-fluid mx-auto p-5">
            <div class="text-white">
                <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                    <div class="card">
                        <img class="card-image-top" alt="iPhoneXR Image" src="https://i5.walmartimages.com/seo/Restored-Apple-iPhone-XR-64GB-Unlocked-GSM-Phone-w-12MP-Camera-Black-Refurbished_7d629ff5-52a2-4f66-aa81-6fdb3751deb2_1.f5cc064acd57e0d19837bc2cd823a32f.jpeg?odnHeight=117&odnWidth=117&odnBg=FFFFFF">
                        <div class="card-body bg-grey">
                            <h3 class="card-title">${product.name}</h3>
                            <p class="card-text">${product.description}</p>
                            <p class="card-text">USD ${product.unitPrice}</p>
                            <p class="card-text">Available ${product.unitsInStock} units in stock.</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>