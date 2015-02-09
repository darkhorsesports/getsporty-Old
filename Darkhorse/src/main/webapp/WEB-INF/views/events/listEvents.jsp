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
	<th>Title</th>
	<th>Location</th>
	<th>Date</th>
	<th>Status</th>
	<th>Actions</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${events}" var="event">
	<tr>
	<td>${event.title}</td>
	<td>${event.location}</td>
	<td>${event.startDate}</td>
	<td>${event.enable}</td>
	<td></td>
	</tr>
	</c:forEach>
	</tbody>
	</table>
</div>
</div>
</section>
