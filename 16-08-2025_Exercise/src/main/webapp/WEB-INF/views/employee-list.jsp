<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Employee List</title></head>
<body>
<h2>Employee List</h2>
<a href="/employees/new">Add New Employee</a>
<table border="1">
    <tr><th>ID</th><th>Name</th><th>Department</th><th>Actions</th></tr>
    <c:forEach var="emp" items="${employees}">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.name}</td>
            <td>
              <c:choose>
                <c:when test="${not empty emp.department}">
                  ${emp.department.name}
                </c:when>
                <c:otherwise>
                  N/A
                </c:otherwise>
              </c:choose>
            </td>
            <td>
                <a href="/employees/edit/${emp.id}">Edit</a> |
                <a href="/employees/delete/${emp.id}" onclick="return confirm('Are you sure?')">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

