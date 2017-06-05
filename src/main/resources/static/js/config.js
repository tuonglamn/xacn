requirejs.config({
	baseUrl: 'js/',
	paths: {
        'jquery': 'bower/jquery/jquery',
        'angular': 'bower/angular/angular',
        'googlemaps': 'bower/googlemaps-amd/googlemaps',
        'async': 'bower/requirejs-plugins/async',
        'domReady': 'bower/requirejs-domready/domReady',
        'map': 'common/map',
        'slide': 'common/slide',
        'temp': 'common/temp'
    },
    googlemaps: {
    	params: {
    		key: 'AIzaSyAzIDW9AZseqnR8vcY12OtfQPIV_MODSXQ'
    	}
    },
    shim: {
    	'jquery': []
    }});