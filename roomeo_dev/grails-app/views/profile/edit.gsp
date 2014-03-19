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
			<g:form role="form" class="profileform" controller="profile" action="createuser">
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
								    <input type="text" class="form-control" id="namefill" name="name" placeholder="Your Name">
						    </div>
						</div>
				    	
				    	<div id="agefield">
				    		<label id="age"> Age: </label>
					    	<div class="form-group" id="input">
								    <input type="text" class="form-control" id="agefill" name="age" placeholder="Your Age">
						    </div>
						</div>
						
						<div id="genderfield">
				    		<label id="gender"> Gender: </label>
					    	<div class="form-group" id="input">
								    <input type="text" class="form-control" id="genderfill" name="gender" placeholder="Your Gender">
						    </div>
						</div>
						
						<div id="collegefield">
				    		<label id="college"> College: </label>
					    	<div class="form-group" id="input">
								    <input type="text" class="form-control" id="collegefill" name="college" placeholder="Your College">
						    </div>
						</div>
						
						<div id="studyfield">
				    		<label id="study"> Area of Study: </label>
					    	<div class="form-group" id="input">
								    <input type="text" class="form-control" id="studyfill" name="study" placeholder="Area of Study:">
						    </div>
						</div>
						
						<div id="pricefield">
				    		<label id="price"> Price Range: </label>
					    	<div class="form-group" id="input">
								    <input type="text" class="form-control" id="pricefill" name="price" placeholder="Eg. 1000-5000">
						    </div>
						</div>

						<div id="desiredLocationfield">
							<label id="desiredLocation"> Desired Location: </label>
							<div class="form-group" id="input">
								<input type="text" class="form-control" id="desiredLocationfill" name="location" placeholder="NYC">
							</div>
						</div>

						<button type="submit" class="btn btn-default" id="submitbutton">Submit</button>
	  		    	 </div> <%--  question col>--%>
		    	</div> <%-- row >--%>
		    </div> <%-- container >--%>
		    </g:form>
        	</div> <%-- tab-pane active l>--%>
			
			<div class="tab-pane" id="survey">
			<g:form role="form" class="profileform" controller="profile" action="createuser">
			<div class="container" id="profilecontainer">
            	<h1>Survey</h1><br>
            	
				
            		<label>What time do you wake up:</label><br><br>
					<input type="radio" name="wakeup" value="6" />6AM<br>
					<input type="radio" name="wakeup" value="10" />10AM<br>
					<input type="radio" name="wakeup" value="12" />12PM<br>
					<input type="radio" name="wakeup" value="16" />4PM<br>
				
            		<label>What time do you go to bed:</label><br><br>
					<input type="radio" name="bedtime" value="22" />10PM<br>
					<input type="radio" name="bedtime" value="0" />12AM<br>
					<input type="radio" name="bedtime" value="2" />2AM<br>
					<input type="radio" name="bedtime" value="12" />12PM<br>
				
            		<label>How many social events do you have:</label><br><br>
					<input type="radio" name="social" value="1">1/daily<br>
					<input type="radio" name="social" value="7">1/weekly<br>
					<input type="radio" name="social" value="14">1/biweekly<br>
					<input type="radio" name="social" value="31">1/monthly<br>
				
            		<label>What is your level of cleanliness:</label><br><br>
					<input type="radio" name="clean" value="1">1/daily<br>
					<input type="radio" name="clean" value="7">1/weekly<br>
					<input type="radio" name="clean" value="14">1/biweekly<br>
					<input type="radio" name="clean" value="31">1/monthly<br>

            		<label>Where is your desired location:</label><br><br>
					<input type="radio" name="desired" value="brooklyn">Brooklyn [hispter!]<br>
					<input type="radio" name="desired" value="bronx">Bronx<br>
					<input type="radio" name="desired" value="manhattan">Manhattan<br>
					<input type="radio" name="desired" value="statenisland">Staten Island [srsly?!]<br>
					<input type="radio" name="desired" value="queens">Queens [eww]<br>

            		<label>How long do you plan to stay there:</label><br><br>
					<input type="radio" name="stay" value="summer">Summer<br>
					<input type="radio" name="stay" value="fulltime">Fulltime<br>

            		<label>Do you have a room or need a room:</label><br><br>
					<input type="radio" name="room" value="have">Have Room<br>
					<input type="radio" name="room" value="need">Need Room<br>

            		<label>How often do you have guests overnight:</label><br><br>
					<input type="radio" name="guests" value="1">1/daily<br>
					<input type="radio" name="guests" value="7">1/weekly<br>
					<input type="radio" name="guests" value="14">1/biweekly<br>
					<input type="radio" name="guests" value="31">1/monthly<br>

            		<label>How religious are you:</label><br><br>
					<input type="radio" name="religious" value="NEVER">None<br>
					<input type="radio" name="religious" value="SOMEWHAT_LIKELY">Somewhat<br>
					<input type="radio" name="religious" value="ALWAYS">Most important thing in my life<br>

				<button type="submit" class="btn btn-default" id="submitbutton">Submit</button>
        	</div>
        	</g:form>
        	</div><%-- tab-pane >--%>
		
		</div> <%-- my-tab-content >--%>
	   
	</body>
</html>
