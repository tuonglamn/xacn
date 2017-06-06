requirejs.config({
	baseUrl: 'js/',
	paths: {
        'jquery': 'bower/jquery/jquery',
        'angular': 'bower/angular/angular',
        'googlemaps': 'bower/googlemaps-amd/googlemaps',
        'async': 'bower/requirejs-plugins/async',
        'slider': 'bower/flexslider/jquery.flexslider',
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
    	'slider':{
    		deps: ['jquery'],
    		exports: 'slider'
    	},
    	'jquery': []
    }});