
 var xhr = window.XMLHttpRequest ? new XMLHttpRequest() : new ActiveXObject('Microsoft.XMLHTTP');
 xhr.open("POST","/bookshophhit/admin/login/check.action",true);
 xhr.onreadystatechange = function(){
  if(xhr.readyState == 4)
  {
   if(xhr.status == 200)
   {
	   
	   if(xhr.responseText=="")
	   {
		   location.href = "index.html";
		}
	   //alert(xhr.responseText);
    
   }
   else
   {
	  
    location.href = "index.html";
   }
  }
  else{
	  
	  //location.href = "index.html";
  }
 };
 xhr.send();

