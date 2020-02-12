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
    	              //alert("用户名不能为空！");
    	           //$("#loginname").focus();
    	           return false;
    	         }         
    	         if ($("#loginpass").val() == "") {
    	            // alert("密码不能为空！");
    	          //$("#loginpass").focus();
    	          return false;
    	        }

    	    	  return true;
    	      },
    	      doLogin:function() {
    	        
    	        var form = new FormData(document.getElementById("loginform"));
    	        $.ajax({
    	          url:  "/bookshophhit/admin/login/checklogin.action",
    	          dataType: "json",
    	          type:"post",
    	          processData:false,
    	          contentType:"application/json;charset=UTF-8",
    	          data:convert_FormData_to_json(form),
    	          success:function(data){
    	              //window.clearInterval(timer);
    	        	  if(data.code=="1"){
    	        		  
    	        		  location.href = "usertable.html";
    	        	  }
    	        	  else {
    	        		  alert(data.msg);
    	        	  }
    	              console.log("over..");
    	          },
    	          error:function(data){
    	              alert("发送失败，"+data+"data");
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
    	    });
    	  });
    
    
/*---------------------------------------------------------------------------*/    
    
    
    
    
    
    
    
});
