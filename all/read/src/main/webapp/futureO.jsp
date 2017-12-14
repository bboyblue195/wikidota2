<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <!-- Calender Style Sheet Begin -->
    <script src="//code.jquery.com/jquery-1.10.2.js"></script>
    <script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
    <script>
    $(function() {
        for (i = 0; i < 100000; i++) {
            $( "#datepicker"+i ).datepicker({ dateFormat: "mm/dd/yy", firstDay: 1, changeYear: true });
        }
    });
    </script>
</head>
<body>
<form:form method="post" action="" commandName="futureOutage">

<tr><td><h2>Input Future Outage</h2></td><td></td></tr>
<tr><td>&nbsp;</td><td></td></tr>
  <tr><td>Date: </td><td><input type="text" name="datefuture" id="datepicker2" style="width: 80px;"></td></tr>
  <tr><td>Type: </td><td>
    <select name="typefuture">
        <option value="">Select...</option> 
        <option value="Planned">Planned</option>
        <option value="Unplanned">Unplanned</option>
        <option value="Emergency">Emergency</option>  
    </select>
  </td></tr>
  <tr><td>System: </td><td><input type="text" name="systemfuture" ></td></tr>
  <tr><td>Description: </td><td><input type="text" name="descriptionfuture" style="width: 250px;" ></td></tr>
  <p class="submit"><input type="submit" name="commit" value="Add Future Issue"></p>

</form:form>
</body>
</html>