<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Data</title>
</head>
<body>
<form:form modelAttribute="student">
<div>
<form:errors path="sid"/>
</div>
<div>
<form:label path="sid">Student Id</form:label>
<form:input path="sid"/>
</div>
<div>
<form:errors path="name"/>
</div>
<div>
<form:label path="name">Name</form:label>
<form:input path="name"/>
</div>
<div>
<form:errors path="gender"/>
</div>
<div>
<form:label path="gender">Gender</form:label>

<form:radiobutton path="gender" value="male" label="male"/><br>
<form:radiobutton path="gender" value="female" label="female"/><br>
<form:radiobutton path="gender" value="others" label="others"/><br>

</div>
<div>
<form:errors path="address"/>
</div>
<div>
<form:label path="address">Address</form:label>
<form:textarea path="address"/>
</div>
<div>
<form:errors path="age"/>
</div>
<div>
<form:label path="age">Age</form:label>
<form:input path="age"/>

</div>
<div>
<form:errors path="courses"/>
</div>
<div>
<form:checkbox path="courses" value="angular" label="angular"/><br>
<form:checkbox path="courses" value="spring" label="spring"/><br>
<form:checkbox path="courses" value="jpa" label="jpa"/><br>
<form:checkbox path="courses" value="java" label="java"/><br>
<form:checkbox path="courses" value="hibernate" label="hibernate"/><br>
</div>
<div>
<form:errors path="mobileno"/>
</div>
<div>
<form:label path="mobileno">MobileNo</form:label>
<form:input path="mobileno"/>
</div>
<form:button>add</form:button>
</form:form>
</body>
</html>