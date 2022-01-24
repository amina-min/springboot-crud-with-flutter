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
				<h1 style="text-align: center;">Employee Table</h1>

				<table class="table">
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Salary</th>
							<th scope="col">Designation</th>
							<th scope="col">Joining Date</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					
					<tbody>
					
					<c:forEach var="e" items="${data.emp}">
						<tr>
							<td>${e.id}</td>
							<td>${e.salary}</td>
							<td>${e.designation}</td>
							<td>${e.joiningDate}</td>
							<td>
								<button>Edit</button>
								<button href="/deleteEmp/${e.id}">Delete</button>
							</td>							
						</tr>					
						</c:forEach>
					</tbody>
				</table>

			</div>
		</div>
	</div>


</body>
</html>