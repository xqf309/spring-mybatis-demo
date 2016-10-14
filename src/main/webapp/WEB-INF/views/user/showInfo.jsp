<%--
  Created by IntelliJ IDEA.
  User: xiongqingfeng
  Date: 2016/5/31
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>hello,mybatis test</title>
</head>
<body>
    姓名： ${userInfo.uname}
    链接：
    <c:forEach var="menu" items="${menus}">
        <a href ="/${menu.url}"> ${menu.name}</a>
    </c:forEach>
    角色：
    <c:forEach var="role" items="${roles}">
        <ul>
            <li>${role.name}</li>
        </ul>
    </c:forEach>

</body>
</html>
