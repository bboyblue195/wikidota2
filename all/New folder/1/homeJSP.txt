<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>
    Admin Error Page Control
</h1>
<form name="hw" method="POST">
<table>
<tr><td><h2>Main Menu</h2></td><td></td></tr>
<tr><td>&nbsp;</td><td></td></tr>
  <tr><td><a href="./c_Outage">Input Current Outage</a></td><td></td></tr>
  <tr><td><a href="./f_Outage">Input Future Outage</a></td><td></td></tr>
</table>
</form>

<h2>Current Outages</h2>
<table>
<h3><td> Date </td> <td> Type </td> <td> System </td> <td> Description </td></h3>
<tr><td>   ${ curdate }   </td><td>   ${ curtype }   </td><td>   ${ cursys }   </td><td>   ${ curdes }   </td></tr>
</table>


<table>
 <c:set var="input_ra" value="${currentString}" />
      <c:forEach var="ra_split" items="${fn:split(input_ra, '|')}" >
      <tr><td><c:out value="${ra_split}" /></tr></td>
  </c:forEach> 
</table>

<h2>Future Outages</h2>
<table>
<h3><td> Date </td> <td> Type </td> <td> System </td> <td> Description </td></h3>
<tr><td>   ${ futdate }   </td><td>   ${ futtype }   </td><td>   ${ futsys }   </td><td>   ${ futdes }   </td></tr>
</table>

<h2>Past Outages</h2>
<table>
<h3><td> Date </td> <td> Type </td> <td> System </td> <td> Description </td></h3>
<tr><td>   ${ pasdate }   </td><td>   ${ pastype }   </td><td>   ${ passys }   </td><td>   ${ pasdes }   </td></tr>
</table>

</body>
</html>