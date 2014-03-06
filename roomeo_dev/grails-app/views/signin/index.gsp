<%--<!DOCTYPE html>
<html> 
	<head>
	<meta name="layout" content="application"/>
		<g:render template="/templates/navbar" />
		<link rel="stylesheet" type="text/css" href="${resource(dir: 'css', file: 'roomeo.css')}">
	</head>
	<body>
			<div>
		    <div class="container" id="sign-up">
      <!-- Example row of columns -->
      
      <div class="row">
        <div class="col-md-6 col-md-offset-3">
        <g:form controller="signin" action="signin">
          <div class="form-group">
            <input type="text" class="form-control" id="user-name" placeholder="username" size="20px">
          </div>
          <div class="form-group">
            <input type="password" class="form-control" id="password" placeholder="password">
          </div>
          <div id="cta-submit-btn"><button type="submit" class="btn btn-default">Submit</button></div>
		</g:form>
        </div>
      </div>
      
    </div>
		</div>
	
	</body>

</html>--%>

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="application"/>
		<g:render template="/templates/navbar" />
		<link rel="stylesheet" type="text/css" href="${resource(dir: 'css', file: 'roomeo.css')}">
	</head>
	<body class="home" background="${resource(dir: 'images', file: 'skyline.jpg')}"> 
		<div id="homeh1">
  			Find the perfect roommate in the perfect location!
		</div>
		<div id="homesearch" role="search" class="navbar-form navbar-left">
       		 <div id="searchbox" class="form-group">
        		  <input type="text" class="form-control" placeholder="Search for your city!">
       		 </div>
        	<button id="searchbutton" type="submit" class="btn btn-default">Search Now!</button>
        </div>
	</body>

</html>
