
$.ajax({
  		  url:"/bookshophhit/user/useruser/finduser.action",
  		  dataType: "json",
  		  type:"post",
  		  processData:false,
  		  contentType:"application/json;charset=UTF-8",
  		  
  		  success:function(data){
  		     
  			  if(data.code=="1"){
  				  //alert("111");
  				  //demo.showNotification('bottom','center',2,data.data.tsId);
                 $("#updateid").val(data.data.uId);
                 $("#updatename").val(data.data.uName);
                 $("#updatetel").val(data.data.uTel);
                 $("#updatesex").val(data.data.uSex);
                 $("#updatepass").val(data.data.uPass);
               //  alert(data.data.uPass);
                 $("#updatepass").val(data.data.uPass);
                // alert(data.data.uPicurl);
                 if(data.data.uPicurl!=null){
                // alert(data.data.uPicurl);
                 $("#touimg").attr("src",data.data.uPicurl);
                 }
  			  }
  			  else {
  				  demo.showNotification('bottom','center',3,data.msg);
  			  }
  		      console.log("over..");
  		  },
  		  error:function(data){
  			  demo.showNotification('bottom','center',4,"未知错误");
  		  }
  		
  });



jQuery(document).ready(function() {
	

/*	function submitForm(){
    alert("开始上传");
	//文件上传提交表单需要如下代码
	//FormData html5新添加的属性 ,可以支持文件上传
	//FormData 在ie8中不支持,  jquery.form.js
	//new FormData(dom)
	//jquery-->dom  $form.get(0);  $form[0]
	//dom-->jquery  $(dom)
	var form = new FormData(picform);
	var formjson = getStringjsonformdata("picform");
	$.ajax({
	url:"/bookshophhit/user/img/upimg.action",
	type:'post',
	data:formjson,
	async: true,
	cache: false,
	contentType: false,
	processData: false,
	success:function(data){
    alert(data.msg);
	}
	});
	}*/

	
	$("body").on('click','#picsub',function(){
		 //alert("开始上传");
			//文件上传提交表单需要如下代码
			//FormData html5新添加的属性 ,可以支持文件上传
			//FormData 在ie8中不支持,  jquery.form.js
			//new FormData(dom)
			//jquery-->dom  $form.get(0);  $form[0]
			//dom-->jquery  $(dom)
		var form = new FormData(picform);
		//var formjson = getStringjsonformdata("picform");
		$.ajax({
			url:"/bookshophhit/user/img/upimg.action",
			type:'post',
			data:form,
			async: true,
			cache: false,
			contentType: false,
			processData: false,
			success:function(data){
				
					demo.showNotification('bottom','center',2,data.msg);
				
				
			},
		    error:function(data){
			  demo.showNotification('bottom','center',4,"未知错误");
		  }
		});
     });
	
	
	$("body").on('click','#pic',function(){

		 // alert("1111");
		   $("#pic").change(function(){
			  // alert("111331");
		     var objUrl = getObjectURL(this.files[0]) ; //获取图片的路径，该路径不是图片在本地的路径
		     var size = this.files[0].size/1024;
             //alert(size);
		     //alert(objUrl);
		     if(size<=2048){
		       if (objUrl) {
		         $("#uploadimg").attr("src", objUrl) ; //将图片路径存入src中，显示出图片
		       }
		     }
		     else{
		       alert("不得上传超过2mb的图片");
		     }


		   });

     });
   
	   //建立一個可存取到該file的url
	   function getObjectURL(file) {
	     var url = null ;
	     if (window.createObjectURL!=undefined) { // basic
	     url = window.createObjectURL(file) ;
	     } else if (window.URL!=undefined) { // mozilla(firefox)
	     url = window.URL.createObjectURL(file) ;
	     } else if (window.webkitURL!=undefined) { // webkit or chrome
	     url = window.webkitURL.createObjectURL(file) ;
	     }
	     return url ;
	   }
	


$("body").on('click','#updateuserinfo',function(){
		var form = new FormData(document.getElementById("userupdateform"));
    var formdata = convert_FormData_to_json(form);
		var url = "/bookshophhit/user/useruser/updateuser.action";
		$.ajax({
		  url:  url,
		  dataType: "json",
		  type:"post",
		  processData:false,
		  contentType:"application/json;charset=UTF-8",
		  data:formdata,
		  success:function(data){
		     
			  if(data.code=="1"){
				  demo.showNotification('bottom','center',2,"更改成功！");
				  
				  
			  }
			  else {
				  demo.showNotification('bottom','center',3,data.msg);
			  }
		      console.log("over..");
		  },
		  error:function(data){
			  demo.showNotification('bottom','center',4,"未知错误");
		  }
		
		});
     });



});