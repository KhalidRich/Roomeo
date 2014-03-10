<!DOCTYPE html>
<html>
  <head>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'roomeo.css')}">
    <g:render template="/templates/navbar" />
    <script type="text/javascript"
      src="https://maps.googleapis.com/maps/api/js?sensor=false">
    </script>
    <script>
    function initialize() {
    	  var myLatlng = new google.maps.LatLng(40.67,-73.94);
    	  var mapOptions = {
    	    zoom: 10,
    	    center: myLatlng
    	  };

    	  var map = new google.maps.Map(document.getElementById('map-canvas'), mapOptions);

    	  if(test="${users}"){
        	  setMarkers(${users})
    	  }
    	}
    	google.maps.event.addDomListener(window, 'load', initialize);
     </script>
  </head>
  <body>
    <div id='container'>
      <g:form controller="search" action="getsearchmatches">	
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
		  
		  <div id="cta-submit-btn"><button type="submit" class="btn btn-default">Submit</button></div>
		
		</g:form>
    </div>
 
    <div id='map-canvas'></div>
  </body>
</html>