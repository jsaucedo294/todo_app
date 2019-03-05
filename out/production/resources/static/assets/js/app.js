$(function(){
    $('.todo-item label').click(function(){
        $(this).parent('form').submit();
    });
    $('#datepicker').datepicker({
        uiLibrary: 'bootstrap4'
    });
});