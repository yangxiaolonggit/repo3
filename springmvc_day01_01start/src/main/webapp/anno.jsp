<%--
  Created by IntelliJ IDEA.
  User: yxl
  Date: 2019/12/18
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>常用注解</h3>

<a href="anno/testRequestParam?username=haha">RequestParam</a>
<br>
<h3>测试cookievalue</h3>
<a href="anno/testCookieValue">CookieValue</a>
<br>
<h3>测试ModelAttribute</h3>
<br>
<form action="anno/testModelAttribute" method="post">

    姓名:<input type="text" name="uname"><br>
    年龄:<input type="text" name="age"><br>
    生日:<input type="text" name="date"><br>

    <input type="submit" value="提交">
</form>
<br>
<a href="anno/testSessionAttribute">testSessionAttribute</a>
<br>
<a href="anno/delSessionAttribute">delSessionAttribute</a>


</body>
</html>
