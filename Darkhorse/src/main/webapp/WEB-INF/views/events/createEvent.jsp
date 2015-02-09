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
<div style="margin-left: 250px;"><h4>Create event</h4></div>
<c:if test="${not empty message}">
<span class="error"></span>
</c:if>
</div>
	<form:form commandName="event" name="player" id="player" class="form-horizontal">
	 <form:hidden path="id" />
	 
	 <div class="col-sm-4">
	 <label>Title</label>
	 <form:input path="title"/>
	 </div>

	 <div class="col-sm-5">
	 <label>Organizer</label>
	 <form:input path="organizer"/>
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
	 <label>Terms and condition</label>
	 <form:textarea path="termsandcondition"/>
	 </div>
	 
	 <div class="col-sm-5">
	 <label>Event Links</label>
	 <form:textarea path=""/>
	 </div>
	 
	 <div class="col-sm-4">
	 <label>Start Date</label>
	 <form:input path="startDate" class="datepicker" placeholder="dd M yyyy" id="datetimepicker1"/>
	 </div>
 	 
 	 <div class="col-sm-5">
	 <label>End Date</label>
	 <form:input path="endDate" class="datepicker" placeholder="dd M yyyy" id="datetimepicker2"/>
	 </div>
	 
	 <div class="col-sm-4">
	 <label>Prize Amount</label>
	 <form:input path="prize"/>
	 </div>
	 
	 <div class="col-sm-5">
	 <label>Entry Fee</label>
	 <form:input path="entryAmount"/>
	 </div>
	 
	 
	 <div class="col-sm-4">
	 <label>Level</label>
		<form:select path="agegroup">
		<form:option value="U14">U14</form:option>
		<form:option value="U16">U16</form:option>
		<form:option value="U19">U19</form:option>
		<form:option value="U22">U22</form:option>
		</form:select>	 
	 </div>
	 
	 <div class="col-sm-4">	
	 <label>Enable</label>
	 <input type="checkbox" checked="checked" name="checkbox"/>
	 </div>
	 
	 <div class="col-sm-9">
	 <label></label>
	 <input type="submit" value="save">
	 </div>
	 
	 
	 </form:form>
</div>
</div>
</section>
<script type="text/javascript">
            $(function () {
                $('#datetimepicker1').datetimepicker();
                $('#datetimepicker2').datetimepicker();
            });
            
 $(document).ready(function () {
                
                $('#datetimepicker1').datepicker({
                    format: "dd/mm/yyyy"
                });  
            
                $('#datetimepicker2').datepicker({
                    format: "dd/mm/yyyy"
                });
            });
            
            
        </script>