<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<spring:url value="/users/changePassword" var="chgpass"/>
<spring:url value="/users/showPaymentLog" var="spl"></spring:url>
<spring:url value="/users/usageLog" var="usageLog"/>
<section class="large-12">
<div class="container">
<div class="col-sm-9">
	<table>
	<thead>
	<tr>
	<th>Name</th>
	<th>Email</th>
	<th>Mobile No.</th>
	<th>City</th>
	<th>Actions</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${players}" var="player">
	<tr>
	<td>${player.user.name}</td>
	<td>${player.user.email}</td>
	<td>${player.contact.mobileNo}</td>
	<td>${player.contact.city}</td>
	<td></td>
	</tr>
	</c:forEach>
	</tbody>
	</table>
</div>
</div>
</section>
