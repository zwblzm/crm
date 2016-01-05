<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>CRM系统</title>
</head>

<frameset rows="90,*" framespacing="0px" frameborder="no">
	<frame src="${pageContext.request.contextPath}/common/common_topPage.action" scrolling="no"/>
    <frameset id="main" cols="170,9,*" framespacing="0px" frameborder="no" >
        <frameset rows="30,*,40" framespacing="0px" frameborder="no" >
			<frame src="${pageContext.request.contextPath}/common/common_left1Page.action" scrolling="no"/>
            <frame src="${pageContext.request.contextPath}/common/common_leftPage.action" scrolling="no"/>
            <frame src="${pageContext.request.contextPath}/common/common_left2Page.action" scrolling="no"/>
        </frameset>
        <frame src="${pageContext.request.contextPath}/common/common_controlPage.action" scrolling="no"/>
        <frame src="${pageContext.request.contextPath}/common/common_rightPage.action" name="right" scrolling="auto"/>
	</frameset>
</frameset>
</html>
