define(['jquery'],function($){
	
	fopen = function sideOpen(){
		document.getElementById("mySidebar").style.display = "block";
	};
	
	fclose = function sideClose(){
		document.getElementById("mySidebar").style.display = "none";
	}
	
    return {
    	init: function(){
    		$('[id=sideItem]').on('click',fclose);
    		$('[id=sideBarToggle]').on('click',fopen);
    	}
    };
})