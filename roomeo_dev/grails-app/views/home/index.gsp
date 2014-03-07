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
        		  <input type="text" class="form-control" name="cityname" placeholder="Search for your city!">
       		 </div>
        	<button id="searchbutton" type="submit" class="btn btn-default">Search Now!</button>
        </div>
	</body>

</html>
