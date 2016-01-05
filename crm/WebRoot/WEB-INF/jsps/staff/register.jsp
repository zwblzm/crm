<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML><HEAD>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/Calendar.js"></script>
<STYLE>
.cla1 {
FONT-SIZE: 12px; COLOR: #4b4b4b; LINE-HEIGHT: 18px; TEXT-DECORATION: none
}
.login_msg{
	font-family:serif;
}
.login_msg .msg{
	background-color: #acf;
	font-family: 微软雅黑;
}
.login_msg .btn{
	background-color: #9be;
	width: 73px;
	font-size: 18px;
	font-family: 微软雅黑;
}
.register_title{
	font-size: 32px;
	font-family: 微软雅黑;
	color:#02d;
}
.login_msg_field{
	font-family: 微软雅黑;
}
</STYLE>

<TITLE></TITLE>

<META http-equiv=Content-Type content="text/html; charset=utf-8">
<LINK href="${pageContext.request.contextPath}/css/style.css" type=text/css rel=stylesheet>

<META content="MSHTML 6.00.2600.0" name=GENERATOR>

</HEAD>
<BODY leftMargin=0 topMargin=0 marginwidth="0" marginheight="0" background="${pageContext.request.contextPath}/images/rightbg.jpg">
<div ALIGN="center">
	<table border="0" width="1140px" cellspacing="0" cellpadding="0" id="table1">
		<tr>
			<td height="93"></td>
			<td><s:fielderror></s:fielderror></td>
		</tr>
		<tr>
			<td background="${pageContext.request.contextPath}/images/right.jpg"  width="740" height="412"></td>
			<td class="login_msg" width="400">
				<s:form cssClass="login_msg_field" action="empAction_regist.action">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="register_title">新用户注册</span><br/><br/>
			
					<s:textfield name="em.name" cssClass="msg">用&nbsp;&nbsp;户&nbsp;&nbsp;名：</s:textfield>
					
					<br/><br/>
					
					<s:password cssClass="msg" name="em.password">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：</s:password>
					
					<br/><br/>
					<s:password cssClass="msg" name="em.repassword">确认密码：</s:password><br/><br/>
					<s:textfield name="em.realName" cssClass="msg">	姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</s:textfield><br/><br/>
					性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：
					<s:select list="@cn.aurora.crm.hr.emp.vo.EmpModel@genderMap"></s:select>
					
					<br/><br/>

					<s:textfield  cssClass="msg"  onfocus="c.showMoreDay=false;c.show(this);">出生日期：</s:textfield>
					<s:hidden name="em.birthday"></s:hidden>
					<br/><br/>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input class="btn" type="submit" value=" 注册 "/>
					
					
				</s:form>
			</td>
		</tr>
	</table>
</div>
</BODY></HTML>