<div class="col-md-12">
	<div class="panel panel-default">
		<div class="panel-heading">
			Liste destinataire
			<a style="float:right;cursor:pointer" ng-click="create()"><span class="glyphicon glyphicon-plus"></span></a>
		</div>
		<div class="panel-body">
			
			<table class="table table-striped table-condensed ">
				<thead>
					<tr>
						<th>#</th>
						<th>Prénom</th>
						<th>Nom</th>
						<th>Email</th>
						<th style="text-align: center;">Actions</th>
					</tr>
				</thead>
				<tbody>
					<tr ng-repeat="destinataire in destinataires">
						<td>{{ destinataire.id }}</td>
						<td>{{ destinataire.prenom }}</td>
						<td>{{ destinataire.nom }}</td>
				        <td>{{ destinataire.mail }}</td>
				        <td style="text-align: center;">
				        	<a ng-click="update()"><span class="glyphicon glyphicon-pencil"></span></a>
				        	<a style="margin-left:10px;" ng-click="remove()"><span class="glyphicon glyphicon-remove"></span></a>
				        </td>
					</tr>
				</tbody>
			</table>
			
		</div>
	</div>
</div>
