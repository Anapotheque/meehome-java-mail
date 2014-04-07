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
	content('accueil');
	$(window).load(function () {
	
	tinymce.init({
	    selector: "textarea",
	    plugins: [
	        "advlist autolink lists link image charmap print preview anchor",
	        "searchreplace visualblocks code fullscreen",
	        "insertdatetime media table contextmenu paste moxiemanager"
	    ],
	    toolbar: "insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image"
	});
	});
});