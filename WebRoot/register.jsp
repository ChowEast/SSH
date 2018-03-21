<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册</title>
	
  </head>
  
  <body>
    <div align="center">
       <s:form action="register">
          <s:textfield name="name" label="用户名"></s:textfield>
          <s:textfield name="phone" label="联系方式"></s:textfield>
          <s:textfield name="email" label="邮件地址"></s:textfield>
          <s:submit value="注册" method="register"/>
       </s:form>
    </div>
  </body>
</html>
