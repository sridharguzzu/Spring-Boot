$('document').ready(function() {
	$('.table .btne').on('click', function(event) {
		event.preventDefault();

		var href = $(this).attr('href');
		$.get(href, function(customers) {
			$('#cid').val(customers.custid);
			$('#cname').val(customers.custname);
			$('#loc').val(customers.location);
		});

		$('#editModal').modal();


	});

});