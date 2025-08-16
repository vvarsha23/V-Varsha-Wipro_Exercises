<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Employee Form</title></head>
<body>

<h2>
    <c:choose>
        <c:when test="${employee.id != null}">
            Edit Employee
        </c:when>
        <c:otherwise>
            Add Employee
        </c:otherwise>
    </c:choose>
</h2>

<c:choose>
    <c:when test="${employee.id != null}">
        <c:set var="formAction" value="/employees/update/${employee.id}" />
    </c:when>
    <c:otherwise>
        <c:set var="formAction" value="/employees" />
    </c:otherwise>
</c:choose>

<form:form modelAttribute="employee" method="post" action="/employees">
    Name: <form:input path="name" /><br/>
    Salary: <form:input path="salary" /><br/>

    <h4>Address</h4>
    City: <form:input path="address.city" /><br/>
    State: <form:input path="address.state" /><br/>
    Zip: <form:input path="address.zip" /><br/>

    <h4>Department</h4>
    Department ID: <form:input path="department.id" /><br/>

    <input type="submit" value="Save"/>
</form:form>

</body>
</html>
