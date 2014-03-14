<html>		
 <link href="${resource(dir: 'css', file: 'bootstrap.min.css')}" rel="stylesheet">
 <link rel="stylesheet" href="${resource(dir: 'style', file: 'styles.css')}">
<link rel="stylesheet" href="${resource(dir: 'css', file: 'roomeo.css')}">
<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="${resource(dir: 'js', file: 'bootstrap.min.js')}"></script>

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
		<li><a href="${createLink(controller: 'search', action: 'index')}">Search</a></li>
		<g:if test="${session.userId}">
			<li><a href="${createLink(controller: 'profile', action: 'index')}">Profile</a></li>
			<li><a href="${createLink(controller: 'user', action: 'logout')}">Log Out</a></li>
		</g:if>
		<g:else>
			<li><a href="${createLink(controller: 'subscription', action: 'index')}">Sign Up</a></li>
			<li class="dropdown">
			<div class="btn-group">
			  <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
			    Log In <span class="caret"></span>
			  </button>
			  <ul class="dropdown-menu" role="menu">
			<g:form controller="user" action="login" params="[targetUri: (request.forwardURI - request.contextPath)]">
		          <div class="form-group">
		            <input type="text" class="input-medium" name="username" placeholder="username" size="20px">
		          </div>
		          <div class="form-group">
		            <input type="password" class="input-medium" name="password" placeholder="password">
		          </div>
		          <button type="submit" class="btn btn-default" id="submitbutton">Submit</button>
		          <g:if test="${errorMessage}">
		          <p> ${errorMessage}</p>
		          </g:if>
			</g:form>
			  </ul>
        </li>
		</g:else>
      </ul>
    </div>
</html>

