<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
    
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"  rel="stylesheet"/>
        <title> WELCOME TO THE TODOS </title>
        
    </head>

    <body>
          <div class = "container"> 
          
                   <h1> Enter the Dragon </h1>
                   
                   <form:form method = "post" modelattribute="main">
                           description: <form:input type="text" path = "description" requried = "requried"/>
                          <input type = "submit" class = "btn btn-success"/>
                   </form:form>
          </div>
          
                    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
                    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
                    
     </body>
     
</html> 

