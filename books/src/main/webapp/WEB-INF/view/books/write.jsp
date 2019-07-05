<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title>도서관리</title>
	</head>
	<body>
		<script>
		var loadFile = function(event){
			var imageView = document.getElementById('imageView');
			imageView.src = URL.createObjectURL(event.target.files[0]);
		};
		
		</script>
		
		<h2>도서정보관리-도서추가</h2>
		<form:form commandName="formData" action="add" method="post" enctype="multipart/form-data" runat="server">
			<table border="1">
				<tr><td colspan="3" align="right"><font color="red">*</font>표시는 필수 입니다.</td></tr>
				<tr>
					<td rowspan="7" width="150" height="200"><img id="imageView" width="150" height="200"></td>
				
					<tr>
						<th width="120"><form:label path="isbn"><font color="red">*</font>BOOK ISBN</form:label></th>
						<td><form:input path="isbn"/></td>
					</tr>
					<tr>
						<th><font color="red">*</font>도서명</th>
						<td><form:input path="name"/></td>
					</tr>
					<tr>
						<th><font color="red">*</font>저자</th>
						<td><form:input path="writer"/></td>
					</tr>
					<tr>
						<th><font color="red">*</font>출판사</th>
						<td><form:input path="pub"/></td>
					</tr>
					<tr>
						<th><font color="red">*</font>도서 가격</th>
						<td><form:input path="charge"/></td>
					</tr>
					<tr>
						<th><font color="red">*</font>이미지</th>
						<td><input type="file" name="imgname" onchange="loadFile(event)"/></td>
					</tr>
				<tr>
					<th height="100"><font color="red">*</font>책소개</th>
					<td colspan="2"><textarea id="content" name="content" rows="10" cols="55"></textarea></td>
				</tr>
			
			</table>
		<div>
			<input type="submit" value="도서정보 추가">
			<input type="button" value="도서 정보 목록" onClick="location='<c:url value="/books/list"/>'">	
		</div>
		</form:form>
	</body>
	
</html>