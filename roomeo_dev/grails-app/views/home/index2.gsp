<!DOCTYPE html>
<html>
	<head>
	     <link rel="icon" 
      type="image/icon" 
      href="http://images2.similargroup.com/image?url=ramos-4.bloger.hr&t=2&s=10&h=12258656341838259611">
		<meta name="layout" content="application"/>
		<g:render template="/templates/navbar" />
		<link rel="stylesheet" type="text/css" href="${resource(dir: 'css', file: 'roomeo.css')}">
		<script>
	  	(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
		  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
		  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
		  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
		
		  ga('create', 'UA-48085984-1', 'roomieconnect.com');
		  ga('send', 'pageview');
		</script>
	</head>
	<body class="home" background="${resource(dir: 'images', file: 'background.jpg')}"> 
		<div id="homeh1">
  			<font color="white">Search desired location to find your perfect roommate</font>
		</div>
		<g:form role="form" id="homesearch" role="search" class="navbar-form navbar-left" controller="search" action="index">
			<div id="searchbox" class="form-group">
        		  <input type="text" class="form-control" name="cityname" placeholder="Search for your city!">
       		 </div>
        	<button id="searchbutton" type="submit" class="btn btn-default" onclick="_gaq.push(['_trackEvent', 'searchVersionBl', 'interest_form_submit', 'funnel_submit_btn']);">Search Now!</button>
		</g:form>
		</body>

</html>
