$(function() {
  $('#login-show').click(function(){
    $('#login-modal').fadeIn();
  });
  
  $('.signup-show').click(function(){
    $('#signup-modal').fadeIn();
  });
  
  // Add the click() method for .close-modal
  $('.close-modal').click(function(){
    $('#signup-modal').fadeOut();
    $('#login-modal').fadeOut();
  });
  
  
});
