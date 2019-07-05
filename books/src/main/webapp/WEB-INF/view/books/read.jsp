<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>도서관리</title>
	</head>
	<body>
		<h2>도서정보관리-도서정보</h2>
			<table border="1">
				<tr>
					<td rowspan="6"><img src="/books/upload/${booksVO.imgname }" width="150" height="250"/></td>
				
					<tr>
						<th width="200">BOOK ISBN</th>
						<td width="250">${booksVO.isbn }</td>	
					</tr>
					<tr>
						<th>도서명</th>
						<td>${booksVO.name }</td>
					</tr>
					<tr>
						<th>저자</th>
						<td>${booksVO.writer }</td>
					</tr>
					<tr>
						<th>출판사</th>
						<td>${booksVO.pub }</td>
					</tr>
					<tr>
						<th>도서 가격</th>
						<td>${booksVO.charge}</td>
					</tr>
					
				<tr>
					<th>책소개</th>
					<td colspan="2" width="200" height="250">${booksVO.content }</td>
				</tr>
			
			</table>
		<div>
			<input type="button" value="도서 정보 목록" onClick="location='<c:url value="/books/list"/>'">	
		</div>
	</body>
	</body>
</html>