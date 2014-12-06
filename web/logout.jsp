<%-- 
    Document   : logout
    Created on : Nov 9, 2014, 3:36:01 PM
    Author     : terrelkl
--%>

<jsp:include page="assets/head.jsp" /> 


<h1>Logging out of your account...</h1>
<p>Thanks for using our application!</p>
<%  request.getSession().invalidate(); 
    response.sendRedirect("index.jsp");
%>

<jsp:include page="assets/foot.jsp" /> 