<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'roomeo.css')}">
     <link rel="icon" 
      type="image/icon" 
      href="http://images2.similargroup.com/image?url=ramos-4.bloger.hr&t=2&s=10&h=12258656341838259611">
  </head>
	
	<body class="search" id="signup-background"> 
	<g:render template="/templates/navbar" />
	<div id='container'>
	<center>
	<g:if test="${errorMessage}">
	<p> In here!</p>
	<p> ${errorMessage}</p>
	</g:if>
	<div class="panel panel-default" id="registerpanel">
  		<div class="panel-heading">
    		<h3 class="panel-title">Sign Up to Find The Perfect Roommate!</h3>
  		</div>
  		<div class="panel-body">
				<g:form role="form" class="searchform" controller="user" action="register">
				  <div> <label for="username"> Username </label></div>
				  <br>
				  <div class="form-group" id="username">
				     <input type="text" class="form-control" id="username" name="username">
				  </div>
				  
				  <div> <label>Password </label></div>
				  <br>
		          <div class="form-group">
		            <input type="password" class="input-medium" name="password" placeholder="password">
		          </div>
				  
				  <div><label> School Email </label></div>
				  <br>
				  <div class="form-group" id="schoolemail">
				    <input type="text" class="form-control" id="schoolemail" name="schoolemail" placeholder=".edu email">
				  </div>
				  <br>
				  <button type="submit" class="btn btn-default" id="submitbutton">Submit</button>
				  </g:form>
  		</div>
  		</center>
	</div>
	</body>

</html>


