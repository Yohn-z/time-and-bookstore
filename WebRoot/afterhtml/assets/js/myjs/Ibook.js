var cupa; //当前页面，全局变量
function pagereload(id){
	var dataObj = {pageNo:'1',pageSize:'5'};
	   var data = JSON.stringify(dataObj);
	   $.ajax({
	           url:'/bookshophhit/admin/sale/lslist.action?pageNo=1&pageSize=7',
	           type:'POST',
	           data:data,
	           dataType:'JSON',
	           success:function (data) {
	        	   $('#dataTables-example tbody').empty();
	     	   for(var i=0;i<data.data.list.length;i++){
	     		  
			      $("#dataTables-example tbody").append(
			    		  '<tr><td>'+data.data.list[i].tslsId+'</td><td>'+data.data.list[i].tsId+'</td><td>'+data.data.list[i].uId+'</td><td>'+data.data.list[i].tslsTime+'</td><td>'+data.data.list[i].tslsNum+'</td><td>'+data.data.list[i].tslsPrice+'</td><td><button type="button" class="btn btn-danger btn-sm tslsdelete" data-id="'+data.data.list[i].tslsId+'">删除</button></td></tr>'
				  ); 
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
	 		            cupa = page;
	 		        	$.ajax({
	 		                url:'/bookshophhit/admin/sale/lslist.action?pageNo='+page+'&pageSize=7',
	 		                type:'POST',
	 		                data:{'page':page,'count':12},
	 		                dataType:'JSON',
	 		                success:function (data) {
	 		                        $('#dataTables-example tbody').empty();
	 		                       for(var i=0;i<data.data.list.length;i++){
	 		        	     		  
	 		        			      $("#dataTables-example tbody").append(
	 		        			    		  '<tr><td>'+data.data.list[i].tslsId+'</td><td>'+data.data.list[i].tsId+'</td><td>'+data.data.list[i].uId+'</td><td>'+data.data.list[i].tslsTime+'</td><td>'+data.data.list[i].tslsNum+'</td><td>'+data.data.list[i].tslsPrice+'</td><td><button type="button" class="btn btn-danger btn-sm tslsdelete" data-id="'+data.data.list[i].tslsId+'">删除</button></td></tr>'
	 		        				  ); 
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
	var dataObj = {pageNo:'1',pageSize:'5'};
	   var data = JSON.stringify(dataObj);
	   $.ajax({
	           url:'/bookshophhit/admin/sale/lslist.action?pageNo='+currentPage+'&pageSize=7',
	           type:'POST',
	           data:data,
	           dataType:'JSON',
	           success:function (data) {
	        	   
	     	  /* for(var i=0;i<data.data.list.length;i++){
	     		  
			      $("#dataTables-example tbody").append(
				    '<tr><td>'+data.data.list[i].uId+'</td><td>'+data.data.list[i].uSex+'</td><td>'+data.data.list[i].uName+'</td><td>'+data.data.list[i].uPass+'</td><td>'+data.data.list[i].uTime+'</td><td>'+data.data.list[i].uTel+'</td><td>'+data.data.list[i].uDebt+'</td><td><button class="btn btn-default btn-sm userupdateinfo" data-toggle="modal" data-userinfo="'+data.data.list[i].uId+'" data-target="#myupdateModal">修改</button>&ensp;<button type="button" class="btn btn-danger btn-sm userdelete" data-id="'+data.data.list[i].uId+'">删除</button></td></tr>'
				  ); 
			    }*/
		       //var pageNum = data.data.pageNum;
		        //$('#last_page').text(data.data.lastPage);
	     	   //---------------------------------------------------------------------------
	     	   
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
	 		                url:'/bookshophhit/admin/sale/lslist.action?pageNo='+page+'&pageSize=7',
	 		                type:'POST',
	 		                data:{'page':page,'count':12},
	 		                dataType:'JSON',
	 		                success:function (data) {
	 		                        $('#dataTables-example tbody').empty();
	 		                       for(var i=0;i<data.data.list.length;i++){
	 		        	     		  
	 		        			      $("#dataTables-example tbody").append(
	 		        			    		  '<tr><td>'+data.data.list[i].tslsId+'</td><td>'+data.data.list[i].tsId+'</td><td>'+data.data.list[i].uId+'</td><td>'+data.data.list[i].tslsTime+'</td><td>'+data.data.list[i].tslsNum+'</td><td>'+data.data.list[i].tslsPrice+'</td><td><button type="button" class="btn btn-danger btn-sm tslsdelete" data-id="'+data.data.list[i].tslsId+'">删除</button></td></tr>'
	 		        				  ); 
	 		        			    }
	 		                    }
	 		            })
	 		        }
	 		});
	 	
	     	   //-----------------------------------------------------------------------
	     	   
		      }
	      })
	     
}



//以上为两个方法-------------------加载分页




jQuery(document).ready(function() {
	pagereload('#pageLimit');
	
//	 usertable.html ajax ts submit--------------------------------------------------
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
		  	  			demo.showNotification('bottom','center',2,data.msg);
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
	  	      LOGIN.login();
	  	    });
	  	    
	  	  });
//	----------------------------------------------------------------
	  	  
	  	$("body").on('click','.tslsdelete',function(){
	  		var now = $(this);
	  		var tslsId = now.data("id");
	  		var dataObj = { "tslsId" : tslsId };
	  		var data = JSON.stringify(dataObj);
	  		var url = "/bookshophhit/admin/sale/deletels.action";
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
	  				now.parent().parent().fadeTo("slow", 0.01, function(){//fade
	  					now.parent().parent().slideUp("slow", function() {//slide up
	  				    	now.parent().parent().remove();//then remove from the DOM
	  				    	pagetworeload("#pageLimit",cupa);
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
	  		 
	  	});
	    	  

	

})

