<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mocosoft</title>
<link rel="stylesheet" href="resources/css/style.css">
<link rel="icon" type="image/x-icon" href="resources/images/bank.ico" />
</head>
<body>

<div class="container">

  <div id="login-form">

    <h3>Iniciar Sesión Putos</h3>

    <fieldset>

      <form action="bancaenlinea/login" method="post" >
      
      	
      	<input name="cUsuario" type="text" required value="Usuario" onBlur="if(this.value=='')this.value='Usuario'" onFocus="if(this.value=='Usuario')this.value=''">
      	<input name="cPassword" type="password" required value="Password" onBlur="if(this.value=='')this.value='Password'" onFocus="if(this.value=='Password')this.value=''">
        
        <input type="submit" value="Ingresar">
        

        <footer class="clearfix">

          <p><span class="info">?</span><a href="http://localhost:8080/cachorros/">Registrate aquí</a></p>

        </footer>

      </form>

    </fieldset>

  </div> <!-- end login-form -->

</div>
</body>
</html>