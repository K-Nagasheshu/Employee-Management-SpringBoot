<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

           <head>
                      <title> MY OWN PROJECT </title>
           </head>
           
           
           <body>
                 <h1>my student details</h1>
                 
                        <c:forEach items="${course}" var="student">
                            <pre> RollNumber :${student.rollNumber} </pre> 
                            <pre> Name :${student.name} </pre>
                            <pre> Standard :${student.standard} </pre>
                            <pre> Marks :${student.marks} </pre>
                        </c:forEach>
           
            </body>
 </html>



