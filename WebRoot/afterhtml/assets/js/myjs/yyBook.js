var cupa1; 
var zt = new Array();
zt[0] = "";
zt[1] = "预约";
zt[2] = "借出";
zt[3] = "归还";
zt[4] = "损毁";
zt[5] = "预约超期";


function pagereload1(id){
	

	   $.ajax({
	           url:'/bookshophhit/admin/borrow/bbztlist.action?jyztId=1&pageNo=1&pageSize=7',
	           type:'POST',
	           dataType:'JSON',
	           success:function (data) {
	        	   $('#dataTables-example1 tbody').empty();
	        	   for(var i=0;i<data.data.list.length;i++){
	          			  //$("#dataTables-example tbody")
	        		   cupa1 = 1;
	        		   var jyzt;
	        		   for(var j=0;j<6;j++){
	        			   if(data.data.list[i].jyztId == j.toString()){
	        				   jyzt = zt[j]
	        			   }
	        		   }
	        		
	        		   if(data.data.list[i].jyztId == 1){
	        			   $("#dataTables-example1 tbody").append(
	   	          				'<tr><td>'+data.data.list[i].tsjyId+'</td><td>'+data.data.list[i].tsId+'</td><td>'+data.data.list[i].uId+'</td><td>'+data.data.list[i].tsjyFtime+'</td><td>'+data.data.list[i].tsjyNum+'</td><td>'+jyzt
	   	          				+'</td><td><button class="btn btn-success btn-sm jy" data-toggle="modal" data-id="'+data.data.list[i].tsjyId+'" data-target="#myjyModal">借阅</button>&ensp;<button type="button" class="btn btn-info btn-sm ls" data-toggle="modal" data-target="#mylsModal" data-id="'+data.data.list[i].tsjyId+'">零售</button>&ensp;<button type="button" class="btn btn-danger btn-sm jj" data-toggle="modal" data-target="#myjjModal"  data-uid='+data.data.list[i].uId+' data-id="'+data.data.list[i].tsjyId+'">拒绝</button></td></tr>'
	   	          		   );
	        		   }
	        		   
	          		  }
	     	 
		       //var pageNum = data.data.pageNum;
		        //$('#last_page').text(data.data.lastPage);
	     	   //---------------------------------------------------------------------------
	     	   
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
	 		            cupa1 = page;
	 		        	$.ajax({
	 		                url:'/bookshophhit/admin/borrow/bbztlist.action?jyztId=1&pageNo='+page+'&pageSize=7',
	 		                type:'POST',
	 		                data:{'page':page,'count':12},
	 		                dataType:'JSON',
	 		                success:function (data) {
	 		                        $('#dataTables-example1 tbody').empty();
	 		                  
	 		   	        	   for(var i=0;i<data.data.list.length;i++){
	 		   	          			  //$("#dataTables-example tbody")
	 		   	        		   var jyzt;
	 		   	        		   for(var j=0;j<6;j++){
	 		   	        			   if(data.data.list[i].jyztId == j.toString()){
	 		   	        				   jyzt = zt[j]
	 		   	        			   }
	 		   	        		   }
	 		   	      
	 		   	        		 if(data.data.list[i].jyztId == 1){
	 			        			   $("#dataTables-example1 tbody").append(
	 			   	          				'<tr><td>'+data.data.list[i].tsjyId+'</td><td>'+data.data.list[i].tsId+'</td><td>'+data.data.list[i].uId+'</td><td>'+data.data.list[i].tsjyFtime+'</td><td>'+data.data.list[i].tsjyNum+'</td><td>'+jyzt+'</td><td><button class="btn btn-success btn-sm jy" data-toggle="modal" data-id="'+data.data.list[i].tsjyId+'" data-target="#myjyModal">借阅</button>&ensp;<button type="button" class="btn btn-info btn-sm ls" data-toggle="modal" data-target="#mylsModal" data-id="'+data.data.list[i].tsjyId+'">零售</button>&ensp;<button type="button" class="btn btn-danger btn-sm jj" data-toggle="modal" data-target="#myjjModal" data-id="'+data.data.list[i].tsjyId+'">拒绝</button></td></tr>'
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

function pagetworeload1(id,currentPage){
	
	 var getTimestamp=new Date().getTime();  
       
	  
	   $.ajax({
	           url:'/bookshophhit/admin/borrow/bbztlist.action?jyztId=1&pageNo='+currentPage+'&pageSize=7&time='+getTimestamp,
	           type:'POST',
	           dataType:'JSON',
	           success:function(data) {
	        	   cupa1 = 1;
        	   $("#dataTables-example1 tbody").empty();
        	   for(var i=0;i<data.data.list.length;i++){
          			  
    		   
    		   var jyzt;
    		   for(var j=0;j<6;j++){
    			   if(data.data.list[i].jyztId == j.toString()){
    				   jyzt = zt[j]
    			   }
    		   }  if(data.data.list[i].jyztId == 1){
    			   $("#dataTables-example1 tbody").append(
  	          				'<tr><td>'+data.data.list[i].tsjyId+'</td><td>'+data.data.list[i].tsId+'</td><td>'+data.data.list[i].uId+'</td><td>'+data.data.list[i].tsjyFtime+'</td><td>'+data.data.list[i].tsjyNum+'</td><td>'+jyzt+'</td><td><button class="btn btn-success btn-sm jy" data-toggle="modal" data-id="'+data.data.list[i].tsjyId+'" data-target="#myjyModal">借阅</button>&ensp;<button type="button" class="btn btn-info btn-sm ls" data-toggle="modal" data-target="#mylsModal" data-id="'+data.data.list[i].tsjyId+'">零售</button>&ensp;<button type="button" class="btn btn-danger btn-sm jj" data-toggle="modal" data-target="#myjjModal" data-id="'+data.data.list[i].tsjyId+'">拒绝</button></td></tr>'
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
	 		            cupa1 = page;
	 		           
	 		        	$.ajax({
	 		                url:'/bookshophhit/admin/borrow/bbztlist.action?jyztId=1&pageNo='+page+'&pageSize=7',
	 		                type:'POST',
	 		                data:{'page':page,'count':12},
	 		                dataType:'JSON',
	 		                success:function (data) {
	 		                	$('#dataTables-example1 tbody').empty();
	 			        	   for(var i=0;i<data.data.list.length;i++){
	 			        		  
	 			          			  //$("#dataTables-example tbody")
	 			        		   var jyzt;
	 			        		   for(var j=0;j<6;j++){
	 			        			   if(data.data.list[i].jyztId == j.toString()){
	 			        				   jyzt = zt[j]
	 			        			   }
	 			        		   }
	 			        		
	 			        		  if(data.data.list[i].jyztId == 1){
	 			        			   $("#dataTables-example1 tbody").append(
	 			   	          				'<tr><td>'+data.data.list[i].tsjyId+'</td><td>'+data.data.list[i].tsId+'</td><td>'+data.data.list[i].uId+'</td><td>'+data.data.list[i].tsjyFtime+'</td><td>'+data.data.list[i].tsjyNum+'</td><td>'+jyzt+'</td><td><button class="btn btn-success btn-sm jy" data-toggle="modal" data-id="'+data.data.list[i].tsjyId+'" data-target="#myjyModal">借阅</button>&ensp;<button type="button" class="btn btn-info btn-sm ls" data-toggle="modal" data-target="#mylsModal" data-id="'+data.data.list[i].tsjyId+'">零售</button>&ensp;<button type="button" class="btn btn-danger btn-sm jj" data-toggle="modal" data-target="#myjjModal" data-id="'+data.data.list[i].tsjyId+'">拒绝</button></td></tr>'
	 			   	          		   );
	 			        		   }
	 			          		  }
	 		                    }
	 		            })
	 		        }
	 		});
	 	
	     	  
	     	   
		      }
	      })
	     
}

function jj(data,formjson){
	$.ajax({
		  url:  "/bookshophhit/admin/borrow/refusejy.action",
		  dataType: "json",
		  type:"post",
		  processData:false,
		  contentType:"application/json;charset=UTF-8",
		  data:data,
		  success:function(data){
		     
			  if(data.code=="1"){
				  var adduser_url = "/bookshophhit/admin/letter/insertletter.action";//添加
			  		postJson(adduser_url,formjson);
				  
				  demo.showNotification('bottom','center',2,data.msg);
				now.parent().parent().fadeTo("slow", 0.01, function(){//fade
					now.parent().parent().slideUp("slow", function() {//slide up
				    	now.parent().parent().remove();//then remove from the DOM
				    	pagetworeload1("#pageLimit1",cupa1);
				    });
				  });
				  
				  
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
}
function postJson(url,datainfo){
    $.ajax({
        type:'post',
        url:url,
        dataType: 'json',
        contentType:"application/json;charset=UTF-8",
        data: datainfo,
        success: function(data){ if (data.code=="1"){  }else{ demo.showNotification('bottom','center',3,data.msg);;  }  },
        error: function(data){  alert("网路异常");  }
    });
}

$(function(){
	  
	pagereload1('#pageLimit1');
	    
 });



jQuery(document).ready(function() {
	
//----------------------------------------------------------------
	$("body").on('click','.jj',function(){
  		var now = $(this);
  		var tsjyId = now.data("id");
  		var uId = now.data("uid");
  		//alert(uId);
  		$("#lWho").val(uId);
  		$("#tsjymsgId").val(tsjyId);
  		var data = JSON.stringify(dataObj);
  			 
  	});
	
	$("body").on('click','#jjmsg',function(){
  		
  		
  		var tsjyId = $("#tsjymsgId").val();
  		var dataObj = { "tsjyId" : tsjyId };
  		var data = JSON.stringify(dataObj);
  		var formjson = getStringjsonformdata("jjform");
  		//alert(data+"-----"+formjson);
  		
  	    jj(data,formjson);
  		 
  	});
    	  
//jbook.html 同意借阅，支付押金-----------------------  ---------------------- 
  	  
  	$("body").on('click','.jy',function(){
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
				  var yytime = data.data.tsjyFtime;//预约时间
				  var mydate = new Date();
				  var getTimes= mydate.toLocaleDateString();//实际借书时间
				  $.ajax({
					  url:  "/bookshophhit/admin/borrow/jytojc.action",
					  dataType: "json",
					  type:"post",
					  processData:false,
					  contentType:"application/json;charset=UTF-8",
					  data:JSON.stringify({
						  "tsjyId":data.data.tsjyId,
						  "tsId":data.data.tsId,
						  "uId":data.data.uId,
						  "tsjyFtime":getTimes,
						  "tsjyNum":data.data.tsjyNum,
						  "jyztId":data.data.jyztId
					  }),
					  success:function(data){
					  
						  if(data.code=="1"){
							  demo.showNotification('bottom','center',2,"借阅成功");
							  pagetworeload1('#pageLimit1',cupa1);
							  pagetworeload('#pageLimit',cupa);
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
  	//直接零售，获取当前借阅单号信息，插入零售表
  	$("body").on('click','.ls',function(){
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
				  var yytime = data.data.tsjyFtime;//预约时间
				  var mydate = new Date();
				  var getTimes= mydate.toLocaleDateString();//实际借书时间
				  $("#saletsId").val(data.data.tsId);
	              $("#saleuId").val(data.data.uId);
	              $("#saletslsTime").val(data.data.tsjyFtime);
	              $("#saletslsNum").val(data.data.tsjyNum);
	              $("#saletsjyId").val(data.data.tsjyId);
	             
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
  	
  	
  	//var tsjyId;
  	
  	 var LOGIN = {
	  	      checkInput:function() {
	  	    	

	  	       /*  if ($("#uId").val() == "") {
	  	        	demo.showNotification('bottom','center',4,"编号不能为空");
	  	           $("#uId").focus();
	  	           return false;
	  	         }         
	  	         if ($("#uName").val() == "") {
	  	        	demo.showNotification('bottom','center',4,"账户名不能为空");
	  	          $("#uName").focus();
	  	          return false;
	  	        }
	  	       if ($("#uPass").val() == "") {
	  	    	 demo.showNotification('bottom','center',4,"密码不能为空");
	  	          $("#uPass").focus();
	  	          return false;
	  	        }*/
	  	    	  		
	  	    	  return true;
	  	      },
	  	      doLogin:function() {
	  	        
	  	    	  var form = new FormData(document.getElementById("tslsinform"));
	  	          var formdata = convert_FormData_to_json(form);
	  	          
		  	      $.ajax({
		  	  	  url:  "/bookshophhit/admin/sale/insertls.action",
		  	  	  dataType: "json",
		  	  	  type:"post",
		  	  	  processData:false,
		  	  	  contentType:"application/json;charset=UTF-8",
		  	  	  data:formdata,
		  	  	  success:function(data){
		  	  	     
		  	  		  if(data.code=="1"){
		  	  			//demo.showNotification('bottom','center',2,data.msg);
		  	  			
		  	  	  		
		  	  	  		var dataObj = { "tsjyId" : form.get("tsjyId") };
		  	  	  		//alert(dataObj);
		  	  	  		var data = JSON.stringify(dataObj);
		  	  	  		var url = "/bookshophhit/borrow/refusejy.action";
		  	  	  		$.ajax({
		  	  	  		  url:  url,
		  	  	  		  dataType: "json",
		  	  	  		  type:"post",
		  	  	  		  processData:false,
		  	  	  		  contentType:"application/json;charset=UTF-8",
		  	  	  		  data:data,
		  	  	  		  success:function(data){
		  	  	  		     
		  	  	  			  if(data.code=="1"){
		  	  	  				  demo.showNotification('bottom','center',2,data.msg);
		  	  	  				  pagetworeload1("#pageLimit1",cupa1);
		  	  	  				
		  	  	  				  
		  	  	  				  
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
	  		
	  	    $("#tslsin").click(function(){
	  	    	/*var now = $(this);
		  	  	tsjyId = now.data("id");
		  	  	alert(tsjyId);*/
	  	      LOGIN.login();
	  	    });
	  	    
	  	  });
  	
});


