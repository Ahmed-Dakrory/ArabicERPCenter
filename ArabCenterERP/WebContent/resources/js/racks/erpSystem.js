var prevScrollpos = window.pageYOffset;
window.onscroll = function() {
var currentScrollPos = window.pageYOffset;
if(window.pageYOffset>100){
  if (prevScrollpos > currentScrollPos+1) {
    document.getElementById("navbar").style.top = "0";
  } else {
    document.getElementById("navbar").style.top = "-150px";
  }
}
  if(window.pageYOffset == 0){
	  document.getElementById("navbar").style.top = "0";
	  
  }
  prevScrollpos = currentScrollPos;
} 


$(function(){
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("erpSystem-sidebar-active");
    });

    $(window).resize(function(e) {
      if($(window).width()>=768){
        $("#wrapper").removeClass("erpSystem-sidebar-active");
      }else{
        $("#wrapper").addClass("erpSystem-sidebar-active");
      }
    });
  });



$('.erpSystem-sidebar-menu-item').click(function(evt){
	  $(this).toggleClass("erpSystem--active");
	});
        
        $(function(){
            $("#imageButton").click(function(e) {
                e.preventDefault();
                $("#imageWrapper").toggleClass("erpSystem--active erpSystem--pin");
            });

            $(window).resize(function(e) {
              if($(window).width()>=768){
                $("#imageWrapper").removeClass("erpSystem--active erpSystem--pin");
              }else{
                $("#imageWrapper").addClass("erpSystem--active erpSystem--pin");
              }
            });
          });
           
        
        
        