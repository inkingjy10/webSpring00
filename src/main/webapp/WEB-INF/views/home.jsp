<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<h2><a href="/webApp/aLink?num=100&name=박새빛나">A태그 링크 걸기</a></h2>
<P>  The time on the server is ${serverTime}. </P>
<p>폼 데이터 전송<br/>
<form method="post" action="/webApp/formData">
이름:<input type="text" name="name"/><br/>
번호:<input type="text" name="num"/><br/>
연락처:<input type="text" name="tel"/><br/>
<input type="submit" value="전송"/>

</form><p>
<img src="/webApp/resources/psh.jpg"/>
<img src="/webApp/resources/img/IU.gif"/>
<img src="/webApp/image/이지은9.jpg"/>
</body>
</html>
