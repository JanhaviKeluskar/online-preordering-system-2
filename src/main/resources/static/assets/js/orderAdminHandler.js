function setStatus(idOrder, idStatus, event)
{
    var selector = $(event.target);

    if(idStatus == 0)
    {
        selector.addClass('text-info border-info')
        selector.removeClass('text-success border-success')
        selector.removeClass('text-danger border-danger')
    }
    else if(idStatus == 1)
    {
        selector.removeClass('text-info border-info')
        selector.addClass('text-success border-success')
        selector.removeClass('text-danger border-danger')
    }
    else
    {
        selector.removeClass('text-info border-info')
        selector.removeClass('text-success border-success')
        selector.addClass('text-danger border-danger')
    }

    var endpoint = '/orders/status/' + idOrder + '/ ' + idStatus + ' /';

    axios.get(endpoint)
    .then((response) =>
     {
         var result = response.data;

         if(result == 1)
         {
             swal('Success', 'Data Saved Successfully', 'success');
         }
         else
         {
             swal('Oops!', 'Some Error occured while saving data. Please try again later.', 'error');
         }
     })
     .catch((error) =>
     {
         console.log(error);
         swal('Oops!', 'Some Error occured while saving data. Please try again later.', 'error');
     });
}