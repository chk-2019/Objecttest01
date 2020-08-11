<%--
  Created by IntelliJ IDEA.
  User: youxi
  Date: 2020/8/8
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>这是一个注册的页面</title>
</head>
<body>
<form action="addStudent.do" method="post">
    <table border="1">
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>邮箱：</td>
            <td><input type="text" name="email"/> </td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><input type="text" name="age"/></td>
        </tr>
    </table>
    <input type="submit" >提交</input>
</form>
</body>
</html>
