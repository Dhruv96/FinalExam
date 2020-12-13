<%--
  Created by IntelliJ IDEA.
  User: dhruvgrover
  Date: 12/12/20
  Time: 5:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <table class="table table-striped">
        <caption>The following are the student records</caption>

        <thead>
        <tr>
            <th>Student Number</th>
            <th>Student Name</th>
            <th>GPA</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${students}" var="student">
            <tr>
                <td>${student.snumber}</td>
                <td>${student.sname}</td>
                <td>${student.gpa}</td>
                <td>

                    <a type="button" class="btn btn-primary"
                       href="update-student?id=${student.id}">Edit</a>

                    <a type="button" class="btn btn-warning"
                       href="delete-student?id=${student.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div>
        <a class="btn btn-success" href="addRecord.jsp">Add</a>
    </div>
</div>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
