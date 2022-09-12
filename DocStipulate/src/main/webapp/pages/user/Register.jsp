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
margin-top:85px;
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
  /*  box-shadow: 2px 3px 5px 1px rgb(78, 78, 78); */
   

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

/* .link-box:hover{
	background-color: #003865;
}
.link:hover{
	color:white;
} */
.line:hover{
	color:white;
}
*{
	margin:0px;	
}
.top-container{
	display:flex;
	flex-direction: column;
}
.navbar{
display:flex;
flex-wrap:wrae81df620-8a7d-4499-ba70-f8ee551a8c34p;
flex-direction:row-reverse;
width:100%;
height:60px;
background-color: #D4F6CC;
align-items: center;
/* justify-content:center; */
position:fixed;
z-index: 100;
margin-bottom: 20px;

}
.register-box{
	display: flex;
	width:150px;
	
}
.img{
	width: 40px;
	height: 40px;
	
}
img{
	width: 100%;
	height:100%;
	object-fit:cover;
}
.link-box{
	display: flex;
	justify-content: center;
	align-items: center;
	margin-left: 10px;
	flex-direction: column;
	
}
.link{
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
.line{
	width: 100%;
	height:10px;
	color:#D4F6CC;
}
.hide{
	visibility:hidden;
}


</style>
</head>
<body >

<nav class="navbar">
<div class="register-box">
<div class="img">
<img src="../images/about.png"/>
</div>
<div class="link-box">
<a class="link" href="/about" >About us</a>
</div>
</div>

<div class="register-box">
<div class="img">
<img src="../images/diagnostic.png"/>
</div>
<div class="link-box">
<a class="link" href="/register/diagnostic" >Diagnostic</a>

</div>
</div>
<div class="register-box">
<div class="img">
<img src="../images/doctor.png"/>
</div>
<div class="link-box">
<a class="link" href="/register/doctor" >Doctor</a>

</div>
</div>
<div class="about">
</div>
</nav>
 <div class="top-container">


</div> 
<div class="container">
<div class="register-container">
<div class="text-container">
<div class="text">
Create New Account as User
</div>
</div>
<div class="form-container">
 <form:form class="form-container" action="/register" modelAttribute="register" method="POST">
 <div class="input">
 <label class="label" for="fname">First Name</label>
 <div class="error">${fname}</div>
 <input name="fname" type="text" class="input-box" id="fname" placeholder="First Name"  onfocus="true"/>
 </div>
 <div class="input">
 <label class="label" for="lname">Last Name</label>
  <div class="error">${lname}</div>
 	<input class="input-box" id="lname" placeholder="Last Name" name="lname" type="text"  onfocus="true"/>

 </div>
<div class="input">
<label for="email" class="label"> Enter your Email</label>
 <div class="error">${email}</div>
<input id="email" placeholder="Enter email" name="email" class="input-box" type="email"  onfocus="true"/>
</div>
<div class="input">
<label for="username" class="label">Enter Username</label>
 <div class="error">${username}</div>
 <input name="username" placeholder="Username" id="username" class="input-box" type="text"  onfocus="true"/>
</div>
<div class="input">
<label for="password" class="label">Enter Password</label>
 <div class="error">${password}</div>
<input name="password" class="input-box" placeholder="Enter Password" id="password" type="password"  onfocus="true"/>

</div>
<div class="hide">
<input name="role" type="text" value="user"/>
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