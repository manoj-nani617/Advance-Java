<%@page import="com.techouts.model.Users,java.util.List"%>


<%
List<Users> users = (List<Users>) session.getAttribute("users");
if(users != null){
    for(Users user : users){
%>
      <%= user.getUsername() %> - <%= user.getPassword() %>
<%
    }
}
%>

