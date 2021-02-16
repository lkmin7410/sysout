<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border =1>
	
		<tr>
			<td>제목</td>
			<td colspan="3">${nt.title}</td> <!-- colspan은 가로 칸 수를 늘림 rowspan은 세로-->
		</tr>
		<tr>
			<td>작성일</td>
			<td colspan="3"><fmt:formatDate pattern="yyyy.MM.dd. hh.mm." value="${nt.regDate}"/></td>
		</tr>
		<tr>
			<td>작성자</td>
			<td >${nt.writerID}</td>
			
			<td>조회수</td>
			<td><fmt:formatNumber type="number" pattern="###,###" value ="${nt.hit}"></fmt:formatNumber></td>
			
		</tr>
		<tr>
			<td>첨부파일</td>
			<td colspan="3">
				<c:forTokens var="fileName" items="${nt.files}" delims="," varStatus="t"> <!-- fortoken은 split과 비슷함 -->
				<c:set var="style" value="" />
				
				<c:if test="${fn:endsWith(fileName,'.zip')}">
				<c:set var="style" value="font-weight:bold; color:red;" />
				</c:if>
				
				<a download href="../../../upload/${fileName}" style="${style}">${fn:toUpperCase(fileName)}</a>
				<c:if test="${!t.last}">
				
				</c:if>
				</c:forTokens>
				
			</td>	
		</tr>
		<tr>
			<td colspan="4">${nt.content}</td>
		</tr>	
	</table>

 	<input type = "button" onclick="location.href ='list?f=${param.f}&q=${param.q}&p=${param.p}'" value="목록">

</body>
</html>