<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <style>
       /* Set the size of the div element that contains the map */
      #map {
        height: 400px;
        width: 600px;
       }
    </style>
  </head>
  <body>
    <!--The div elements for the map and message -->
    <div id="map"></div>
    <div id="msg"></div>
    <form action="cabFare">
    <input type="text" onclick=initMap()><h4><a href=# >Click here to calculate distance!!</a></h4>
     </form>
    <script> async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCqoWOqEw244T76xcpvduDnIn6hnNllSH0"
    type="text/javascript"></script>

    <script>
    //  src="AIzaSyCqoWOqEw244T76xcpvduDnIn6hnNllSH0"

     function haversine_distance(mk1, mk2) {
      var R = 6371.0710; // Radius of the Earth in kms
      var rlat1 = mk1.position.lat() * (Math.PI/180); // Convert degrees to radians
      var rlat2 = mk2.position.lat() * (Math.PI/180); // Convert degrees to radians
      var difflat = rlat2-rlat1; // Radian difference (latitudes)
      var difflon = (mk2.position.lng()-mk1.position.lng()) * (Math.PI/180); // Radian difference (longitudes)

      var d = 2 * R * Math.asin(Math.sqrt(Math.sin(difflat/2)*Math.sin(difflat/2)+Math.cos(rlat1)*Math.cos(rlat2)*Math.sin(difflon/2)*Math.sin(difflon/2)));
      return d;
    }

var map;
function initMap() {

  const center = {lat: 40.774102, lng: -73.971734};
  const options = {zoom: 15, scaleControl: true, center: center};
  map = new google.maps.Map(
      document.getElementById('map'), options);
  // Locations of landmarks
  const virtusa = {lat: 12.841037, lng: 80.226634};
  const mugappair = {lat: 13.084787, lng: 80.172502};
  // The markers for The Virtusa and Mugappair
  var mk1 = new google.maps.Marker({position: virtusa, map: map});
  var mk2 = new google.maps.Marker({position: mugappair, map: map});
  // Draw a line showing the straight distance between the markers

  var line = new google.maps.Polyline({path: [dakota, frick], map: map});
  // Calculate and display the distance between markers

  var distance = haversine_distance(mk1, mk2);

  document.getElementById('msg').innerHTML = "Distance between markers: " + distance.toFixed(2) + " mi.";
  let directionsService = new google.maps.DirectionsService();
  let directionsRenderer = new google.maps.DirectionsRenderer();
  directionsRenderer.setMap(map); // Existing map object displays directions

  // Create route from existing points used for markers

  const route = {
        origin: Virtusa,
        destination: Mugappair,
        travelMode: 'DRIVING'
  }

  directionsService.route(route,
    function(response, status) { // anonymous function to capture directions
      if (status !== 'OK') {
        window.alert('Directions request failed due to ' + status);
        return;
      } else {
        directionsRenderer.setDirections(response); // Add route to the map
        var directionsData = response.routes[0].legs[0]; // Get data about the mapped route
        if (!directionsData) {
          window.alert('Directions request failed');
          return;
        }
        else {
          document.getElementById('msg').innerHTML += " Driving distance is " + directionsData.distance.text + " (" + directionsData.duration.text + ").";
        }
      }
    });
    
}

</script>
  </body>
</html>