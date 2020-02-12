var cupa; 
function pagereload(id){
	   $.ajax({
	           url:'/bookshophhit/user/userbook/findtslist.action?pageNo=1&pageSize=7',
	           type:'POST',
	           dataType:'JSON',
	           success:function (data) {
        	   $('#dataTables-example tbody').empty();
        	   for(var i=0;i<data.data.list.list.length;i++){
          			  //$("#dataTables-example tbody")
          			   $("#dataTables-example tbody").append(
          			
          				'<tr><td>'+data.data.list.list[i].tsId+'</td><td>'+data.data.list.list[i].tsName+'</td><td>'+data.data.list.list[i].tsAuthor+'</td><td>'+data.data.list.list[i].tsPrice+'</td><td><button class="btn btn-info btn-sm tsinfo" data-toggle="modal" data-tsinfo="'+data.data.list.list[i].tsId+'" data-target="#myupdateModal">详细</button></td></tr>'
          			  ); 
          		  }
	     	 
		 
	     	 $(id).bootstrapPaginator({
	 		    currentPage: 1,
	 		    totalPages: data.data.list.pages,
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
	 		                url:'/bookshophhit/user/userbook/findtslist.action?pageNo='+page+'&pageSize=7',
	 		                type:'POST',
	 		                data:{'page':page,'count':12},
	 		                dataType:'JSON',
	 		                success:function (data) {
	 		                        $('#dataTables-example tbody').empty();
	 		                       for(var i=0;i<data.data.list.list.length;i++){
	 			          			  //$("#dataTables-example tbody")
	 			          			   $("#dataTables-example tbody").append(
	 			          			
	 			          				'<tr><td>'+data.data.list.list[i].tsId+'</td><td>'+data.data.list.list[i].tsName+'</td><td>'+data.data.list.list[i].tsAuthor+'</td><td>'+data.data.list.list[i].tsPrice+'</td><td><button class="btn btn-info btn-sm tsinfo" data-toggle="modal" data-tsinfo="'+data.data.list.list[i].tsId+'" data-target="#myupdateModal">详细</button></td></tr>'
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
	           url:'/bookshophhit/user/userbook/findtslist.action?pageNo='+currentPage+'&pageSize=7',
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
	 		    totalPages: data.data.list.pages,
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
	 		                url:'/bookshophhit/user/userbook/findtslist.action?pageNo='+page+'&pageSize=7',
	 		                type:'POST',
	 		                data:{'page':page,'count':12},
	 		                dataType:'JSON',
	 		                success:function (data) {
	 		                        $('#dataTables-example tbody').empty();
	 		                       for(var i=0;i<data.data.list.list.length;i++){
	 			          			  //$("#dataTables-example tbody")
	 			          			   $("#dataTables-example tbody").append(
	 			          			
	 			          				'<tr><td>'+data.data.list.list[i].tsId+'</td><td>'+data.data.list.list[i].tsName+'</td><td>'+data.data.list.list[i].tsAuthor+'</td><td>'+data.data.list.list[i].tsPrice+'</td><td><button class="btn btn-info btn-sm tsinfo" data-toggle="modal" data-tsinfo="'+data.data.list.list[i].tsId+'" data-target="#myupdateModal">详细</button></td></tr>'
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

$(function(){
	  
	pagereload('#pageLimit');
	    
 });


jQuery(document).ready(function() {
	

  	
/*table.html update-----------------------------------------------------*/
  	//请求修改数据
  	$("body").on('click','.tsinfo',function(){
  		var now = $(this);
  		var tsId = now.data("tsinfo");
  		var dataObj = { "tsId" : tsId };
  		var data = JSON.stringify(dataObj);
  		var url = "/bookshophhit/user/userbook/updatetsinfo.action";
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
                 $("#updateid").val(data.data.tsId);
                 $("#updatename").val(data.data.tsName);
                 $("#updateauthor").val(data.data.tsAuthor);
                 $("#updatepublisher").val(data.data.tsId);
                 $("#updateprice").val(data.data.tsPrice);
                 $("#updatetslb").val(data.data.tslbName);
                 $("#updateskzt").val(data.data.skztId);
                 $("#updateonnum").val(data.data.tsOnnum);
                 $("#updatesum").val(data.data.tsSum);
                 $("#updatededail").val(data.data.tsDetail);

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
  	
  	//提交预约
  	$("body").on('click','#bookyy',function(){
  		var form = new FormData(document.getElementById("bookupdateform"));
        var formdata = convert_FormData_to_json(form);
  		var url = "/bookshophhit/user/userborrow/yyb.action";
  		$.ajax({
  		  url:  url,
  		  dataType: "json",
  		  type:"post",
  		  processData:false,
  		  contentType:"application/json;charset=UTF-8",
  		  data:formdata,
  		  success:function(data){
  		     
  			  if(data.code=="1"){
  				  demo.showNotification('bottom','center',2,"预约成功！");  
  				  
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
 
 /*yy--end-------- --------------------------------------------------*/
  	/*------search-----------*/
  	$("body").on('click','#searchbook',function(){
  		var form = new FormData(document.getElementById("searchform"));
        var formdata = convert_FormData_to_json(form);
  		var url = "/bookshophhit/user/userbook/getfindlist.action";
  		$.ajax({
  		  url:  url,
  		  dataType: "json",
  		  type:"post",
  		  processData:false,
  		  contentType:"application/json;charset=UTF-8",
  		  data:formdata,
  		  success:function(data){
  			  $('#dataTables-example tbody').empty();
  			  for(var i=0;i<data.data.list.length;i++){
       			  //$("#dataTables-example tbody")
       			   $("#dataTables-example tbody").append(
       			
       				'<tr><td>'+data.data.list[i].tsId+'</td><td>'+data.data.list[i].tsName+'</td><td>'+data.data.list[i].tsAuthor+'</td><td>'+data.data.list[i].tsPrice+'</td><td><button class="btn btn-info btn-sm tsinfo" data-toggle="modal" data-tsinfo="'+data.data.list[i].tsId+'" data-target="#myupdateModal">详细</button></td></tr>'
       			  ); 
       		  }
  			  
  			$("#pageLimit").bootstrapPaginator({
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
	 		                url:'/bookshophhit/user/userbook/getfindlist.action?pageNo='+page+'&pageSize=7',
	 		                type:'POST',
	 		                data:{'page':page,'count':12},
	 		                dataType:'JSON',
	 		                success:function (data) {
	 		                	$('#dataTables-example tbody').empty();
	 		       			  	for(var i=0;i<data.data.list.length;i++){
	 		            			  //$("#dataTables-example tbody")
	 		            			   $("#dataTables-example tbody").append(
	 		            			
	 		            				'<tr><td>'+data.data.list[i].tsId+'</td><td>'+data.data.list[i].tsName+'</td><td>'+data.data.list[i].tsAuthor+'</td><td>'+data.data.list[i].tsPrice+'</td><td><button class="btn btn-info btn-sm tsinfo" data-toggle="modal" data-tsinfo="'+data.data.list[i].tsId+'" data-target="#myupdateModal">详细</button></td></tr>'
	 		            			  ); 
	 		            		  }
	 			     	 
	 		                    }
	 		            })
	 		        }
	 		});
  			  
  			  
  			  
  			  
  			  
  		  },
  		  error:function(data){
  			 
  		  }
  		
  		});
  		 
  	});
});


