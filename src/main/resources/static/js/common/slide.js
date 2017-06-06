define(['jquery', 'domReady', 'slider'],function($, domReady, slider){
	return {
		init:function(){
			domReady(function () {
				$('.flexslider').flexslider({
				    animation: "slide"
				  });
		    });
		}
	}
})