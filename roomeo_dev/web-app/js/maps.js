/**
 * Data for the markers consisting of a name, a LatLng and a zIndex for
 * the order in which these markers should display on top of each
 * other.
 */
var geocoder;
var beaches = [
  ['Bondi Beach', -33.890542, 151.274856, 4],
  ['Coogee Beach', -33.923036, 151.259052, 5],
  ['Cronulla Beach', -34.028249, 151.157507, 3],
  ['Manly Beach', -33.80010128657071, 151.28747820854187, 2],
  ['Maroubra Beach', -33.950198, 151.259302, 1]
];

function setMarkers(map, users) {
  // Add markers to the map

  // Marker sizes are expressed as a Size of X,Y
  // where the origin of the image (0,0) is located
  // in the top left of the image.

  // Origins, anchor positions and coordinates of the marker
  // increase in the X direction to the right and in
  // the Y direction down.
//  var image = {
//    url: urlIn,
//    // This marker is 20 pixels wide by 32 pixels tall.
//    size: new google.maps.Size(80, 100),
//    // The origin for this image is 0,0.
//    origin: new google.maps.Point(0,0),
//    // The anchor for this image is the base of the flagpole at 0,32.
//    anchor: new google.maps.Point(0, 62)
//  };
//  // Shapes define the clickable region of the icon.
//  // The type defines an HTML &lt;area&gt; element 'poly' which
//  // traces out a polygon as a series of X,Y points. The final
//  // coordinate closes the poly by connecting to the first
//  // coordinate.
//  var shape = {
//      coord: [1, 1, 1, 20, 18, 20, 18 , 1],
//      type: 'poly'
//  };
//  for (var i = 0; i < locations.length; i++) {
//    var beach = locations[i];
//    var myLatLng = new google.maps.LatLng(beach[1], beach[2]);
//    var marker = new google.maps.Marker({
//        position: myLatLng,
//        map: map,
//        icon: image,
//        shape: shape,
//        title: beach[0],
//        zIndex: beach[3]
//    });
//  }
//	for (var i=0;i<users.length;i++)
//	{ 
//		var user = users[i];
//		var contentString = setContet(user);
//		  var infowindow = new google.maps.InfoWindow({
//		      content: contentString
//		  });
//		    geocoder.geocode( { 'address': user.location}, function(results, status) {
//		      if (status == google.maps.GeocoderStatus.OK) {
//		        map.setCenter(results[0].geometry.location);
//		        var marker = new google.maps.Marker({
//		            map: map,
//		            position: results[0].geometry.location
//		            title: user.firtsname
//		        });
//		      } else {
//		        alert("Geocode was not successful for the following reason: " + status);
//		      }
//		    });
//		  
//		  google.maps.event.addListener(marker, 'click', function() {
//		    infowindow.open(map,marker);
//		  });
//	}
	// practice
	for (var i=0;i<users.length;i++)
	{ 
		var user = users[i];
		var contentString = setContet(user);
		  var infowindow = new google.maps.InfoWindow({
		      content: contentString
		  });
		    geocoder.geocode( { 'address': user[1]}, function(results, status) {
		      if (status == google.maps.GeocoderStatus.OK) {
		        map.setCenter(results[0].geometry.location);
		        var marker = new google.maps.Marker({
		            map: map,
		            position: results[0].geometry.location
		            title: user.firtsname
		        });
		      } else {
		        alert("Geocode was not successful for the following reason: " + status);
		      }
		    });
		  
		  google.maps.event.addListener(marker, 'click', function() {
		    infowindow.open(map,marker);
		  });
	}
}

function setContet(user){
//	var contentString = '<div id="content">'+
//    '<div id="siteNotice">'+
//    '</div>'+
//    '<h1 id="firstHeading" class="firstHeading">' + user.firstname + 'Uluru</h1>'+
//    '<div id="bodyContent">'+
//    '<li>Max Desired Rent' + user.rent + '</li>'+
//    '<li>Desired Location to Rent' + user.location + '</li>'+
//    '</div>'+
//    '</div>';
//	contentString
	
	//practice
	var contentString = '<div id="content">'+
    '<div id="siteNotice">'+
    '</div>'+
    '<h1 id="firstHeading" class="firstHeading">' + user[0] + 'Uluru</h1>'+
    '<div id="bodyContent">'+
    '<li>Max Desired Rent' + user[1] + '</li>'+
    '<li>Desired Location to Rent' + user[2] + '</li>'+
    '</div>'+
    '</div>';
	contentString
}
