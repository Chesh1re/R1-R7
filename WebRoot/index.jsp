<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isErrorPage="true"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
	+ request.getServerName() + ":" + request.getServerPort()
	+ path + "/";
%>

<html>
<style>
body {
	background-color: #00AAFF;
}
</style>
<body>
	<%String temp=new String();%>
	<h3>Input the Authorname:</h3>
	<form action="FindBooks.action" method="post">
		AuthorName: <input type="text" name="authorname" />
		<%
			temp = (String) request.getAttribute("authorname");
		%>
		<input type="submit" value="Submit" /> <br />
		<br />
	</form>
<% 
    
			if(temp!=null){
		%>
		<%=temp%>
		has these books:<br />
		<%
			}
		%>
	<%
	
		List<String> books = new ArrayList<String>();
		if(request.getAttribute("books")!=null){
		books=(List<String>) request.getAttribute("books");
			if (books != null) {
		for (String b : books) {
	%>
	<a href="ShowBook.action?title=<%=b%>"><%=b%></a>
	&nbsp;
	<a
		href="DeleteBook.action?title=<%=b%> & lastname=<%=temp%>">Delete </a>
	<br />
	<%
		}
			}
			}
	%>

</body>
</html>
