<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    
    <a href="<c:url value="insert.do"/>">글쓰기</a><br>
    
    <c:forEach var="board_clubDTO" items="${board_clubDTO}">
		${board_clubDTO.seq } &nbsp; &nbsp;
		${board_clubDTO.member } &nbsp; &nbsp;
		${board_clubDTO.title } &nbsp; &nbsp;
		${board_clubDTO.content } &nbsp; &nbsp;
		${board_clubDTO.time } &nbsp; &nbsp;
		${board_clubDTO.club } &nbsp; &nbsp;
		<br>
    </c:forEach>
    