jQuery(document).ready(function() {
    /*
        Fullscreen background
    */
    $.backstretch([
                    "loginassets/img/backgrounds/2.jpg"
	              , "loginassets/img/backgrounds/3.jpg"
	              , "loginassets/img/backgrounds/1.jpg"
	             ], {duration: 3000, fade: 750});
    
    /*
        Form validation
    */
    $('.login-form input[type="text"], .login-form input[type="password"], .login-form textarea').on('focus', function() {
    	$(this).removeClass('input-error');
    });
    
   $('#formloginbutton').on('click', function(e) {
	   $(".login-form").find('input[type="text"], input[type="password"], textarea').each(function(){
     		if( $(this).val() == "" ) {
     			e.preventDefault();
     			$(this).addClass('input-error');
     			return false;
     		}
     		else {
     			$(this).removeClass('input-error');
     			
     		}
     	});
    	
    });
   
   
 /*   login --------------------------------------------------------------------*/
    var LOGIN = {
    	      checkInput:function() {


    	         if ($("#loginname").val() == "") {
 
    	           return false;
    	         }         
    	         if ($("#loginpass").val() == "") {
    	
    	          return false;
    	        }

    	    	  return true;
    	      },
    	      doLogin:function() {
    	    	  
    	        var form = new FormData(document.getElementById("loginform"));
    	        $.ajax({
    	          url:  "/bookshophhit/user/userlogin/checkuserlogin.action",
    	          dataType: "json",
    	          type:"post",
    	          processData:false,
    	          contentType:"application/json;charset=UTF-8",
    	          data:convert_FormData_to_json(form),
    	          success:function(data){
    	              //window.clearInterval(timer);
    	        	  if(data.code=="1"){
    	        		  
    	        		  location.href = "personhome.html";
    	        	  }
    	        	  else {
    	        		  alert(data.msg);
    	        		  location.href = "login.html";
    	        	  }
    	              console.log("over..");
    	          },
    	          error:function(data){
    	              alert("登陆失败");
    	              // location.href = "/weshare/file/itempage";
    	          }

    	        });
    	    	 

    	           },
    	      login:function() {
    	        if (this.checkInput()) {
    	        	
    	          this.doLogin();
    	        	
    	        }
    	      }
    	  };
    	  $(function(){
    		  
    		  
    	    	$("#formloginbutton").click(function(){
    	    		
    	    		if (LOGIN.checkInput()) {
    	  	        	
    	    			 $(this).remove();
    	    	    		jigsaw.init(document.getElementById('captcha'), function () {
    	    	    	      LOGIN.login();
    	    	         });
    	    	        	
    	    	     }
    	    		
    	    	})
    	    	
    	    	
    	  });
    
    
/*---------------------------------------------------------------------------*/    
    
    
    
    
    
    
    
});
