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
							    <input type="text" class="form-control" id="studyfill" name="studye" placeholder="Area of Study:">
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
	    </div> <%-- container l>--%>
	    
	</body>
</html>
