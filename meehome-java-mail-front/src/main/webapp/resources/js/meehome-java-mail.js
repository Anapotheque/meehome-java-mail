function load(page,section){
	$.ajax({
		url: page,
		context: document.body,
		contentType: "application/x-www-form-urlencoded;charset=ISO-8859-15",
		success: function(response){
			$(section).html(response);
  		}
	});
}

function content(content){
	load("/meehome-java-mail-webapp/pages/content/"+content+".html","#content");
}

$(document).ready(function(){
	
	$(window).load(function () {
		$('#loading').fadeOut(function(){
			$('#container').fadeIn();	
		});
	});
	
	load("/meehome-java-mail-webapp/pages/template/structure/content.html","#container");
	load("/meehome-java-mail-webapp/pages/template/structure/header.html","#header");
	load("/meehome-java-mail-webapp/pages/template/structure/footer.html","#footer");
});