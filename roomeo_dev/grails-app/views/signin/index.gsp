<html> 
	<head>
		<meta name="layout" content="main"/>
		<g:render template="/templates/navbar" />
		<title>Welcome to Grails</title>
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

</html>