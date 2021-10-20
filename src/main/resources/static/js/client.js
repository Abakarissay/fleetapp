/**
 * 
 */

$('document').ready(function() {
	
	$('.table .btn-primary').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(client, status){
			$('#txtAddressEdit').val(client.address);
			$('#txtCityEdit').val(client.city);
			$('#ddlCountryEdit').val(client.countryid);
			$('#txtDetailsEdit').val(client.details);
			$('#txtEmailEdit').val(client.email);
			$('#txtIdEdit').val(client.id);
			$('#txtMobileEdit').val(client.mobile);
			$('#txtNameEdit').val(client.name);	
			$('#txtPhoneEdit').val(client.phone);			
			$('#ddlStateEdit').val(client.stateid);	
			$('#txtWebsiteEdit').val(client.website);
		});			
		$('#editModal').modal();		
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(client, status){
			$('#txtIdDetails').val(client.id);
			$('#txtNameDetails').val(client.name);
			$('#txtAddressDetails').val(client.address);
			$('#txtWebsiteDetails').val(client.website)
			$('#txtDetailsDetails').val(client.details);
			$('#ddlStateDetails').val(client.stateid);
			$('#ddlCountryDetails').val(client.countryid);
			$('#txtCityDetails').val(client.city);
			$('#txtPhoneDetails').val(client.phone);
			$('#txtMobileDetails').val(client.mobile);
			$('#txtEmailDetails').val(client.email);
						
		});			
		$('#detailsModal').modal();		
	});	
	
	$('.table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);
		$('#deleteModal').modal();		
	});	
});