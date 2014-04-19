function content(fragment){
	load(getUrl(fragment),"#content");
}

function getUrl(fragment){
	return "/meehome-java-mail-webapp/pages/content/"+fragment+".html";
}

function load(pageUrl,section){
	$.ajax({
		url: pageUrl,
		context: document.body,
		contentType: "application/x-www-form-urlencoded;charset=ISO-8859-15",
		success: function(response){
			$(section).html(response);
  		}
	});
}

$(document).ready(function(){
	load('/meehome-java-mail-webapp/pages/content/template/header.html',"header");
	load('/meehome-java-mail-webapp/pages/content/template/footer.html',"footer");
});
