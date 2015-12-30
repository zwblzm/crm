<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td align="right">
    	
    	<span><s:textfield id="preNum" name="preNum" size="2" onkeyup="pageNum()"></s:textfield>第${pageNum}/${totalPage}页</span>
        <span>
        	<a id="first" href="javascript:void(0);">[首页]</a>&nbsp;&nbsp;
            <a id="pre" href="javascript:void(0);">[上一页]</a>&nbsp;&nbsp;
            
            <a id="next" href="javascript:void(0);">[下一页]</a>&nbsp;&nbsp;
            <a id="last" href="javascript:void(0);">[尾页]</a>
        </span>
    </td>
  </tr>
</table>

<script type="text/javascript">
	$(document).ready(function(){
		
		var first = $("#first");
		var pre = $("#pre");
		var next = $("#next");	
		var last = $("#last");
		
		/* first.hide();
		pre.hide();
		next.hide();
		last.hide(); */
		if(${totalPage eq 1}) {
			first.hide();
			pre.hide();
			next.hide();
			last.hide();
			
		}
		if(${pageNum eq 1}) {
			first.attr("disabled","disabled").css("color","#111111");
			pre.attr("disabled","disabled").css("color","#111111");
		}
		
		if(${pageNum eq totalPage}) {
			next.attr("disabled","disabled").css("color","#111111");
			last.attr("disabled","disabled").css("color","#111111");
		
		}
		
		first.click(function() {
			document.location="${ctx}/lessonAction_listPage.action?pageNum=1";
		});
			
		pre.click(function() {
			document.location="${ctx}/lessonAction_listPage.action?pageNum="+${pageNum-1};
		});
		
		next.click(function() {
			document.location="${ctx}/lessonAction_listPage.action?pageNum="+${pageNum+1};
		});
		
		last.click(function() {
			document.location="${ctx}/lessonAction_listPage.action?pageNum="+${totalPage};
		});
		
		
		
		
	
	})
	
	
	

</script>
