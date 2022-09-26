<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
<style>
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

</style>
</head>
<body>
<!-- 
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
</nav> -->
<%@ include file="../../decorators/Navbar.jsp" %>
 <div class="top-container">


</div> 

</body>
</html>