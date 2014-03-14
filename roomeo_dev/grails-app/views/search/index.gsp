<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'roomeo.css')}">
    <script type="text/javascript"
      src="https://maps.googleapis.com/maps/api/js?sensor=false">
    </script>
    <script src="${resource(dir: 'js', file: 'maps.js')}"></script>
    <script>
    function initialize() {
    	var map;
    	  var myLatlng = new google.maps.LatLng(40.67,-73.94);
    	  var mapOptions = {
    	    zoom: 10,
    	    center: myLatlng,
    	    panControl: false,
    	    zoomControl: false,
    	    scaleControl: true
    	  };
		
    	  map = new google.maps.Map(document.getElementById('map-canvas'), mapOptions);
			if("${users}"){
				setMarkers(map, $.parseJSON("${users}".replace(/&quot;/g,'"')));
			}
    	}
    	google.maps.event.addDomListener(window, 'load', initialize);
     </script>
     <link rel="icon" 
      type="image/icon" 
      href="http://images2.similargroup.com/image?url=ramos-4.bloger.hr&t=2&s=10&h=12258656341838259611">
  </head>
	
	<body class="search"> 
	<div id='container'>
	<g:render template="/templates/navbar" />
		<div class="panel panel-default" id="searchpanel">
			 <div class="panel-body" id="panelbody">
				<g:form role="form" class="searchform" controller="search" action="index">
				
				  <div><label> Location </label></div>
				  <br>
				  <div class="form-group" id="location">
				    <input type="text" class="input-large form-control" id="loc" name="location" placeholder="Eg. NYC">
				  </div>
				  
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
				  
				  <div> <label for="numberOfRooms"> Number of Rooms </label></div>
				  <br>
				  <div class="form-group" id="roomnum">
				     <input type="text" class="form-control" id="rooms" name="numofrooms" placeholder="Eg. 2">
				  </div>
				  
				  <div> <label>Rent </label></div>
				  <br>
				  <div class="form-group" id="rent">
				    <input type="text" class="form-control" id="minrent" name="minrent" placeholder="Min"> <div id="to" >to</div> <input type="text" class="form-control" id="maxrent" name="maxrent"placeholder="Max">
				  </div>
				  
				  <div><label> Length of Stay </label></div>
				  <br>
				  <div class="form-group" id="lengthofstay">
				    <input type="text" class="form-control" id="stay" name="lengthofstay" placeholder="Months">
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
				  
				  <%--<g:actionSubmit value="Submit" action="index" />--%>
				  <button type="submit" class="btn btn-default" id="submitbutton">Submit</button>
				  </g:form>
			</div>
			</div>
		</div>
		 <div id='map-canvas'></div>
	</body>

</html>


