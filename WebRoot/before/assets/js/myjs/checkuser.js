
 var xhr = window.XMLHttpRequest ? new XMLHttpRequest() : new ActiveXObject('Microsoft.XMLHTTP');
 xhr.open("POST","/bookshophhit/user/userlogin/check.action",true);
 xhr.onreadystatechange = function(){
  if(xhr.readyState == 4)
  {
   if(xhr.status == 200)
   {
	   //alert("1111111111");
	   if(xhr.responseText==""){
			  location.href = "login.html";
	   }
 //  successFunc(xhr.responseText);
   // alert(xhr.responseText);
    var obj = eval('(' + xhr.responseText + ')');
    
    //alert(obj.data.uName);
    var objtext = document.getElementById("username");
    objtext.innerHTML = obj.data.uName;
    //alert(text(objtext));
    
   }
   else
   {
	   location.href = "login.html";
   }
  }
 };
 xhr.send();


