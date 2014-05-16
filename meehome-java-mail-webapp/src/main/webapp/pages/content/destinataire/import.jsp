<div class="col-md-12">
	<div class="panel panel-default">
		<div class="panel-heading"><b>Import des destinataires</b></div>
		<div class="panel-body">
  
			<form novalidate="novalidate" class="form-horizontal" role="form">
			
				<div class="form-group">
		      		<label class="col-md-2 control-label" for="inputNom"></label>
					<div class="col-sm-5">
						<input  id="detinataires" type="file">
						<p class="help-block">fichier des destinataires ра joindre</p>
					</div>
				</div>
		    	
				<div class="form-group">
					<div class="col-md-offset-2 col-md-5">
						<a ng-click="cancel()" class="btn btn-small btn-default">Annuler</a>
						<a ng-click="create()" class="btn btn-small btn-primary">Importer les destinataires</a>
					</div>
				</div>
				
			</form>
		</div>
	</div>
</div>
