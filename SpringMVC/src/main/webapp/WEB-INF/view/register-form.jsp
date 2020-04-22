<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form:form action = "processForm" modelAttribute = "person" >
		First Name: <form:input path = "firstName" />
		<br>
		Last Name:  <form:input path = "lastName" />
		<br>
		Country:
		<form:select path = "country">
			<form:options items = "${person.countryOptions}" />
		</form:select>
		<br>
		Gender:
		
		Male<form:radiobutton path = "gender" value = "male" />
		Female<form:radiobutton path = "gender" value = "female" />
		<br>
		Mobile: <form:input path = "mobile"/>
		<input type = "submit" value = "submit" />
		
	</form:form>
</body>
</html>