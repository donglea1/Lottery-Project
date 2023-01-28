<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Lotto - KQXS</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

<!-- link ICON-Fontawesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">

</head>
<body>
	<jsp:include page="/views/header.jsp"></jsp:include>

	<jsp:include page="/views/body.jsp"></jsp:include>
	<%-- <div class="container mt-5">
		<div class="row">
			<div class="col-sm-5">
				<script language="javascript"
					src="//www.minhngoc.com.vn/jquery/jquery-1.7.2.js"></script>
				<link rel="stylesheet" type="text/css"
					href="//www.minhngoc.com.vn/style/bangketqua_mini.css" />
				<div id="box_kqxs_minhngoc">
					<script language="javascript">
						bgcolor = "#A40E0D";
						titlecolor = "#FFFCF9";
						dbcolor = "#000000";
						fsize = "24px";
						kqwidth = "490px";
					</script>
					<script language="javascript"
						src="//www.minhngoc.com.vn/getkqxs/tp-hcm.js"></script>
				</div>
			</div>
			<div class="col-sm-4">
				<!-- bai lam  -->
				<form action="/getKQSX" method="get">
					<h2>Do so</h2>
					<div class="mb-3 mt-3">
						<div>
							<select name="ngay" id="box_kqxs_ngay"
								onchange="getnew_boxkqxs_ngay();" style="font-size: 24px;">
								<option value="23-01-2023" selected="selected">23/01/2023</option>
								<option value="21-01-2023">21/01/2023</option>
								<option value="16-01-2023">16/01/2023</option>
								<option value="14-01-2023">14/01/2023</option>
								<option value="09-01-2023">09/01/2023</option>
								<option value="07-01-2023">07/01/2023</option>
								<option value="02-01-2023">02/01/2023</option>
								<option value="31-12-2022">31/12/2022</option>
								<option value="26-12-2022">26/12/2022</option>
								<option value="24-12-2022">24/12/2022</option>
								<option value="19-12-2022">19/12/2022</option>
								<option value="17-12-2022">17/12/2022</option>
								<option value="12-12-2022">12/12/2022</option>
								<option value="10-12-2022">10/12/2022</option>
								<option value="05-12-2022">05/12/2022</option>
								<option value="03-12-2022">03/12/2022</option>
								<option value="28-11-2022">28/11/2022</option>
								<option value="26-11-2022">26/11/2022</option>
								<option value="21-11-2022">21/11/2022</option>
								<option value="19-11-2022">19/11/2022</option>
								<option value="14-11-2022">14/11/2022</option>
								<option value="12-11-2022">12/11/2022</option>
								<option value="07-11-2022">07/11/2022</option>
								<option value="05-11-2022">05/11/2022</option>
								<option value="31-10-2022">31/10/2022</option>
								<option value="29-10-2022">29/10/2022</option>
								<option value="24-10-2022">24/10/2022</option>
								<option value="22-10-2022">22/10/2022</option>
								<option value="17-10-2022">17/10/2022</option>
								<option value="15-10-2022">15/10/2022</option>
							</select>
						</div>
					</div>
					<div class="mb-3 mt-3">
						<label class="form-label">Vé Số:</label> <input
							class="form-control" name="userNumber" value="${userNumber}"
							type="text">
					</div>
					<button>getdata</button>

					<div class="mb-3 mt-3 d-flex flex-column">
						<c:if test="${not empty message }">
							<h3>Kết quả:</h3>
							<h4 class="text-danger ms-2">${message}</h4>
						</c:if>
						<c:if test="${not empty error }">
							<h4 class="text-danger ms-2">${error}</h4>
						</c:if>
					</div>
				</form>
			</div>
		</div>
	</div> --%>

	<jsp:include page="/views/footer.jsp"></jsp:include>
</body>
</html>
