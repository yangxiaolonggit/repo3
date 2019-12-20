<%--
  Created by IntelliJ IDEA.
  User: yxl
  Date: 2019/12/18
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>请求参数绑定</h3>

<%--<a href="param/testParam?username=hehe">测试参数绑定</a>--%>


<%--
<form action="param/saveAccount" method="post">
    姓名:<input type="text" name="username"><br>
    密码:<input type="text" name="password"><br>
    金额:<input type="text" name="money"><br>
    用户姓名:<input type="text" name="user.uname"><br>
    用户年龄:<input type="text" name="user.age"><br>

    <input type="submit" value="提交">
</form>
--%>

<%--把数据封装进account类中,类中存在list\map集合--%>
<%--<form action="param/saveAccount" method="post">
    姓名:<input type="text" name="username"><br>
    密码:<input type="text" name="password"><br>
    金额:<input type="text" name="money"><br>
&lt;%&ndash;将数据封装进account类中的list集合属性中&ndash;%&gt;
    list集合用户名:<input type="text" name="list[0].uname"><br>
    list集合年龄:<input type="text" name="list[0].age"><br>
    &lt;%&ndash;将数据封装进account类中的map集合属性中&ndash;%&gt;
    map集合用户名:<input type="text" name="map['one'].uname"><br>
    map集合年龄:<input type="text" name="map['one'].age"><br>

    <input type="submit" value="提交">--%>
</form>
<%--


<form action="param/saveUser" method="post">

    姓名:<input type="text" name="uname"><br>
    年龄:<input type="text" name="age"><br>
    生日:<input type="text" name="date"><br>

    <input type="submit" value="提交">
</form>

--%>

<a href="param/testServlet">测试servlet原生api</a>

</body>
</html>
