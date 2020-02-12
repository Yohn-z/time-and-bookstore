var cupa; 
var zt = new Array();
zt[0] = "";
zt[1] = "预约";
zt[2] = "借出";
zt[3] = "归还";
zt[4] = "损毁";
zt[5] = "预约超期";
function pagereload(id){
	

	   $.ajax({
	           url:'/bookshophhit/admin/borrow/bbztlist.action?jyztId=2&pageNo=1&pageSize=7',
	           type:'POST',
	           dataType:'JSON',
	           success:function (data) {
	        	   $('#dataTables-example tbody').empty();
	        	   for(var i=0;i<data.data.list.length;i++){
	          			  //$("#dataTables-example tbody")
	        		   cupa = 1;
	        		   var jyzt;
	        		   for(var j=0;j<5;j++){
	        			   if(data.data.list[i].jyztId == j.toString()){
	        				   jyzt = zt[j]
	        			   }
	        		   }
	        		   if(data.data.list[i].jyztId == 2){
	          			   $("#dataTables-example tbody").append(
	          				'<tr><td>'+data.data.list[i].tsjyId+'</td><td>'+data.data.list[i].tsId+'</td><td>'+data.data.list[i].uId+'</td><td>'+data.data.list[i].tsjyFtime+'</td><td>'+data.data.list[i].tsjyNum+'</td><td>'+jyzt+'</td><td><button class="btn btn-info btn-sm gh" data-toggle="modal" data-id="'+data.data.list[i].tsjyId+'" data-target="#mygModal">归还</button>&ensp;<button type="button" class="btn btn-default btn-sm tsjyupdate" data-toggle="modal" data-target="#myupdateModal" data-id="'+data.data.list[i].tsjyId+'">修改</button></td></tr>'
	          			  ); 
	        		   }
	        		 
	        		   
	           }
	     	   
	     	 $(id).bootstrapPaginator({
	 		    currentPage: 1,
	 		    totalPages: data.data.pages,
	 		    size:"normal",
	 		    bootstrapMajorVersion: 3,
	 		    alignment:"right",
	 		    numberOfPages:8,
	 		    itemTexts: function (type, page, current) {
	 		        switch (type) {
	 		        case "first": return "首页";
	 		        case "prev": return "上一页";
	 		        case "next": return "下一页";
	 		        case "last": return "末页";
	 		        case "page": return page;
	 		        }//默认显示的是第一页。
	 		    },
	 		        onPageClicked: function (event, originalEvent, type, page){//给每个页眉绑定一个事件，其实就是ajax请求，其中page变量为当前点击的页上的数字。
	 		            cupa = page;
	 		        	$.ajax({
	 		                url:'/bookshophhit/admin/borrow/bbztlist.action?jyztId=2&pageNo='+page+'&pageSize=7',
	 		                type:'POST',
	 		                data:{'page':page,'count':12},
	 		                dataType:'JSON',
	 		                success:function (data) {
	 		                        $('#dataTables-example tbody').empty();
	 		                  
	 		   	        	   for(var i=0;i<data.data.list.length;i++){
	 		   	          			  //$("#dataTables-example tbody")
	 		   	        		   var jyzt;
	 		   	        		   for(var j=0;j<6;j++){
	 		   	        			   if(data.data.list[i].jyztId == j.toString()){
	 		   	        				   jyzt = zt[j]
	 		   	        			   }
	 		   	        		   }
	 		   	        		if(data.data.list[i].jyztId == 2){
	 		          			   $("#dataTables-example tbody").append(
	 		          				'<tr><td>'+data.data.list[i].tsjyId+'</td><td>'+data.data.list[i].tsId+'</td><td>'+data.data.list[i].uId+'</td><td>'+data.data.list[i].tsjyFtime+'</td><td>'+data.data.list[i].tsjyNum+'</td><td>'+jyzt+'</td><td><button class="btn btn-info btn-sm gh" data-toggle="modal" data-id="'+data.data.list[i].tsjyId+'" data-target="#mygModal">归还</button>&ensp;<button type="button" class="btn btn-default btn-sm tsjyupdate" data-toggle="modal" data-target="#myupdateModal" data-id="'+data.data.list[i].tsjyId+'">修改</button></td></tr>'
	 		          			  ); 
	 		        		   }
	 		   	       
	 		   	        		
	 		   	        		
	 		   	        		
	 		   	          		  }
	 		                    }
	 		            })
	 		        }
	 		});
	 	
	     	   //-----------------------------------------------------------------------
	     	   
		      }
	      })
}

function pagetworeload(id,currentPage){
	
	 var getTimestamp=new Date().getTime();  
       
	  
	   $.ajax({
	           url:'/bookshophhit/admin/borrow/bbztlist.action?jyztId=2&pageNo='+currentPage+'&pageSize=7&time='+getTimestamp,
	           type:'POST',
	           dataType:'JSON',
	           success:function(data) {
        	   
        	   $("#dataTables-example tbody").empty();
        	   for(var i=0;i<data.data.list.length;i++){
          			  
    		   cupa = 1;
    		   var jyzt;
    		   for(var j=0;j<6;j++){
    			   if(data.data.list[i].jyztId == j.toString()){
    				   jyzt = zt[j]
    			   }
    		   }
    		   if(data.data.list[i].jyztId == 2){
      			   $("#dataTables-example tbody").append(
      				'<tr><td>'+data.data.list[i].tsjyId+'</td><td>'+data.data.list[i].tsId+'</td><td>'+data.data.list[i].uId+'</td><td>'+data.data.list[i].tsjyFtime+'</td><td>'+data.data.list[i].tsjyNum+'</td><td>'+jyzt+'</td><td><button class="btn btn-info btn-sm gh" data-toggle="modal" data-id="'+data.data.list[i].tsjyId+'" data-target="#mygModal">归还</button>&ensp;<button type="button" class="btn btn-default btn-sm tsjyupdate" data-toggle="modal" data-target="#myupdateModal" data-id="'+data.data.list[i].tsjyId+'">修改</button></td></tr>'
      			  ); 
    		   }
    		  
      		  }
	        	   
	     	 $(id).bootstrapPaginator({
	 		    currentPage: currentPage,
	 		    totalPages: data.data.pages,
	 		    size:"normal",
	 		    bootstrapMajorVersion: 3,
	 		    alignment:"right",
	 		    numberOfPages:8,
	 		    itemTexts: function (type, page, current) {
	 		        switch (type) {
	 		        case "first": return "首页";
	 		        case "prev": return "上一页";
	 		        case "next": return "下一页";
	 		        case "last": return "末页";
	 		        case "page": return page;
	 		        }//默认显示的是第一页。
	 		    },
	 		        onPageClicked: function (event, originalEvent, type, page){//给每个页眉绑定一个事件，其实就是ajax请求，其中page变量为当前点击的页上的数字。
	 		            cupa = page;
	 		           
	 		        	$.ajax({
	 		                url:'/bookshophhit/admin/borrow/bbztlist.action?jyztId=2&pageNo='+page+'&pageSize=7',
	 		                type:'POST',
	 		                data:{'page':page,'count':12},
	 		                dataType:'JSON',
	 		                success:function (data) {
	 		                	$('#dataTables-example tbody').empty();
	 			        	   for(var i=0;i<data.data.list.length;i++){
	 			        		  
	 			          			  //$("#dataTables-example tbody")
	 			        		   var jyzt;
	 			        		   for(var j=0;j<6;j++){
	 			        			   if(data.data.list[i].jyztId == j.toString()){
	 			        				   jyzt = zt[j]
	 			        			   }
	 			        		   }
	 			        		  if(data.data.list[i].jyztId == 2){
	 			          			   $("#dataTables-example tbody").append(
	 			          				'<tr><td>'+data.data.list[i].tsjyId+'</td><td>'+data.data.list[i].tsId+'</td><td>'+data.data.list[i].uId+'</td><td>'+data.data.list[i].tsjyFtime+'</td><td>'+data.data.list[i].tsjyNum+'</td><td>'+jyzt+'</td><td><button class="btn btn-info btn-sm gh" data-toggle="modal" data-id="'+data.data.list[i].tsjyId+'" data-target="#mygModal">归还</button>&ensp;<button type="button" class="btn btn-default btn-sm tsjyupdate" data-toggle="modal" data-target="#myupdateModal" data-id="'+data.data.list[i].tsjyId+'">修改</button></td></tr>'
	 			          			  ); 
	 			        		   }
	 			        	
	 			          		  }
	 		                    }
	 		            })
	 		        }
	 		});
	 	
	     	   //-----------------------------------------------------------------------
	     	   
		      }
	      })
	     
}


$(function(){
	  
	 pagereload('#pageLimit');
	 pagereload1('#pageLimit1');
	    
 });





jQuery(document).ready(function() {

	
/* jbiik.html ajax ts submit--------------------------------------------------*/
    var LOGIN = {
  	      checkInput:function() {
  	    	 

  	         /*if ($("#loginname").val() == "") {
  	              //alert("用户名不能为空！");
  	           //$("#loginname").focus();
  	           return false;
  	         }         
  	         if ($("#loginpass").val() == "") {
  	            // alert("密码不能为空！");
  	          //$("#loginpass").focus();
  	          return false;
  	        }*/

  	    	  return true;
  	      },
  	      doLogin:function() {
  	        
  	    	  var form = new FormData(document.getElementById("bbform"));
  	    
  	    	//alert(form.get("skztName"));
  	          var formdata = convert_FormData_to_json(form);
  	     
	  	      $.ajax({
	  	  	  url:  "/bookshophhit/admin/borrow/insertbb.action",
	  	  	  dataType: "json",
	  	  	  type:"post",
	  	  	  processData:false,
	  	  	  contentType:"application/json;charset=UTF-8",
	  	  	  data:formdata,
	  	  	  success:function(data){
	  	  	     
	  	  		  if(data.code=="1"){
	  	  			  demo.showNotification('bottom','center',2,data.msg);
	  	  			//alert(form.get("skztName"));
	  	  		     /*var obj = '<tr><td>'+form.get("tsId")+'</td><td>'+form.get("tsName")+'</td><td>'+form.get("tsAuthor")+'</td><td>'+form.get("tsPublisher")+'</td><td>'+form.get("tsPrice")+'</td><td>'+form.get("tsSum")+'/'+form.get("tsSum")+'</td><td>'+form.get("tslbName")+'</td><td>'+form.get("skztName")+'</td><td><button class="btn btn-default btn-sm tsupdateinfo" data-toggle="modal" data-tsinfo="'+form.get("tsId")+'" data-target="#myupdateModal">修改</button>&ensp;<button type="button" class="btn btn-danger btn-sm tsdelete" data-id="'+form.get("tsId")+'">删除</button></td></tr>';
	  	  		   
	  	  		    	$("#dataTables-example tbody").append(obj); */
	  					
	  	  			pagereload('#pageLimit');
	  				  
	  	  			  
	  	  			  $("#myModal").modal('hide');
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

  	           },
  	      login:function() {
  	        if (this.checkInput()) {
  	          this.doLogin();
  	        }
  	      }
  	  };
  	  $(function(){
  		  
  	    $("#bookbo").click(function(){
  	      LOGIN.login();
  	    });
  	    
  	  });
/*----------------------------------------------------------------*/
    	  
    	  
/*jbook.html 归还-----------------------  ----------------------*/ 
  	  //归还请求信息
  	$("body").on('click','.gh',function(){
		var now = $(this);
		var tsjyId = now.data("id");
	
		var dataObj = { "tsjyId" : tsjyId };
		var data = JSON.stringify(dataObj);
		var url = "/bookshophhit/admin/borrow/updateinfo.action";
		$.ajax({
		  url:  url,
		  dataType: "json",
		  type:"post",
		  processData:false,
		  contentType:"application/json;charset=UTF-8",
		  data:data,
		  success:function(data){
		  
			  if(data.code=="1"){
				  $("#updatetsjyIdh").val(data.data.tsjyId);
				  $("#updatetsIdh").val(data.data.tsId);
				  $("#updateuIdh").val(data.data.uId);
				  $("#updatetsjyFtimeh").val(data.data.tsjyFtime);
				  $("#updatetsjyNumh").val(data.data.tsjyNum);
				  $("#updatejyztIdh").val(data.data.jyztId);
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
  	
  	//书刊归还
  
  	$("body").on('click','#ghin',function(){
  		var form = new FormData(document.getElementById("ghinform"));
        var formdata = convert_FormData_to_json(form);
  		var url = "/bookshophhit/admin/borrow/deletebb.action";
  		$.ajax({
  		  url:  url,
  		  dataType: "json",
  		  type:"post",
  		  processData:false,
  		  contentType:"application/json;charset=UTF-8",
  		  data:formdata,
  		  success:function(data){
  		     
  			  if(data.code=="1"){
  				  demo.showNotification('bottom','center',2,"归还成功！");
  				  pagetworeload('#pageLimit',cupa);
  			
  			  }
  			  else {
  				  demo.showNotification('bottom','center',3,data.msg);
  			  }
  		      console.log("over..");
  		  },
  		  error:function(data){
  			  demo.showNotification('bottom','center',4,"未知錯誤：可能是該書刊總量或者在冊數量不足");
  		  }
  		
  		});
  		 
  	});
  	
/*table.html delete end-----------------------  ----------------------*/  
  	
  	
/*jbook.html update-----------------------------------------------------*/
  	//请求修改数据
  	$("body").on('click','.tsjyupdate',function(){
  		var now = $(this);
  		var tsjyId = now.data("id");
  		var dataObj = { "tsjyId" : tsjyId };
  		var data = JSON.stringify(dataObj);
  		var url = "/bookshophhit/admin/borrow/updateinfo.action";
  		$.ajax({
  		  url:  url,
  		  dataType: "json",
  		  type:"post",
  		  processData:false,
  		  contentType:"application/json;charset=UTF-8",
  		  data:data,
  		  success:function(data){
  		     
  			  if(data.code=="1"){
  				  //demo.showNotification('bottom','center',2,data.data.tsId);
                 $("#updatetsjyId").val(data.data.tsjyId);
                 $("#updatetsId").val(data.data.tsId);
                 $("#updateuId").val(data.data.uId);
                 $("#updatetsjyFtime").val(data.data.tsjyFtime);
                 $("#updatetsjyNum").val(data.data.tsjyNum);
                 $("#updatejyztId").val(data.data.jyztId);
                 //$("#updatejyztId").find("option[value="+data.data.jyztId+"]").attr("selected",true);
               
	  
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
  	
  	//提交修改
  	$("body").on('click','#zkjyin',function(){
  		var form = new FormData(document.getElementById("tsjyinform"));
  		form.append("jyztName", $("#updateskzt option:selected").text());
        var formdata = convert_FormData_to_json(form);
  		var url = "/bookshophhit/admin/borrow/updatebb.action";
  		$.ajax({
  		  url:  url,
  		  dataType: "json",
  		  type:"post",
  		  processData:false,
  		  contentType:"application/json;charset=UTF-8",
  		  data:formdata,
  		  success:function(data){
  		     
  			  if(data.code=="1"){
  				  demo.showNotification('bottom','center',2,"成功！");
  				  pagetworeload('#pageLimit',cupa);
  				pagereload1('#pageLimit1');
  			
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
 
 /*update--end-------- --------------------------------------------------*/
});


