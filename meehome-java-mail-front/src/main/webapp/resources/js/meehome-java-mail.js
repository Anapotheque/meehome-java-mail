function extractUrlParams(query){
	var t;
	if(query){
		t =  query.split('&');
	} else {
		t = location.search.substring(1).split('&');
	}
	var f = [];
	for (var i=0; i < t.length; i++){
		var x = t[ i ].split('=');
		f[x[0]]=x[1];
	}
	return f;
}

function load(pageUrl,section){
//	$('.loading').fadeIn();
	$.ajax({
		url: pageUrl,
		context: document.body,
		contentType: "application/x-www-form-urlencoded;charset=ISO-8859-15",
		success: function(response){
			$(section).html(response);
//			$('.loading').fadeOut();
  		}
	});
}

function content(fragment){
	var pageUrl = getUrl(fragment); 
	load(pageUrl,"#content");
	if (pageUrl != window.location) {
        window.history.pushState({path:pageUrl},'',"?fragment="+fragment);
    }
}

function getUrl(fragment){
	return "/meehome-java-mail-webapp/pages/content/"+fragment+".html";
}

$(window).on('popstate', function () {
	load(location.pathname,"#content");
});

$('a').on('click', function (e) {
	var fragment = $(this).attr('href');
	if(fragment == '#' || fragment == undefined) return;
	content($(this).attr('href'));
    e.preventDefault();
});

load(getUrl('accueil'),"#content");

/**
 * Lancé au chargement de la page
 */
$(document).ready(function(){
	$(window).load(function () {
		var parametre = extractUrlParams();
		var value = parametre['fragment'];
		if(value != undefined){
			content(value);
		} else {
			content('accueil');
		}
	});
});