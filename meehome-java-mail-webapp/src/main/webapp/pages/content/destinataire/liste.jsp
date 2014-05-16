<div class="col-md-12">
	<div class="panel panel-default">
		<div class="panel-heading">
			<b>Liste destinataires</b>
		</div>
		<div class="panel-body">
			
			<table class="table table-striped table-condensed ">
				<thead>
					<tr>
						<th>
							<a class="pointer" ng-click="create()"><span class="glyphicon glyphicon-plus"></span></a> 
							<a class="pointer" ng-click="import()"><span class="glyphicon glyphicon-paperclip"></span></a>
						</th>
						<th>Prénom</th>
						<th>Nom</th>
						<th>Email</th>
						<th style="text-align: center;">Actions</span></th>
					</tr>
				</thead>
				<tbody>
					<tr ng-repeat="destinataire in destinataires">
						<td>{{ destinataire.id }}</td>
						<td>{{ destinataire.prenom }}</td>
						<td>{{ destinataire.nom }}</td>
				        <td>{{ destinataire.mail }}</td>
				        <td style="text-align: center;">
				        	<a ng-click="update(destinataire.id)" style="cursor:pointer"><span class="glyphicon glyphicon-pencil"></span></a>
				        	<a style="margin-left:10px;cursor:pointer" ng-click="remove(destinataire.id)"><span class="glyphicon glyphicon-remove"></span></a>
				        </td>
					</tr>
				</tbody>
			</table>
			
		</div>
	</div>
</div>
