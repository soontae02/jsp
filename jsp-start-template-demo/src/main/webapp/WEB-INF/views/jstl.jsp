<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Home</title>
</head>
<body>

    <%--
     jsp에서 자바코드를 사용하려면 <% %>을 사용해야 되는데, 자바의 제어문이나 값을 바로 받아서 사용할 수 있게 해주는 jstl구문
     %>

    <%
        String msg = (String)request.getAttribute("msg");
    %>

    <%=msg %>
    --%>

    ${msg}<br>
    ${isMember}<br>
    ${list}<br>

    <%--
    <%
        boolean isMember = (boolean) request.getAttribute("isMember");
    %>
    <% if(isMember) { %>
        회원만 사용가능한 컨텐츠입니다.
    <% } %>
    --%>


    <h3>jstl if문</h3>
    <c:if test="${isMember}">
        화원만 사용가능한 콘텐츠입니다.
    </c:if>

    <%--
    <%
        List<String> list = (List) request.getAttribute("list");
    %>

    <% for(String s : list) { %>
        <%=s %>
    <% } %>
    --%>

    <c:forEach var="a" items="${list}">
        ${a}
    </c:forEach>

    <hr>

    <h3>forEach</h3>
    <c:forEach var="i" begin="1" end="10" step="1">
        ${i}
    </c:forEach>

    <h3>forEach구분으로 구구단 2~9단까지 출력</h3>
    <c:forEach var="dan" begin="2" end="9">
        <c:forEach var = "i" begin="1" end="9">

            <td>${dan} * ${i} = ${dan * i}</td><br>

        </c:forEach>
    </c:forEach>

<
</body>
</html>


