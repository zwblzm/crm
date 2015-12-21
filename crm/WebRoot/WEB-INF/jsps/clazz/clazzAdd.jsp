<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>

<link href="${pageContext.request.contextPath}/css/sys.css" type="text/css" rel="stylesheet" />

<script type="text/javascript" src="${pageContext.request.contextPath}/js/Calendar.js"></script>
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
    <td width="44%" align="left">[添加班级]</td>
   
    <td width="52%"align="right">
    	<!--<a href="listLog.html"><img src="${pageContext.request.contextPath}/images/button/find.gif" class="img"/></a>
        <a href="addLog.html"><img src="${pageContext.request.contextPath}/images/button/add.gif" class="img"/></a>~-->
        
       <!-- <a href="#"><img src="${pageContext.request.contextPath}/images/button/close.gif" class="img"/></a>-->
       <a href="#" onclick="javascript:document.forms[0].submit();"><img src="${pageContext.request.contextPath}/images/button/save.gif" /></a>
       <a href="#"><img src="${pageContext.request.contextPath}/images/button/tuihui.gif" /></a>
      
    </td>
    <td width="3%" align="right"><img src="${pageContext.request.contextPath}/images/tright.gif"/></td>
  </tr>
</table>
<s:form action="clazzAction_addClazz.action" method="post">
<table width="88%" border="0" class="emp_table" style="width:80%;">
	<br/>
	<br/>
	<s:fielderror></s:fielderror>
	<br/>
	<br/>
  <tr>
    <td width="10%">班级名称：</td>
    <td width="20%"><s:textfield name="cm.name"></s:textfield></td>
    <td width="8%">所属类别：</td>
    <td width="62%"><s:select name="cm.lesson.uuid" list="#request.lessons" listKey="uuid" listValue="name" headerKey="" headerValue="--请选择--"></s:select></td>
  </tr>
  <tr>
    <td>开课时间：</td>
    <td>
    <s:textfield onfocus="c.showMoreDay=false;c.show(this);"></s:textfield>
    <s:hidden name="cm.openTime"></s:hidden>
    
    </td>
    <td>结业时间：</td>
    <td>
     <s:textfield onfocus="c.showMoreDay=false;c.show(this);"></s:textfield>
    <s:hidden name="cm.endTime"></s:hidden></td>
  </tr>
  <tr>
  	<td>状态：</td>
  	<td>
  	<select name="cm.status">
  		<option value="1">启用</option>
  		<option value="0">禁用</option>
  	</select>
  	</td>
  </tr>
</table>
</s:form>
</body>
</html>
