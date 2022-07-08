<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.container{
display:flex;
justify-content: center;
flex-wrap: wrap;
background-color: white;
}
.register-container{
	
	margin-top:50px;
	width:400px;
	display:flex;
	flex-wrap:wrap;
	height: auto;
	background-color: #F0EBE3;
	box-shadow: 2px 3px 5px 1px rgb(78, 78, 78);
}
  .text-container{
  margin-top:20px;
    display:flex;
    justify-content:center;
    width:100%;
    flex-wrap:wrap;
   box-shadow: 2px 3px 5px 1px rgb(78, 78, 78);
   

    }
.text{
	display:flex;
	flex-wrap:wrap;
	justify-content:center;
 	margin-top: 20px;
    padding: 5px;
    width: auto;
    height: auto;
    text-decoration: none;
    font-size: 1rem;;
    font-family:  "Roboto","Helvetica","Arial",sans-serif;
    color: #18978F;
    font-weight: 700;
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
    	display:flex;
    	flex-direction: column;
    	align-items:flex-start;
    	justify-content: center;
    	width: auto;
    	height:auto;
    	
    	
    }
    .label{
    display:flex;
	flex-wrap:wrap;
	justify-content:center;
    padding: 5px;
    width: auto;
    height: auto;
    text-decoration: none;
    font-size: 1rem;;
    font-family:  "Roboto","Helvetica","Arial",sans-serif;
    color: #3AB0FF;
    font-weight: 700;
    background-color: transparent;
    margin-right: 10px;
    
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
}
</style>
</head>
<body>
<div class="container">
<div class="register-container">
<div class="text-container">
<div class="text">
Create New Account
</div>
</div>
<div class="form-container">
 <form:form class="form-container" action="/register" modelAttribute="register" method="POST">
 <div class="input">
 <label class="label" for="fname">First Name</label>
 <div class="error">${fName}</div>
 <input name="fName" type="text" class="input-box" id="fname" placeholder="First Name"  onfocus="true"/>
 </div>
 <div class="input">
 <label class="label" for="lname">Last Name</label>
  <div class="error">${lName}</div>
 	<input class="input-box" id="lname" placeholder="Last Name" name="lName" type="text"  onfocus="true"/>

 </div>
<div class="input">
<label for="email" class="label"> Enter your Email</label>
 <div class="error">${email}</div>
<input id="email" placeholder="Enter email" name="email" class="input-box" type="email"  onfocus="true"/>
</div>
<div class="input">
<label for="username" class="label">Enter Username</label>
 <div class="error">${userName}</div>
 <input name="userName" placeholder="Username" id="username" class="input-box" type="text"  onfocus="true"/>
</div>
<div class="input">
<label for="password" class="label">Enter Password</label>
 <div class="error">${password}</div>
<input name="password" class="input-box" placeholder="Enter Password" id="password" type="password"  onfocus="true"/>

</div>
<div class="input">
<label for="profile" class="label"> Enter Profile Picture</label>
 <div class="error">${profilePic}</div>
<input class="input-box" name="profilePic" id="profile" placeholder="Enter picture"  type="file"  onfocus="true"/>
</div>
<div class="input">
<input class="input-box text submit"  type="submit"/>
</div>
</form:form> 
</div>
</div>
</div>
</body>
</html>