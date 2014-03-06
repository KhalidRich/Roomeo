<!DOCTYPE html>
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
        <g:form controller="user" action="login">
          <div class="form-group">
            <input type="text" class="form-control" name="username" placeholder="username" size="20px">
          </div>
          <div class="form-group">
            <input type="password" class="form-control" name="password" placeholder="password">
          </div>
          <div id="cta-submit-btn"><button type="submit" class="btn btn-default">Submit</button></div>
		</g:form>
        </div>
      </div>
      
    </div>
		</div>
	
	</body>

</html>
