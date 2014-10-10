<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isErrorPage="true"%>
<%@ page import="cc.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<style>
body {
	background-color: #00AAFF;
}
</style>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showbook.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    
    <%
	 cc.Book book1 = (cc.Book) request.getAttribute("onebook"); %>
	 <h3><%=book1.getTitle()%>'s information<br></h3>
	
	 <%
		if (book1 != null) {
	%> 
	ISBN: <%=book1.getISBN() %> <br>
	Title: <%=book1.getTitle() %> <br>
	AuthorID: <%=book1.getAuthorID() %> <br>
	Publisher: <%=book1.getPublisher() %> <br>
	PublishDate: <%=book1.getPublishDate() %> <br>
	Price: <%=book1.getPrice() %> <br>
	Name: <%=book1.getName() %> <br>
	Age: <%=book1.getAge() %> <br>
	Country:<%=book1.getCountry() %> <br>
	<%
		
		}
	%>
     <br>
  </body>
</html>
