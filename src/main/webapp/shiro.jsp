<%--
  Created by IntelliJ IDEA.
  User: mm
  Date: 2017/8/11
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro"%>

<shiro:hasPermission name="sysadmin">
    <span id="topmenu" onclick="toModule('sysadmin');">系统管理</span>
</shiro:hasPermission>