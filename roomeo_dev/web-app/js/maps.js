/**
 * Data for the markers consisting of a name, a LatLng and a zIndex for
 * the order in which these markers should display on top of each
 * other.
 */
var geocoder = new google.maps.Geocoder();;
var beaches = [
  ['Bondi Beach', -33.890542, 151.274856, 4],
  ['Coogee Beach', -33.923036, 151.259052, 5],
  ['Cronulla Beach', -34.028249, 151.157507, 3],
  ['Manly Beach', -33.80010128657071, 151.28747820854187, 2],
  ['Maroubra Beach', -33.950198, 151.259302, 1]
];

var infos;
function setMarkers(map, users) {
	var infowindow = new google.maps.InfoWindow;
	for (var i=0;i<users.length;i++)
	{ 
		var user = users[i];
		var contentString = setContet(user);

//		console.log(i);
//		    geocoder.geocode( { 'address': user[2]}, function(results, status) {
//		      if (status == google.maps.GeocoderStatus.OK) {
//		    	console.log(user[i] + " " + i + " " + users.length);
//		        map.setCenter(results[0].geometry.location);
//		        var marker = new google.maps.Marker({
//		            map: map,
//		            position: results[0].geometry.location,
//		            title: user[0]
//		        });
//			    
//			    bindInfoW(marker, contentString, infowindow, map);
//		      } else {
//		        alert("Geocode was not successful for the following reason: " + status);
//		      }
//		    }); 
		 var marker = createMarker(map, infowindow,user,contentString);
	}
}

function createMarker(map, infowindow,user,contentString){
    geocoder.geocode( { 'address': user[2]}, function(results, status) {
    if (status == google.maps.GeocoderStatus.OK) {
      map.setCenter(results[0].geometry.location);
      var marker = new google.maps.Marker({
          map: map,
          position: results[0].geometry.location,
          title: user[0]
      });
  		bindInfoW(marker,contentString,infowindow,map );
  		return marker;
    } else {
      alert("Geocode was not successful for the following reason: " + status);
    }
  });
}

function bindInfoW(marker, contentString, infowindow, map)
{
        google.maps.event.addListener(marker, 'click', function() {
            infowindow.setContent(contentString);
            infowindow.open(map, marker);
        });
}

function closeInfos(){
	 
	   if(infos.length > 0){
	 
	      /* detach the info-window from the marker ... undocumented in the API docs */
	      infos[0].set("marker", null);
	 
	      /* and close it */
	      infos[0].close();
	 
	      /* blank the array */
	      infos.length = 0;
	   }
	}

function setContet(user){
	var contentString = '<div id="content">'+
    '<div id="siteNotice">'+
    '</div>'+
    '<h1 id="firstHeading" class="firstHeading">' + '<img src="' + user[4] + '" height="80" width="80">' + user[0] + '</h1>'+
    '<div id="bodyContent">'+ 
    '<li>Max Desired Rent: ' + user[1] + '</li>'+
    '<li>Desired Location to Rent: ' + user[2] + '</li>'+
    '<li>Match Percentage: ' + user[3] + '</li>'+
    '</div>'+
    '</div>';
	return contentString
	
	//practice
//	var contentString = '<div id="content">'+
//    '<div id="siteNotice">'+
//    '</div>'+
//    '<h1 id="firstHeading" class="firstHeading">' + user[0] + 'Uluru</h1>'+
//    '<div id="bodyContent">'+
//    '<li>Max Desired Rent' + user[1] + '</li>'+
//    '<li>Desired Location to Rent' + user[2] + '</li>'+
//    '</div>'+
//    '</div>';
//	console.log(contentString);
//	return contentString;
}
