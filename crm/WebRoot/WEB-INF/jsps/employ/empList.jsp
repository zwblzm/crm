<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>



<link href="${pageContext.request.contextPath}/css/sys.css" type="text/css" rel="stylesheet" />
</head>

<body>
 <table border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td class="topg"></td>
  </tr>
</table>

<table border="0" cellspacing="0" cellpadding="0" class="wukuang">
  <tr>
    <td width="1%"><img src="${pageContext.request.contextPath}/images/tleft.gif"/></td>
    <td width="33%" align="left">[咨询学生管理]</td>
   
    <td width="63%"align="right">
        <a class="butbg"  href="addEmployee.html"><img src="${pageContext.request.contextPath}/images/button/tianjia.gif" /></a>
        <a class="butbg"  href="#"><img src="${pageContext.request.contextPath}/images/button/gaojichaxun.gif" /></a>
    </td>
    <td width="3%" align="right"><img src="${pageContext.request.contextPath}/images/tright.gif"/></td>
  </tr>
</table>
<table border="0" cellspacing="0" cellpadding="0" style="margin-top:5px;">
  <tr>
    <td ><img src="${pageContext.request.contextPath}/images/result.gif"/></td>
  </tr>
</table>
<table width="100%" border="1" >
  
  <tr class="henglan" style="font-weight:bold;">
	<td width="8%" align="center">姓名</td>
	<td width="6%" align="center">性别</td>
	<td width="9%" align="center">电话</td>
	<td width="11%" align="center">QQ </td>
	<td width="15%" align="center">班级意向</td>
	<td width="17%" align="center">状态</td>
	<td width="10%" align="center">营销人员</td>
	<td width="8%" align="center">编辑</td>
	<td width="8%" align="center">查看</td>
  </tr>
  <tr class="tabtd2">
    <td align="center">张三</td>
    <td align="center">男 </td>
    <td align="center">18888888888</td>
    <td align="center">1234567</td>
    <td align="center">Java基础班</td>
    <td align="center">准备报名</td>
    <td align="center">张华</td>
	<td width="8%" align="center"><a href="editEmployee.html"><img src="${pageContext.request.contextPath}/images/button/modify.gif" class="img"></a></td>
	<td width="8%" align="center"><a href="editEmployee.html"><img src="${pageContext.request.contextPath}/images/button/view.gif" class="img"></a></td>
  </tr>
  <tr class="tabtd1">
    <td align="center">李四</td>
    <td align="center">女 </td>
    <td align="center">18777777777</td>
    <td align="center">987654321</td>
    <td align="center">Java就业班</td>
    <td align="center">首次咨询</td>
    <td align="center">刘淼</td>
	<td width="8%" align="center"><a href="editEmployee.html"><img src="${pageContext.request.contextPath}/images/button/modify.gif" class="img"></a></td>
	<td width="8%" align="center"><a href="editEmployee.html"><img src="${pageContext.request.contextPath}/images/button/view.gif" class="img"></a></td>
  </tr>
</table>
<table border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td align="right">
    	<span>第1/3页</span>
        <span>
        	<a href="#">[首页]</a>&nbsp;&nbsp;
            <a href="#">[上一页]</a>&nbsp;&nbsp;
            <a href="#">[下一页]</a>&nbsp;&nbsp;
            <a href="#">[尾页]</a>
        </span>
    </td>
  </tr>
</table>
</body>
</html>
