<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="application"/>
		<g:render template="/templates/navbar" />
		<link rel="stylesheet" type="text/css" href="${resource(dir: 'css', file: 'roomeo.css')}">
	</head>
	
	<body class="search"> 
		<form role="form" class="searchform" id="searchform1">
		
		  <div class="checkbox" id="haveroom">
		    <label>
		      <input type="checkbox" name="haveroom"> Have Room
		    </label>
		  </div>
		  <div class="checkbox" id="needroom">
		    <label>
		      <input type="checkbox" name="needroom"> Need Room
		    </label>
		  </div>
		  
		  <div class="form-group" id="numberofrooms">
		    <label for="numberOfRooms">Number of Rooms</label>
		    <input type="text" class="form-control" id="numberOfRooms" name="numberofrooms" placeholder="How many rooms do you want?">
		  </div>
		  
		  <div class="form-group" id="rent">
		    <label>Rent</label>
		    <input type="text" class="form-control" id="minrent" name="minrent" placeholder="Min"> to <input type="text" class="form-control" id="maxrent" name="maxrent"placeholder="Max">
		  </div>
		  
		  <div class="form-group" id="lengthofstay">
		    <label>Length of Stay</label>
		    <input type="text" class="form-control" id="stay" name="lengthofstay" placeholder="Number of months">
		  </div>
		  
          <div class="checkbox" id="cats">
		    <label>
		      <input type="checkbox" name="cats" id="cats"> Cats
		    </label>
		  </div>
		  <div class="checkbox" id="dogs">
		    <label>
		      <input type="checkbox" name="dogs" id="dogs"> Dogs
		    </label>
		  </div>
		  
		  <button type="submit" class="btn btn-default" id="submitbutton">Submit</button>
		
		</form>
	</body>

</html>




pass params.cityname