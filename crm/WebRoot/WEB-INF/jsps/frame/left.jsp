<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML><HEAD>
<link href="${pageContext.request.contextPath}/css/dtree.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/dtree.js"></script>
<META http-equiv=Content-Type content="text/html; charset=utf-8">
</HEAD>
<BODY bgColor=#DDF0FB leftMargin=0 topMargin=0 marginwidth="0" marginheight="0">
<table width="90%" border="0" cellspacing="1" cellpadding="2" align="center" >
<tr>
<div class="dtree">
	<script type="text/javascript">
		d = new dTree('d');
		d.add('01','-1','CRM管理系统');
		d.add('0101','01','咨询部');
		d.add('010101','0101','咨询学生管理','${pageContext.request.contextPath}/html/employee/listEmployee.html','','right');
		d.add('010102','0101','咨询学生跟踪','${pageContext.request.contextPath}/html/user/listUser.html','','right');
		d.add('010103','0101','学生移交','${pageContext.request.contextPath}/html/remove/listRemove.html','','right');
		d.add('010104','0101','移交历史查询','${pageContext.request.contextPath}/html/remove/historyRemove.html','','right');
		d.add('0102','01','学工部');
		d.add('010201','0102','在校学生管理','${pageContext.request.contextPath}/html/role/listRole.html','','right');
		d.add('010202','0102','学生升级/留班','${pageContext.request.contextPath}/html/role/listRolePri.html','','right');
		d.add('010203','0102','学生流失情况','${pageContext.request.contextPath}/html/privilege/listPrivilege.html','','right');		
		d.add('0103','01','教学部');
		d.add('010301','0103','班级管理','${pageContext.request.contextPath}/clazzAction_listPage.action','','right');
		d.add('010302','0103','课程类别','${pageContext.request.contextPath}/lessonAction_listPage.action','','right');
		d.add('0104','01','就业部');
		d.add('010401','0104','就业情况','${pageContext.request.contextPath}/html/dept/listDept.html','','right');
		d.add('0105','01','人力资源部');
		d.add('010501','0105','部门管理','${pageContext.request.contextPath}/depAction_listPage.action','','right');
		d.add('010502','0105','职务管理','${pageContext.request.contextPath}/posAction_listPage.action','','right');
		d.add('010503','0105','员工管理','${pageContext.request.contextPath}/empAction_listPage.action','','right');
		document.write(d);
	</script>
</div>
</tr>
</table>
</BODY>
</HTML>
      			
			


      