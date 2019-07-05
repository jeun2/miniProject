<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>도서관리</title>
	</head>
	<body>
		<h2>도서정보관리-리스트</h2>
		<form action="search" method="get">
			검색 키워드 입력 : 
			<input type="text" size="20" name="keyword" placeholder="도서제목 또는 저자 입력">
			<input type="submit" value="찾기">
		</form>
		<table border="1">
			<tr>
				<th>등록 번호</th>
				<th>도서 표지</th>
				<th>도서 ISBN</th>
				<th>도서 제목</th>
				<th>저자</th>
				<th>출판사</th>
				<th>가격</th>
			</tr>
			<c:forEach var="books" items="#{booksList }" varStatus="loop">
				<tr>
					<td>${books.num }</td>
					<td><img src="/books/upload/${books.imgname }" width="100" height="150"/></td>
					<td>${books.isbn }</td>
					<td><a href="<c:url value="/books/read/${books.num}" />">${books.name }</a>
					<td>${books.writer }</td>
					<td>${books.pub }</td>
					<td>${books.charge }</td>
				</tr>			
			</c:forEach>
		</table>
		<a href="<c:url value="/books/add"/>">도서 정보 추가</a>		
	</body>
</html>