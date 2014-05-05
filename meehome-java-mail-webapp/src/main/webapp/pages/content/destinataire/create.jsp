<div class="col-md-12">
	<div class="panel panel-default">
		<div class="panel-heading">Nouveau destinataire</div>
		<div class="panel-body">
  
			<form novalidate="novalidate" class="form-horizontal" role="form">
			
				<div class="form-group">
		      		<label class="col-md-2 control-label" for="inputNom">Nom</label>
					<div class="col-sm-5">
						<input type="text" class="form-control" id="inputNom" ng-model="destinataire.nom" placeholder="Nom"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-2 control-label" for="inputPrenom">Prénom</label>
					<div class="col-sm-5">
						<input type="text" class="form-control" id="inputPrenom" ng-model="destinataire.prenom" placeholder="Prénom"/>
					</div>
		    	</div>
		    	
		    	<div class="form-group">
					<label class="col-md-2 control-label" for="inputEmail">Email</label>
					<div class="col-sm-5">
						<input type="text" class="form-control" id="inputEmail" ng-model="destinataire.mail" placeholder="e-mail"/>
					</div>
		    	</div>
		    	
				<div class="form-group">
					<div class="col-md-offset-2 col-md-5">
						<a ng-click="cancel()" class="btn btn-small btn-default">Annuler</a>
						<a ng-click="create()" class="btn btn-small btn-primary">Creation</a>
					</div>
				</div>
				
			</form>
		</div>
	</div>
</div>