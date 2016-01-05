<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath}/css/sys.css" type="text/css" rel="stylesheet" />




<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.0.min.js"></script>
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
    <td><s:textfield name="em.name"> </s:textfield></td>
    <td>性别：</td>
    <td><s:textfield name="em.genderView"> </s:textfield></td>
  </tr>
  <tr>
    <td width="10%">出生日期：</td>
    <td width="20%"><s:textfield name="em.birthdayView"> </s:textfield></td>
    <td width="8%">入职时间：</td>
    <td width="62%"><s:textfield name="em.entryTimeView"> </s:textfield></td>
  </tr>
 <tr>
    <td width="10%">所属部门：</td>
    <td width="20%"><s:select name="em.dep.id" list="#request.deps" listKey="id" listValue="name" id="dep" value="em.dep.id"></s:select> </td>
    <td width="8%">职务：</td>
    <td width="62%"><s:select name="em.pos.id"  list="#request.poss" listKey="id" listValue="name" id="pos" value="em.pos.id"></s:select> </td>
  </tr>
  <tr>
    <td width="10%">编号：</td>
    <td width="20%"><s:textfield name="em.code"></s:textfield></td>
  </tr>
</table>
</body>
<script type="text/javascript">
	$(document).ready(
		function() {
			$('#dep').change(function() {
				
				var did = $(this).val();
				$.post("posAction_ajaxGetPosition.action",{"pm.dm.id":did},function(data) {
					$('#pos').empty();
					for(var i=0; i<data.posList.length; i++) {
						var $option = $("<option value='"+data.posList[i].id+"'>"+data.posList[i].name+"</option>");
						$("#pos").append($option);
					
					}
				
				});
			
			})
		
		}
	)
	
</script>
</html>
