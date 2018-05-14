<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/18 0018
  Time: 下午 3:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传</title>
</head>
<body>
    <form method="post"
          action="<%= request.getContextPath()%>/uploadController/uploadFile"
          enctype="multipart/form-data">

        请选择文件: <input type="file" name="uploadFile"/>
                   <input type="submit" value="提交"/>

    </form>
</body>
</html>
