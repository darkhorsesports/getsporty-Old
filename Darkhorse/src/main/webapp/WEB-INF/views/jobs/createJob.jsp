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
<div class="">
<div class="messsage">
<div style="margin-left: 250px;"><h4>Create job</h4></div>
<c:if test="${not empty message}">
<span class="error"></span>
</c:if>
</div>
	<form:form commandName="job" name="player" id="player" class="form-horizontal">
	 <form:hidden path="id" />
	 
	 <div class="col-sm-4">
	 <label>Title</label>
	 <form:input path="title"/>
	 </div>

	 <div class="col-sm-5">
	 <label>Organization</label>
	 <form:input path="organization"/>
	 </div>
	
	 <div class="col-sm-4">
	 <label>Location</label>
	 <form:input path="location"/>
	 </div>
	
	 <div class="col-sm-5">
	 <label>Contact No.</label>
	 <form:input path="contact.mobileNo"/>
	 </div>

	 <div class="col-sm-4">
	 <label>Description</label>
	 <form:textarea path="description"/>
	 </div>
	 
	 <div class="col-sm-5">
	 <label>Address</label>
	 <form:textarea path="contact.area"/>
	 </div>
	 
	 <div class="col-sm-4">
	 <label>City</label>
	 <form:input path="contact.city"/>
	 </div>
	 
	 <div class="col-sm-5">
	 <label>Pincode</label>
	 <form:input path="contact.pincode"/>
	 </div>

	 <div class="col-sm-4">
	 <label>State</label>
	 <form:input path="contact.state"/>
	 </div>
	 

	 <div class="col-sm-5">
	 <label>Country</label>
		<select name="contact.country">
		<option value="IND">India</option>
		<option value="Oths">Others</option>
		</select>	 
	 </div>

	 <div class="col-sm-4">
	 <label>Desired Skills</label>
	 <form:textarea path="desiredSkills"/>
	 </div>
	 
	 <div class="col-sm-5">
	 <label>Job Links</label>
	 <form:textarea path="jobLinks"/>
	 </div>
	 
	 
	 <div class="col-sm-4">
	 <label>Job Type</label>
		<form:select path="jobType">
		<form:option value="Permanent">Permanent</form:option>
		<form:option value="Contract">Contract</form:option>
		<form:option value="Parttime">Part time</form:option>
		</form:select>	 
	 </div>
	 <div class="col-sm-5">
	 <label>Experience</label>
		<form:select path="experience">
		<form:option value="less than 1 year">less than 1 year(Entry level)</form:option>
		<form:option value="1-3 years">1-3 years</form:option>
		<form:option value="3-5 years">3-5 years</form:option>
		</form:select>	 
	 </div>
	 
	 <div class="clearfix"></div>

	<div class="col-sm-4">
	 <label>Mode of apply</label>
		<form:select path="modeOfApply" multiple="true">
		<form:option value="Call">Call</form:option>
		<form:option value="Email">Email</form:option>
		<form:option value="Walk in">Walk in</form:option>
		</form:select>	 
	 </div>
	 
	 <div class="col-sm-5">	
	 <label>Enable</label>
	 <form:checkbox path="enable"/>
	 </div>
	 
	 <div class="col-sm-9">
	 <label></label>
	 <input type="submit" value="save">
	 </div>
	 
	 
	 </form:form>
</div>
</div>
</section>
