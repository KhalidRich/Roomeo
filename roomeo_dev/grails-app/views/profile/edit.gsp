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
		
		<ul id="tabs" class="nav nav-tabs">
			<li class="active"><a href="#profile" data-toggle="tab">Profile</a></li>
        	<li><a href="#survey" data-toggle="tab">Survey</a></li>
		</ul>
		
		<div  id="my-tab-content" class="tab-content">
			<div class="tab-pane active" id="profile">
			<g:form role="form" class="profileform" controller="profile" action="edit">
            <div class="container" id="profilecontainer">
	    		<div class="row">
	    		
	    		     <div class="col-sm-6">
	    		     	<div class="form-group">
							<label for="exampleInputFile">File input</label>
							<br>
							<input type="file" id="exampleInputFile">
							<p class="help-block">Load a picture of yourself!</p>
						</div>
	    		     </div> <%-- picture col >--%>
	    		     
	    		     <div class="col-sm-6">
			    		<div id="namefield">
				    		<label id="name"> Name: </label>
					    	<div class="form-group" id="input">
								    <input type="text" class="form-control" id="namefill" name="attr" value="name" placeholder="Your Name">
						    </div>
						</div>
				    	
				    	<div id="agefield">
				    		<label id="age"> Age: </label>
					    	<div class="form-group" id="input">
								    <input type="text" class="form-control" id="agefill" name="attr" value="age" placeholder="Your Age">
						    </div>
						</div>
						
						<div id="genderfield">
				    		<label id="gender"> Gender: </label>
					    	<div class="form-group" id="input">
								    <input type="text" class="form-control" id="genderfill" name="attr" value="gender" placeholder="Your Gender">
						    </div>
						</div>
						
						<div id="collegefield">
				    		<label id="college"> College: </label>
					    	<div class="form-group" id="input">
								    <input type="text" class="form-control" id="collegefill" name="attr" value="college" placeholder="Your College">
						    </div>
						</div>
						
						<div id="studyfield">
				    		<label id="study"> Area of Study: </label>
					    	<div class="form-group" id="input">
								    <input type="text" class="form-control" id="studyfill" name="attr" value="study" placeholder="Area of Study:">
						    </div>
						</div>
						
						<div id="pricefield">
				    		<label id="price"> Price Range: </label>
					    	<div class="form-group" id="input">
								    <input type="text" class="form-control" id="pricefill" name="price" placeholder="Eg. 1000-5000">
						    </div>
						</div>
						<button type="submit" class="btn btn-default" id="submitbutton">Submit</button>
	  		    	 </div> <%--  question col>--%>
		    	</div> <%-- row >--%>
		    </div> <%-- container >--%>
		    </g:form>
        	</div> <%-- tab-pane active l>--%>
			
			<div class="tab-pane" id="survey">
			<g:form role="form" class="profileform" controller="profile" action="edit">
            	<h1>Survey</h1><br>
            	<form action="">
            		<label>What time do you go to bed:</label><br><br>
					<input type="radio" name="bedtime" value="10PM">10PM<br>
					<input type="radio" name="bedtime" value="12AM">12AM<br>
					<input type="radio" name="bedtime" value="2AM">2AM<br>
					<input type="radio" name="bedtime" value="12PM">12PM
				</form>
				<form action="">
            		<label>What time do you wake up:</label><br><br>
					<input type="radio" name="waketime" value="6AM">6AM<br>
					<input type="radio" name="waketime" value="10AM">10AM<br>
					<input type="radio" name="waketime" value="12PM">12PM<br>
					<input type="radio" name="waketime" value="4PM">4PM
				</form>
				<form action="">
            		<label>How many social events do you have?</label><br><br>
					<input type="radio" name="social" value="1/daily">1/daily<br>
					<input type="radio" name="social" value="1/weekly">1/weekly<br>
					<input type="radio" name="social" value="1/biweekly">1/biweekly<br>
					<input type="radio" name="social" value="1/monthly">1/monthly
				</form>
			    <form action="">
            		<label>What is your level of cleanliness:</label><br><br>
					<input type="radio" name="social" value="1/daily">1/daily<br>
					<input type="radio" name="social" value="1/weekly">1/weekly<br>
					<input type="radio" name="social" value="1/biweekly">1/biweekly<br>
					<input type="radio" name="social" value="1/monthly">1/monthly
				</form>
				<form action="">
            		<label>Where is your desired location:</label><br><br>
					<input type="radio" name="social" value="brooklyn">Brooklyn [hispter!]<br>
					<input type="radio" name="social" value="bronx">Bronx<br>
					<input type="radio" name="social" value="manhattan">Manhattan<br>
					<input type="radio" name="social" value="statenisland">Staten Island [srsly?!]<br>
					<input type="radio" name="social" value="queens">Queens [eww]
				</form>
				<form action="">
            		<label>How long do you plan to stay there:</label><br><br>
					<input type="radio" name="social" value="summer">Summer<br>
					<input type="radio" name="social" value="fulltime">Fulltime
				</form>
				<form action="">
            		<label>Do you have a room or need a room:</label><br><br>
					<input type="radio" name="social" value="have">Have Room<br>
					<input type="radio" name="social" value="need">Need Room<br>
				</form>
				<form action="">
            		<label>How often do you have guests overnight:</label><br><br>
					<input type="radio" name="social" value="1/daily">1/daily<br>
					<input type="radio" name="social" value="1/weekly">1/weekly<br>
					<input type="radio" name="social" value="1/biweekly">1/biweekly<br>
					<input type="radio" name="social" value="1/monthly">1/monthly
				</form>
				<form action="">
            		<label>How religious are you:</label><br><br>
					<input type="radio" name="social" value="none">None<br>
					<input type="radio" name="social" value="somewhat">Somewhat<br>
					<input type="radio" name="social" value="mostimportant">Most important thing in my life
				</form>
				<button type="submit" class="btn btn-default" id="submitbutton">Submit</button>
        	</g:form>
        	</div><%-- tab-pane >--%>
		
		</div> <%-- my-tab-content >--%>
	   
	</body>
</html>
