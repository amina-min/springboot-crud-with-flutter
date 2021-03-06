<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-6 mt-5">


				<h3 style="text-align: center;">Employee Information</h3>

				<c:if test="${data.status.equals('Success')}" >
					<div class="aler alert-success" role="alert">${data.message}</div>
				</c:if>
				<c:if test="${data.status.equals('Failed')}" >
					<div class="aler alert-danger" role="alert">${data.message}</div>
				</c:if>


				<form action="/save" method="post">

					<div class="mb-3">
						<label for="designation" class="form-label">Employee
							Designation</label> <input type="text" class="form-control"
							id="designation" name="designation">
					</div>
					<div class="mb-3">
						<label for="salary" class="form-label">Employee Salary</label> <input
							type="number" class="form-control" id="salary" name="salary">
					</div>
					<div class="mb-3">
						<label for="joiningDate" class="form-label">Joining Date</label> <input
							type="text" class="form-control" id="joiningDate"
							name="joiningDate">
					</div>

					<button type="submit" class="btn btn-primary">Save</button>

				</form>
				
				<a href="/show">Show Employee List</a>
			</div>
		</div>
	</div>

</body>
</html>