<html>		
 <link href="${resource(dir: 'css', file: 'bootstrap.min.css')}" rel="stylesheet">
 <link rel="stylesheet" href="${resource(dir: 'style', file: 'styles.css')}">
 <link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap.css')}" type="text/css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="${resource(dir: 'css', file: 'roomeo.css')}">

<nav class="navbar navbar-default" role="navigation">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display-->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>"grails-app/views/home/index.gsp"
      </button>
      <a class="navbar-brand" href="${createLink(controller: 'home', action: 'index')}">Roomeo</a>
	</div>

	<ul class="nav navbar-nav navbar-right">
        <li><a href="${createLink(controller: 'profile', action: 'index')}">Profile</a></li>
        <li><a href="${createLink(controller: 'search', action: 'index')}">Search</a></li>
        <li><a href="${createLink(controller: 'signin', action: 'index')}">Sign In</a></li>
        <li><a href="${createLink(controller: 'signup', action: 'index')}">Sign Up</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

</html>

