<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>

<link href="${pageContext.request.contextPath}/css/sys.css" type="text/css" rel="stylesheet" />

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.3.1.js"></script>
</head>

<body >
 <table border="0" cellspacing="0" cellpadding="0" width="100%">
  <tr>
    <td class="topg"></td>
  </tr>
</table>

<table border="0" cellspacing="0" cellpadding="0"  class="wukuang"width="100%">
  <tr>
    <td width="1%"><img src="${pageContext.request.contextPath}/images/tleft.gif"/></td>
    <td width="39%" align="left">[课程类别]</td>
   
    <td width="57%"align="right">
       <a href="${pageContext.request.contextPath }/lessonAction_addPage.action"><img src="${pageContext.request.contextPath}/images/button/tianjia.gif" /></a>
       <a href="querylesson.html"><img src="${pageContext.request.contextPath}/images/button/gaojichaxun.gif" /></a>
      
    </td>
    <td width="3%" align="right"><img src="${pageContext.request.contextPath}/images/tright.gif"/></td>
  </tr>
</table>
<table border="0" cellspacing="0" cellpadding="0" style="margin-top:5px;">
  <tr>
    <td ><img src="${pageContext.request.contextPath}/images/result.gif"/></td>
  </tr>
</table>
<table width="97%" border="1" >
  
  <tr class="henglan" style="font-weight:bold;">
    <td width="14%" align="center">名称</td>
    <td width="33%" align="center">简介</td>
    <td width="13%" align="center">总学时</td>
    <td width="18%" align="center">收费标准</td>
	<td width="11%" align="center">编辑</td>
  </tr>
  <s:iterator value="#request.lessons">
  <tr class="tabtd1">
    <td align="center">${name}</td>
    <td align="center">${descript}</td>
    <td align="center">${total}</td>
    <td align="center">${priceView}</td>
  	<td width="11%" align="center">
  	
  
  	<s:a action="lessonAction_editPage.action">
  		<s:param name="lm.uuid" value="uuid"></s:param>
  		<img src="${pageContext.request.contextPath}/images/button/modify.gif" class="img">		
  	</s:a>
  	|
  	<s:a action="lessonAction_deleteLesson.action">
  		<s:param name="lm" value="lm"></s:param>
  		<img src="${pageContext.request.contextPath}/images/button/delete.gif" class="img">		
  	</s:a>
  
  </tr>
  </s:iterator>
  
</table>
<%@include file="/WEB-INF/jsps/pageUtils.jsp" %>

</body>

</html>
