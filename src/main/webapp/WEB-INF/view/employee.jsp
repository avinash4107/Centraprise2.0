<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Centraprise</title>
<link rel="icon" href="/images/logo.gif">
<meta charset="utf-8" />
<meta http-equiv="Content-type" content="text/html" />
<meta name="viewport"
	content="user-scalable=no, initial-scale=1, minimal-ui, maximum-scale=1, minimum-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="/css/bootstrap.min.css" rel="stylesheet">
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css"
	rel="stylesheet" />
<script src="/javascript/2.1.1.jquery.min.js"></script>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.min.js"></script>
<script
	src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
<!-- Export data -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	crossorigin="anonymous"></script>

<!-- Custom Theme Style -->
<link href="/css/styles.css" rel="stylesheet">

<script type="text/javascript" language="javascript">
	function editRecord(id) {
		var f = document.form;
		f.method = "post";
		f.action = 'edit.jsp?id=' + id;
		f.submit();
	}
	$('[data-toggle=offcanvas]').click(
			function() {
				$('.row-offcanvas').toggleClass('active');
				$('.collapse').toggleClass('in').toggleClass('hidden-xs')
						.toggleClass('visible-xs');
			});
</script>
</head>
<body lang="en">

	<div class="container">
		<div class="wrapper">
			<div class="row row-offcanvas row-offcanvas-left">

				<div class="user-list" id="user_list">
					<div class="user-table">

						<div class="text-left">Employee Details</div>
						<div class="text-right">
							<form action="" method="post">
								<input class="btn-src" type="text" name="valueToSearch"
									placeholder="Search" /> <input class="btn btn-info"
									type="submit" name="search" value="search"><br> <br>
							</form>
						</div>

						<form class="form-horizontal" action="" method="post"
							name="upload-excel" enctype="multipart/form-data">
							<br>
							<div class="add-user-btn">
								<a type="button" class="btn btn-info" href="/addemployee">Add
									Employee</a>
							</div>

						</form>

						<div class="form-field">
							<table class='table table-hover table-bordered size'>
								<thead>
									<tr>
										<th><center>
												<strong>ID</strong>
											</center></th>
										<th><center>
												<strong>Emploee Name</strong>
											</center></th>
										<th><center>
												<strong>Employee Number</strong>
											</center></th>
										<th><center>
												<strong>PAN</strong>
											</center></th>
										<th><center>
												<strong>Date of Joining</strong>
											</center></th>
										<th><center>
												<strong>More Info</strong>
											</center></th>
										<th><center>
												<strong>Delete</strong>
											</center></th>

									</tr>
								</thead>
								<tbody>
									<c:forEach items="${employees}" var="employee">
										<tr>
											<td>${employee.id}</td>
											<td>${employee.name}</td>
											<td>${employee.employeeId}</td>
											<td>${employee.panNumber}</td>
											<td>${employee.joiningDate}</td>
											<td><a
												href="/employeeInfo/${employee.primaryEmployeeId}">More
													Info</a></td>
											<td><a href="/delete/${employee.primaryEmployeeId}">Delete</a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>


						<div class="footer">
							<p>
								Copyright &copy;
								<script>
									document.write(new Date().getFullYear())
								</script>
								Centraprise. All Rights Reserved.
							</p>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
</body>
</html>
