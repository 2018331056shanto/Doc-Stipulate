<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- <%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
    <%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>

</title>
<style type="text/css">
*{
	margin:0px;	
}

/* .top-container{
	display:flex;
	flex-direction: column;
} */
.container{
	
	display:flex;
	width:100%;
	   box-shadow: 2px 3px 5px 1px rgb(78, 78, 78);
	   margin-top:3px;
}
.doc-stipulate{
	display:flex;
	width:30%;
	height:70px;
	background-color:white;
	align-items: center;
	justify-content: center;
	background-color: #F5E8C7;

}
.doc-text{
	
	font-family: sans-serif;
	font-size: 30px;
	font-weight:900;
	color:#5BB318;
	
}

.navbar{

display:flex;
flex-wrap:wrap;
/* flex-direction:row-reverse; */
width:70%;
height:70px;
background-color: white;
align-items: center;
/* justify-content:center; */
position:fixed;
z-index: 100;
margin-bottom: 20px;
justify-content: space-around;


}
.register-box{
	display: flex;
	width:150px;
	justify-content: center;
	align-items: center;
	
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
	/* margin-left: 10px; */
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
.link-box:hover{
	
	background-color:#607EAA;
}
</style>
</head>
<body>
<div class="container">

<div class="doc-stipulate">
<div class="doc-text"> 
Doc Stipulate
</div>
 
</div>
<div class="navbar-container">

<nav class="navbar">
<div class="register-box">

<div class="link-box">
<a class="link" href="/" >Home</a>

</div>
</div>
<div class="register-box">

<div class="link-box">
<a class="link" href="/services" >Services</a>

</div>
</div>


<div class="register-box">

<div class="link-box">
<a class="link" href="/register/diagnostic" >Diagnostics</a>

</div>
</div>
<div class="register-box">

<div class="link-box">
<a class="link" href="/doctor" >Doctors</a>

</div>
</div>
<div class="register-box">

<div class="link-box">
<a class="link" href="/signin" >Sign in</a>

</div>
</div>
<div class="register-box">

<div class="link-box">
<a class="link" href="/about" >About us</a>
</div>
</div>
<div class="about">
</div>
</nav>
 <div class="top-container">


</div> 
</div>
</div>
</body>
</html>