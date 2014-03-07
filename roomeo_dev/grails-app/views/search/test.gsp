<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
    <style type="text/css">
      html { height: 100% }
      body { height: 100%; margin: 0; padding: 0 }
      #map-canvas { height: 100% }
    </style>
	<script type="text/javascript"
      src="https://maps.googleapis.com/maps/api/js?sensor=false">
    </script>
    <script src="${resource(dir: 'js', file: 'maps.js')}"></script>
    <script type="text/javascript">
      function initialize() {
 			  var mapOptions = {
					    zoom: 13,
					    center: new google.maps.LatLng(-33.9, 151.2)
					  }
					  var map = new google.maps.Map(document.getElementById('map-canvas'),
					                                mapOptions);
					var url = "${resource(dir: 'images', file: 'sabina.jpg')}"
					  setMarkers(map, beaches, url);
      }
      google.maps.event.addDomListener(window, 'load', initialize);
    </script>
  </head>
  <body>
    <div id="map-canvas"/>
  </body>
</html>