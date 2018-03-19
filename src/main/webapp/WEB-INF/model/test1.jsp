<%--
  Created by IntelliJ IDEA.
  User: 何冠雄
  Date: 2018/2/12
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>${u.name}</p>
    <p>${u.age}</p>
    <ul>
        <c:forEach items="${u.hobby}" var="h">
            <li>${h}</li>
        </c:forEach>
    </ul>
    <fmt:formatDate value="${u.birthday}" pattern="yyyy-MM-dd"/>
</body>
</html>
