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
    <title>stu</title>
</head>
<body>
    <ul>
        <c:forEach items="${stuList}" var="stu">
            <li>
                <div>
                    <span style="color: darkseagreen; font-size: large">${stu.no}</span>
                        ${stu.name}
                    <span style="font-size: 12px; color: darkgray"><c:out value="${stu.score}"/></span>
                </div>
            </li>
        </c:forEach>
    </ul>
</body>
</html>
