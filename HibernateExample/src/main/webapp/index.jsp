<%@ page import="com.techouts.Student, java.util.List" %>

<html>
<head>
    <title>Student List</title>
</head>
<body>

<h2>Students</h2>

<%
    List<Student> students =
        (List<Student>) request.getAttribute("list");
    System.out.println(students);
    System.out.println("jsp called");

    if (students != null) {
        for (Student s : students) {
%>
            <p>
                ID: <%= s.getId() %> |
                Name: <%= s.getName() %> |
                Marks: <%= s.getMarks() %>
            </p>
<%
        }
    } else {
%>
        <p>No students found.</p>
<%
    }
%>

</body>
</html>