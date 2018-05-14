<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/9 0009
  Time: 下午 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>spittles</title>
</head>
<body>
    <ul>
        <c:forEach items="${spittleList}" var="spittle">
            <li>
                <div>
                    ${spittle.message}
                </div>
                <div style="font-size: 12px; color: darkgray">
                    <span><c:out value="${spittle.time}"/></span>
                    <span><c:out value="${spittle.latitude}"/></span>
                    <span><c:out value="${spittle.longtude}"/></span>
                </div>
            </li>
        </c:forEach>
    </ul>
</body>
</html>
