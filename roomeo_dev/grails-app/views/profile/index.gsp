<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'roomeo.css')}">
		<link rel="icon" 
      type="image/icon" 
      href="http://images2.similargroup.com/image?url=ramos-4.bloger.hr&t=2&s=10&h=12258656341838259611">
      <g:render template="/templates/navbar" />
	</head>
	<body>
		 <div class="container" id="profilecontainer">
	    		<div class="row">
	    		     <div class="col-sm-6">
	    		     	<p> PICTURE </p>
	    		     </div>
	    	   	     <div class="col-sm-6">
	    	   	     	<p>Name: ${name}</p>
	    		     	<p>Age: ${age}</p>
	    		     	<p>Gender: ${gender}</p>
	    		     	<p>College: ${college}</p>
	    		     	<p>Area of Study: ${study}</p>
	    		     	<p>Desired Location: ${desired}</p>
	    		     	<p>Start Price ${startprice}</p>
	    		     	<p>End Price: ${endprice}</p>
	    	   	     </div>
					<g:form role="form" action="edit">
        			<button id="searchbutton" type="submit" class="btn btn-default">Edit Profile</button>
					</g:form>
	    	   </div> <%--row --%>
        </div> <%-- container--%> 
	
	</body>
</html>
