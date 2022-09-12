<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style>
.container1{
	display: flex;
	flex-direction:column;
	flex-wrap: wrap;
	justify-content: center;
	align-items: center;
	background-color: white;
	margin-top: 50px;
}
.login-container{
margin-top:20px;
	display: flex;
	flex-direction: column;
	width: 400px;
	height: auto;
	background-color: #F0EBE3;
	box-shadow: 2px 3px 5px 1px rgb(78, 78, 78);
	justify-content: center;
}
.img-container{
	display: flex;
	width:100%;
	justify-content: center;
	/* background-color: green; */
	align-items: center;
	
}
.img1{
	
	
	width: 150px;
	height:150px;
	border-radius:75px;
	object-fit:contain;
	background-color: green;

	
}
img{
	width: 100%;
	height: 100%;
	object-fit:contain;
	border-radius:75px;
	
}
.text-container{
  margin-top:20px;
    display:flex;
    justify-content:center;
    width:100%;
    flex-wrap:wrap;
   

    }
.text{
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
    color: #18978F;
    font-weight: 900;
    background-color: transparent;
    margin-right: 10px;
    }
      .form-container{
    display: flex;
    margin:10px;
    flex-wrap: wrap;
    flex-direction: column;
    
    }
    .input{
    	margin-bottom:5px;
    	display:flex;
    	flex-direction: column;
    	align-items:flex-start;
    	justify-content: center;
    	width: auto;
    	height:auto;
    	
    	
    }
    .label{
    margin-top:10px;
    display:flex;
	flex-wrap:wrap;
	justify-content:center;
    padding: 5px 5px 0px 5px;
    width: auto;
    height: auto;
    text-decoration: none;
    font-size: 1rem;;
    font-family:  "Roboto","Helvetica","Arial",sans-serif;
    color: #3AB0FF;
    font-weight: 700;
    background-color: transparent;
   
    
    }
    .input-box{
    	text-decoration: none;
    	width: 100%;
    	margin: 4px;
    	height: 30px;
    	border-radius: 8px;
    }
    .submit:hover {
	cursor: pointer;
	
}
.error{

margin-top: 3px;
margin-bottom: 3px;
color:#FF0063;
padding: 5px;
    width: auto;
    height: auto;
    text-decoration: none;
    font-size: 1rem;;
    font-family:  "Roboto","Helvetica","Arial",sans-serif;
    font-weight: 400;
    background-color: transparent;
    
  
</style>
</head>
<body>
<%@ include file="../../decorators/Navbar.jsp" %>
<div class="container1">

<div class="login-container">
<div class="img-container">
<div class="img1">
<img src="../images/demoProfile.png"/>
</div>
</div>
<div class="text-container">
<div class="text">
	Please Signin...
</div>
</div>

<div class="form-container">
 <form:form class="form-container" action="/ulogin" modelAttribute="login" method="POST">
 <div class="error">${error}</div>
<div class="input">
<label for="email" class="label"> Enter your Email</label>
 <div class="error">${email}</div>
<input id="email" placeholder="Enter email" name="email" class="input-box" type="email"  onfocus="true"/>
</div>
<div class="input">
<label for="password" class="label">Enter Password</label>
 <div class="error">${password}</div>
<input name="password" class="input-box" placeholder="Enter Password" id="password" type="password"  onfocus="true"/>

</div>

<div class="input">
<input class="input-box text submit"  type="submit"/>
</div>
</form:form> 
<div>
<a href="/register">Don't have account?</a>
</div>
</div>
</div>
</div>
</body>
</html>