define(['googlemaps!'],function(gmaps){
	return {
		mapStart: function(){
			myCenter=new gmaps.LatLng(41.878114, -87.629798);
			  var mapOptions= {
			    center:myCenter,
			    zoom:12, scrollwheel: false, draggable: false,
			    mapTypeId:gmaps.MapTypeId.ROADMAP
			  };
			  var map=new gmaps.Map(document.getElementById("googleMap"),mapOptions);

			  var marker = new gmaps.Marker({
			    position: myCenter,
			  });
			  marker.setMap(map);
		}
	}
})


