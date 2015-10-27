<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Mocosoft</title>
<link href='<c:url value="/resources/css/style1.css"/>' rel="stylesheet" type="text/css"  />
<link href='http://fonts.googleapis.com/css?family=Belgrano' rel='stylesheet' type='text/css'>
<link rel="icon" type="image/x-icon" href='<c:url value="/resources/images/bank.ico"/>' />

</head>
<body>
<div id="panelwrap">
  	
	<div class="header">
    <div class="title"><a href="#">Administra tu cuenta</a></div>
    
    <div class="header_right">Bienvenido<a href="#" class="settings">Configuracion</a> <a href="http://localhost:8080/cachorros/bancaenlinea" class="logout">Cerrar Sesion</a> </div>
    
    <div class="menu">
    <ul>
    <li><a href="http://localhost:8080/cachorros/bancaenlinea/inicio" class="selected">Inicio</a></li>
    <li><a href="#">Configuracion</a></li>
    <li><a href="#">Servicios</a></li>
    <li><a href="operaciones">Operaciones</a></li>
    <li><a href="#">Ayuda</a></li>
    </ul>
    </div>
    
           
                
    <div class="center_content">  
 
    <div id="right_wrap">
    <div id="right_content">             
    
    <ul id="tabsmenu" class="tabsmenu">
        <li class="active"><a href="#tab1">Transferencia</a></li>
        <li><a href="#tab2">Contratacion de Servicios</a></li>
        <li><a href="#tab3">Consulta de Movimientos</a></li>
    </ul>
    <div id="tab1" class="tabcontent">
        <h3>Envia dinero a otra cuenta</h3>
        <form action='<c:url value = "/bancaenlinea/operaciones/transfencia"/>'  method = "post">
        <div class="form">
            <div class="form_row">
            <label>Confirma tu numero de cuenta:</label>
            <input type="text" class="form_input" name="iIdCuenta" />
            </div>
             
            <div class="form_row">
            <label>Ingresa la cuenta que recibira la transferencia:</label>
            <input type="text" class="form_input" name="iIdCuenta2" />
            </div>
            
            <div class="form_row">
            <label>Ingresa el monto:</label>
            <input type="text" class="form_input" name="monto" />
            </div>
            
            <div class="form_row">
            <input type="submit" class="form_submit" value="Transferir" />
            </div> 
            <div class="clear"></div>
        </div>
        </form>
    </div>
    <div id="tab2" class="tabcontent">
        <h3>Tab two title</h3>
        <ul class="lists">
        <li>Consectetur adipisicing elit  error sit voluptatem accusantium doloremqu sed</li>
        <li>Sed do eiusmod tempor incididunt</li>
        <li>Ut enim ad minim veniam is iste natus error sit</li>
        <li>Consectetur adipisicing elit sed</li>
        <li>Sed do eiusmod tempor  error sit voluptatem accus antium dolor emqu incididunt</li>
        <li>Ut enim ad minim veniam</li>
        <li>Consectetur adipisi  error sit voluptatem accusantium doloremqu cing elit sed</li>
        <li>Sed do eiusmod tempor in is iste natus error sit cididunt</li>
        <li>Ut enim ad minim ve is iste natus error sitniam</li>
        </ul>
    </div>

    <div id="tab3" class="tabcontent">
        <h3>Tab three title</h3>
        <p>
    Lorem ipsum <a href="#">dolor sit amet</a>, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. <br /><br />Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?
        </p>
    </div> 
    
    <div id="tab4" class="tabcontent">
        <h3>Tab four title</h3>
        <p>
    Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, ad <br /><br />Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?
        </p>
    </div> 
     
    

    
        <div class="toogle_wrap">
            <div class="trigger"><a href="#">Toggle with text</a></div>

            <div class="toggle_container">
			<p>
        Lorem ipsum <a href="#">dolor sit amet</a>, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.Lorem ipsum <a href="#">dolor sit amet</a>, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
			</p>
            </div>
        </div>
      
     </div>
     </div><!-- end of right content-->
                     
                    
    <div class="sidebar" id="sidebar">
    <h2>Browse categories</h2>
    
        <ul>
            <li><a href="#" class="selected">Main page</a></li>
            <li><a href="#">Template settings</a></li>
            <li><a href="#">Add page</a></li>
            <li><a href="#">Edit section</a></li>
            <li><a href="#">Templates</a></li>
            <li><a href="#">Clients</a></li>
        </ul>
        
    <h2>Page Section</h2>
    
        <ul>
            <li><a href="#">Edit section</a></li>
            <li><a href="#">Templates</a></li>
            <li><a href="#">Clients</a></li>
            <li><a href="#">Docs and info</a></li>
        </ul> 
        
    <h2>User Settings</h2>
    
        <ul>
            <li><a href="#">Edit user</a></li>
            <li><a href="#">Add users</a></li>
            <li><a href="#">Manage users</a></li>
            <li><a href="#">Help</a></li>
        </ul>   
         
    <h2>Text Section</h2> 
    <div class="sidebar_section_text">
Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
    </div>         
    
    </div>             
    
    
    <div class="clear"></div>
    </div> <!--end of center_content-->
    
    <div class="footer">
Panelo - Free Admin Template by <a href="htpp://csstemplatesmarket.com" target="_blank">CSSTemplatesMarket</a>
</div>

</div>
<script src="/resources/js/jquery.min.js"></script>
<script src="/resources/js/jquery.tabify.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
var $ = jQuery.noConflict();
$(function() {
$('#tabsmenu').tabify();
$(".toggle_container").hide(); 
$(".trigger").click(function(){
	$(this).toggleClass("active").next().slideToggle("slow");
	return false;
});
});
</script>
</body>
</html>