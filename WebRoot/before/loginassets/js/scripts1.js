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


    	         if ($("#uId").val() == "") {
 
    	           return false;
    	         }         
    	         if ($("#uName").val() == "") {
    	
    	          return false;
    	        }

    	         if ($("#uPass").val() == "") {
    	         	
       	          return false;
       	        }
    	    	  return true;
    	      },
    	      doLogin:function() {
    	    	  
    	        var form = new FormData(document.getElementById("loginform"));
    	        $.ajax({
    	          url:  "/bookshophhit//user/useruser/insertuser.action",
    	          dataType: "json",
    	          type:"post",
    	          processData:false,
    	          contentType:"application/json;charset=UTF-8",
    	          data:convert_FormData_to_json(form),
    	          success:function(data){
    	              //window.clearInterval(timer);
    	        	  if(data.code=="1"){
    	        		  alert("注册成功，1秒后跳转");
    	        		  setTimeout(function(){location.href = "login.html"}, 1000);
    	        		
    	        	  }
    	        	  else {
    	        		  alert(data.msg);
    	        		  //location.href = "login.html";
    	        	  }
    	              console.log("over..");
    	          },
    	          error:function(data){
    	              alert("注册失败");
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
    	    		
    	 
    	    	    	      LOGIN.login();
    	  
    	    	        	
    	    	     
    	    		
    	    	})
    	    	
    	    	
    	  });
    
    
/*---------------------------------------------------------------------------*/    
    
    
    
    
    
    
    
});
