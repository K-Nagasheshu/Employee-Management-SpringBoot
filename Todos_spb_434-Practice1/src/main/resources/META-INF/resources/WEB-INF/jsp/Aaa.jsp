<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<body>
<h2>Leave Application Form</h2>

<form:form action="Mani" method="post" modelAttribute="student">

    Employee Name:
    <form:input path="Name"/>
    <br><br>

    Employee ID:
    <form:input path="Empid"/>
    <br><br>

    Leave Type:
    <form:input path="Leave"/>
    <br><br>

    Number of Days:
    <form:input path="Days"/>
    <br><br>

    <input type="submit" value="Leave"/>

</form:form>

</body>
</html>
