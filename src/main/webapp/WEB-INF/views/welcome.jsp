<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Welcome</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
	</head>
	
	<body>
		<div class="container-fluid bg-dark text-white mx-auto p-5">
			<h1 class="h1">${greeting}</h1>
			<p class="lead">${tagline}</p>
		</div>
	</body>
</html>