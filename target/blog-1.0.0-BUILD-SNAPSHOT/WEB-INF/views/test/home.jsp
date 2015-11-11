<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>


<jsp:include page="/WEB-INF/views/pages/header.jsp">
	<jsp:param name="param1" value="plouf"/>
</jsp:include>

<body>
	<h1>Hello world!</h1>
	<button type='button' onclick='RestGet()'>GET</button>
	 <script>
	 
	 var RestGet = function() {
	        $.ajax({
	        type: 'GET',
	        url:  '/blog/getAllPosts/',
	        dataType: 'json',
	        async: true,
	        success: function(result) {
	            alert(result);
	        },
	        error: function(jqXHR, textStatus, errorThrown) {
	            alert(jqXHR.status + ' ' + jqXHR.responseText);
	        }
	   });
	}
  	</script>
</body>
</html>
