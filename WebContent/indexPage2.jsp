<%@ include file="includes/header.jsp" %>

<div class="animated bounceInDown" style="font-size:48pt; font-family:arial; color:#990000; font-weight:bold">String Comparison Service</div>
<%
  for(int x = 0; x < 2; x++){
                         out.print("<br/>Loading!");
                         out.flush();
                         Thread.sleep(2000);  
  }
%>
</p>&nbsp;</p>&nbsp;</p>

<table width="600" cellspacing="0" cellpadding="7" border="0">
	<tr>
		<td valign="top">

			<form bgcolor="pink" method="POST" action="doProcess">
				<fieldset>
					<legend><h3>String Comparison Results</h3></legend>
				
				
				</fieldset>							
			</form>	

		</td>
	</tr>
</table>
<%@ include file="includes/footer.jsp" %>

