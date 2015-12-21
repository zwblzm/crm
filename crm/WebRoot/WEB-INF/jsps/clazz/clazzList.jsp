<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/sys.css" type="text/css"/>
<title>班级管理</title>
</head>

<body>
<!--距离页面顶端5px-->
<table border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td class="topg"></td>
  </tr>
</table>
<form name="createForm" action="" method="post">
<table border="0" cellspacing="0" cellpadding="0" class="wukuang">
  <tr>
    <td width="1%"><img src="${pageContext.request.contextPath}/images/tleft.gif"/></td>
    <td width="20%" align="left">[班级管理]</td>
    <td width="42%"align="center">&nbsp;</td>
    <td width="36%"align="right">
    	<a href="${pageContext.request.contextPath}/clazzAction_addPage.action"><img src="${pageContext.request.contextPath}/images/button/tianjia.gif" class="img"/></a>
        <a href="queryClass.html"><img src="${pageContext.request.contextPath}/images/button/gaojichaxun.gif" class="img"/></a>
    </td>
    <td width="1%"><img src="${pageContext.request.contextPath}/images/tright.gif"/></td>
  </tr>
</table>
</form>
<table border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td class="topg"></td>
  </tr>
</table>
<table border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td ><img src="${pageContext.request.contextPath}/images/result.gif"/></td>
  </tr>
</table>
<table width="97%" border="1">
<thead>
  <tr class="henglan" style="font-weight:bold;">
	<th width="10%" align="center">班级名称</th>
    <th width="10%" align="center">所属课程</th>
    <th width="10%" align="center">开班时间</th>
    <th width="10%" align="center">毕业时间</th>
    <th width="10%" align="center">状态</th>
    <th width="10%" align="center">学生总数</th>
    <th width="10%" align="center">升学数</th>
    <th width="10%" align="center">留级数</th>
    <th width="5%" align="center">编辑</th>
	<th width="5%" align="center">查看</th>
  </tr>
  </thead>
  <tbody>
  <s:iterator value="#request.clazzs">
  <tr class="tabtd1">
    <td align="center">${name}</td>
    <td align="center">${lesson.name}</td>
    <td align="center">2012-08-05</td><!-- 开班时间 -->
    <td align="center">2012-12-05</td><!-- 毕业时间 -->
    <td align="center">已开课</td>
    <td align="center">85</td>
    <td align="center">78</td>
    <td align="center">7</td>
    <td align="center"><a href="editClass.html"><img src="${pageContext.request.contextPath}/images/button/modify.gif" class="img"></a></td>
	<td align="center"><a href="viewClass.html"><img src="${pageContext.request.contextPath}/images/button/view.gif" class="img"></a></td>
  </tr>
  </s:iterator>
  </tbody>
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
