<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath}/css/sys.css" type="text/css" rel="stylesheet" />

</head>

<body class="emp_body">
<table border="0" cellspacing="0" cellpadding="0" width="100%">
  <tr>
    <td class="topg"></td>
  </tr>
</table>

<table border="0" cellspacing="0" cellpadding="0"  class="wukuang"width="100%">
  <tr>
    <td width="1%"><img src="${pageContext.request.contextPath}/images/tleft.gif"/></td>
    <td width="44%" align="left">[员工管理]</td>
   
    <td width="52%"align="right">
       <a href="#"><img src="${pageContext.request.contextPath}/images/button/save.gif" /></a>
       <a href="#"><img src="${pageContext.request.contextPath}/images/button/tuihui.gif" /></a>
      
    </td>
    <td width="3%" align="right"><img src="${pageContext.request.contextPath}/images/tright.gif"/></td>
  </tr>
</table>

<table width="88%" border="0" class="emp_table" style="width:80%;">
 <tr>
    <td>姓名：</td>
    <td><input type="text" /></td>
    <td>性别：</td>
    <td><input type="text" /></td>
  </tr>
  <tr>
    <td width="10%">出生日期：</td>
    <td width="20%"><input type="text" /></td>
    <td width="8%">入职时间：</td>
    <td width="62%"><input type="text" /></td>
  </tr>
 <tr>
    <td width="10%">所属部门：</td>
    <td width="20%"><select ><option>----请--选--择----</option></select></td>
    <td width="8%">职务：</td>
    <td width="62%"><select ><option>----请--选--择----</option></select></td>
  </tr>
  <tr>
    <td width="10%">编号：</td>
    <td width="20%"><input type="text" /></td>
  </tr>
</table>
</body>
</html>
