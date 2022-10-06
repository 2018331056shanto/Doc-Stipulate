<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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
	background-color: transparent;
	
}
.verification-container{


	display: flex;
	flex-wrap: wrap;
	flex-direction: column;
	justify-content:center;
	color: transparent;
    width:100%;
    height:100%;

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
    font-size: 1.5rem;;
    font-family:  "Roboto","Helvetica","Arial",sans-serif;
    color: #937DC2;
    font-weight: 500;
    background-color: transparent;
    margin-right: 10px;
    margin-top:200px;
    }

.email{


	display:flex;
	flex-wrap:wrap;

    width: auto;
    height: auto;
    text-decoration: none;

    font-family:  "Roboto","Helvetica","Arial",sans-serif;
    color: #628E90;
    font-weight: 500;
    background-color: transparent;
    margin-left: 10px;
    }
    .text-container{
        display:flex;
        width:100%;
        justify-content:center;

    }
    body{

 background-image: url('../../images/verification.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}

.form-container{
    display:flex;
    justify-content:center;
    width:100%;

}
.input{
    	display:flex;
    	flex-direction: column;
    	align-items:flex-start;
    	justify-content: center;
    	width: auto;
    	height:auto;


    }
    .input-box{
        	text-decoration: none;
        	width: 100%;
        	margin: 10px;
        	height: 30px;
        	border-radius: 8px;
        }
            .submit:hover {
        	cursor: pointer;

        }
</style>
</head>
<body >

<div class="container">
<div class="verification-container">
 <div class="text-container">
<h2 class="text"><c:out value="${error}"></c:out>
<br>
 <h2 class="text">We have sent a verification code to  <span class="email"><c:out value="${email}"></c:out></span> </h2>

 </div>
<div class="verification-code">
<div class="form-container">

<form:form class="submission-form" action="/verify" modelAttribute="verification">
<input type="text" name="code" class="input-box" placeholder="Enter your code"/>
<div class="input">
<input class="input-box  submit"  type="submit"/>
</div>
</form:form>
</div>
</div>
</div>
</div>
</body>
</html>