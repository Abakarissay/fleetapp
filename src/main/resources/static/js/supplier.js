$('document').ready(function() {
	
	$('.table .btn-primary').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(supplier, status){
			$('#txtAddressEdit').val(supplier.address);
			$('#txtCityEdit').val(supplier.city);
			$('#ddlCountryEdit').val(supplier.countryid);
			$('#txtDetailsEdit').val(supplier.details);
			$('#txtEmailEdit').val(supplier.email);
			$('#txtIdEdit').val(supplier.id);
			$('#txtMobileEdit').val(supplier.mobile);
			$('#txtNameEdit').val(supplier.name);	
			$('#txtPhoneEdit').val(supplier.phone);			
			$('#ddlStateEdit').val(supplier.stateid);	
			$('#txtWebsiteEdit').val(supplier.website);
		});			
		$('#editModal').modal();		
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(supplier, status){
			$('#txtIdDetails').val(supplier.id);
			$('#txtNameDetails').val(supplier.name);
			$('#txtAddressDetails').val(supplier.address);
			$('#txtWebsiteDetails').val(supplier.website)
			$('#txtDetailsDetails').val(supplier.details);
			$('#ddlStateDetails').val(supplier.stateid);
			$('#ddlCountryDetails').val(supplier.countryid);
			$('#txtCityDetails').val(supplier.city);
			$('#txtPhoneDetails').val(supplier.phone);
			$('#txtMobileDetails').val(supplier.mobile);
			$('#txtEmailDetails').val(supplier.email);
						
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