<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
    
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"  rel="stylesheet"/>
        <title> WELCOME TO THE LEAVE APPLICATION DETAILS </title>
        
    </head>

    <body>
          <div class = "container">
          
         
         <h1>Your Details Are</h1>
          
          <table class ="table">
               <thead> 
                      <tr>
                           <th>NAME</th>
                           <th>EMP ID</th>
                           <th>LEAVE</th>
                           <th>DAYS</th>
                           
                      </tr>
               </thead>
               <tbody>
                    <c:forEach items="${leaves}" var="leave">
                       
                       <tr>
                             <td>${leave.name}</td>
                             <td>${leave.empid}</td>
                             <td>${leave.leave}</td>
                             <td>${leave.days}</td>
                       </tr>
                    </c:forEach> 
               </tbody>
          </table>
          
               <a href ="new-employee"  class="btn btn-success">add New Employee details</a>
               
          </div>
          
                    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
                    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
                    
     </body>
     
</html> 

