<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

.container{
	display: flex;
	flex-wrap: wrap;
	justify-content: center;
	align-items: center;
	background-color: white;
	
}
.verification-container{
	display: flex;
	flex-wrap: wrap;
	flex-direction: column;
	height: 500px;
	width:500px;
	color: #F0EBE3;
	box-shadow: 2px 3px 5px 1px rgb(78, 78, 78);

}
.text{
	display:flex;
	flex-direction:column;
	flex-wrap:wrap;
	justify-content:center;
 	margin-top: 10px;
    padding: 5px;
    width: auto;
    height: auto;
    text-decoration: none;
    font-size: 1.2rem;;
    font-family:  "Roboto","Helvetica","Arial",sans-serif;
    color: #18978F;
    font-weight: 500;
    background-color: transparent;
    margin-right: 10px;
    }

.email{
	display:flex;
	flex-wrap:wrap;
	justify-content:center;
 	margin-top: 10px;
    padding: 5px;
    width: auto;
    height: auto;
    text-decoration: none;
    font-size: 1.5rem;;
    font-family:  "Roboto","Helvetica","Arial",sans-serif;
    color: #7A4069;
    font-weight: 900;
    background-color: transparent;
    margin-right: 10px;
    }


</style>
</head>
<body>

<div class="container">
<div class="verification-container">

<h2 class="text">We have sent a verification code to<br> <span class="email"><c:out value="${email}"></c:out></span> </h2>
<div class="verification-code">
<form class="submission-form" action="/home">
<input type="text" name="code" class="input-box" placeholder="Enter your code"/>

</form>
</div>
</div>
</div>
</body>
</html>