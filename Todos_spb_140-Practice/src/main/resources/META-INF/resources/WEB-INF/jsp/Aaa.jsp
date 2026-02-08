<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

           <head>
                      <title> MY OWN PROJECT </title>
           </head>
           
           
           <body>
                 <h1>my student details</h1>
                 
                        <c:forEach items="${course}" var="name">
                            <pre> HallTicketNo :${name.hallTicketNo} </pre>
                            <pre> name :${name.name} </pre>
                            <pre> standard :${name.standard} </pre>
                        </c:forEach>
           
            </body>
 </html>



