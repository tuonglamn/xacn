define(['jquery'],function($){
	
	var slideIndex = 1;
	
	plusSlides = function plusSlides(n) {
		showSlides(slideIndex += n);
	}

	function showSlides(n) {
		  var i;
		  var slides = $('.mySlides');
		  if (n > slides.length) {slideIndex = 1}
		  if (n < 1) {slideIndex = slides.length}
		  for (i = 0; i < slides.length; i++) {
		      slides[i].style.display = "none";
		  }
		  slides[slideIndex-1].style.display = "block";
	} 
	
    return {
    	init: function(){
    		showSlides(slideIndex);
    		$('.prev').on('click',plusSlides(-1));
    		$('.next').on('click',plusSlides(1));
    	}
    };
})