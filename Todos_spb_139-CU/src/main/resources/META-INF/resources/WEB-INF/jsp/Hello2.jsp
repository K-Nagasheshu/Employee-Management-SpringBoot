<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
    
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"  rel="stylesheet"/>
        <title> WELCOME TO THE ENTER DETAILS PAGE </title>
        
    </head>

    <body>
          <div class = "container">
          
         
         <h1>Enter your Employee Details Here</h1>
          
          <form action="add-emp" method="post">
          
          
              Name:  <input type = "text" name = "name"/>
              Empid:  <input type = "number" name = "empid"/>
              Leave :  <input type = "text" name = "leave"/>
              Days:  <input type = "number" name = "days"/>
              
              <input type ="submit"  class="btn btn-success">SUBMIT</a>
              
          </form>
          
               
               
          </div>
          
                    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
                    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
                    
     </body>
     
</html> 

