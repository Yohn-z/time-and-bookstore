var cupa; 

function pagereload(id){
	   $.ajax({
	           url:'/bookshophhit/admin/book/findtslist.action?pageNo=1&pageSize=7',
	           type:'POST',
	           dataType:'JSON',
	           success:function (data) {
	        	   //alert(JSON.stringify(data.data.list.list));
	        	   $('#dataTables-example tbody').empty();
	        	   for(var i=0;i<data.data.list.list.length;i++){	
	        		   //alert(JSON.stringify(data.data.list.list[i]));
          			  $("#dataTables-example tbody").append(
					          				'<tr><td>'
							+ data.data.list.list[i].tsId
							+ '</td><td>'
							+ data.data.list.list[i].tsName
							+ '</td><td>'
							+ data.data.list.list[i].tsAuthor
							+ '</td><td>'
							+ data.data.list.list[i].tsPublisher
							+ '</td><td>'
							+ data.data.list.list[i].tsPupblishtime
							+ '</td><td>'
							+ data.data.list.list[i].tsTime
							+ '</td><td>'
							+ data.data.list.list[i].tsPrice
							+ '</td><td>'
							+ data.data.list.list[i].tsOnnum
							+ '/'
							+ data.data.list.list[i].tsSum
							+ '</td><td>'
							+ data.data.list.list[i].tslbName
							+ '</td><td>'
							+ data.data.list.list[i].skztName
							+ '</td><td><button class="btn btn-default btn-sm tsupdateinfo" data-toggle="modal" data-tsinfo="'
							+ data.data.list.list[i].tsId
							+ '" data-target="#myupdateModal">修改</button>&ensp;<button type="button" class="btn btn-danger btn-sm tsdelete" data-id="'
							+ data.data.list.list[i].tsId
							+ '">删除</button></td></tr>'
          			  ); 
	          		}
	        	   for(var j=0;j<data.data.lblist.length;j++){
      				$(".tslb").append(
      					'<option value="'+data.data.lblist[j].tslbName+'">'+data.data.lblist[j].tslbName+'</option>'
      				); 
      		   }
      		   for(var k=0;k<data.data.ztlist.length;k++){
    				$(".skzt").append(
    					'<option value="'+data.data.ztlist[k].skztId+'">'+data.data.ztlist[k].skztName+'</option>'
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
 	 		                url:'/bookshophhit/admin/book/findtslist.action?pageNo='+page+'&pageSize=7',
 	 		                type:'get',
 	 		            
 	 		                dataType:'JSON',
 	 		                success:function (data) {
 	 		                        
 	 		                      $('#dataTables-example tbody').empty();
 	 		 	        	   for(var i=0;i<data.data.list.list.length;i++){	  
 	 		           			  $("#dataTables-example tbody").append(
 	 		 					          				'<tr><td>'
 	 		 							+ data.data.list.list[i].tsId
 	 		 							+ '</td><td>'
 	 		 							+ data.data.list.list[i].tsName
 	 		 							+ '</td><td>'
 	 		 							+ data.data.list.list[i].tsAuthor
 	 		 							+ '</td><td>'
 	 		 							+ data.data.list.list[i].tsPublisher
 	 		 							+ '</td><td>'
 	 		 							+ data.data.list.list[i].tsPupblishtime
 	 		 							+ '</td><td>'
 	 		 							+ data.data.list.list[i].tsTime
 	 		 							+ '</td><td>'
 	 		 							+ data.data.list.list[i].tsPrice
 	 		 							+ '</td><td>'
 	 		 							+ data.data.list.list[i].tsOnnum
 	 		 							+ '/'
 	 		 							+ data.data.list.list[i].tsSum
 	 		 							+ '</td><td>'
 	 		 							+ data.data.list.list[i].tslbName
 	 		 							+ '</td><td>'
 	 		 							+ data.data.list.list[i].skztName
 	 		 							+ '</td><td><button class="btn btn-default btn-sm tsupdateinfo" data-toggle="modal" data-tsinfo="'
 	 		 							+ data.data.list.list[i].tsId
 	 		 							+ '" data-target="#myupdateModal">修改</button>&ensp;<button type="button" class="btn btn-danger btn-sm tsdelete" data-id="'
 	 		 							+ data.data.list.list[i].tsId
 	 		 							+ '">删除</button></td></tr>'
 	 		           			  ); 
 	 		 	          		}
 	 		                    }
 	 		            })
 	 		        }
 	 		});

	     	
	           }
			})
}

function pagetworeload(id,currentPage){
	var dataObj = {pageNo:'1',pageSize:'5'};
	   var data = JSON.stringify(dataObj);
	   $.ajax({
	           url:'/bookshophhit/admin/book/findtslist.action?pageNo='+currentPage+'&pageSize=7',
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
	 		                url:'/bookshophhit/admin/book/findtslist.action?pageNo='+page+'&pageSize=7',
	 		                type:'POST',
	 		                data:{'page':page,'count':12},
	 		                dataType:'JSON',
	 		                success:function (data) {
	 		                	$('#dataTables-example tbody').empty();
	 			        	   for(var i=0;i<data.data.list.list.length;i++){	  
	 		          			  $("#dataTables-example tbody").append(
	 							          				'<tr><td>'
	 									+ data.data.list.list[i].tsId
	 									+ '</td><td>'
	 									+ data.data.list.list[i].tsName
	 									+ '</td><td>'
	 									+ data.data.list.list[i].tsAuthor
	 									+ '</td><td>'
	 									+ data.data.list.list[i].tsPublisher
	 									+ '</td><td>'
	 									+ data.data.list.list[i].tsPupblishtime
	 									+ '</td><td>'
	 									+ data.data.list.list[i].tsTime
	 									+ '</td><td>'
	 									+ data.data.list.list[i].tsPrice
	 									+ '</td><td>'
	 									+ data.data.list.list[i].tsOnnum
	 									+ '/'
	 									+ data.data.list.list[i].tsSum
	 									+ '</td><td>'
	 									+ data.data.list.list[i].tslbName
	 									+ '</td><td>'
	 									+ data.data.list.list[i].skztName
	 									+ '</td><td><button class="btn btn-default btn-sm tsupdateinfo" data-toggle="modal" data-tsinfo="'
	 									+ data.data.list.list[i].tsId
	 									+ '" data-target="#myupdateModal">修改</button>&ensp;<button type="button" class="btn btn-danger btn-sm tsdelete" data-id="'
	 									+ data.data.list.list[i].tsId
	 									+ '">删除</button></td></tr>'
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
	
	
/* table.html ajax ts submit--------------------------------------------------*/
    var LOGIN = {
  	      checkInput:function() {
  	    	  var zz =/^[0-9,.]*$/;
  	    	  if(!zz.test($("#tspriceinput").val().trim())){
  	    		  alert("请输入正确的金额s数字");
  	    		  return false;
  	          } 

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
  	        
  	    	  var form = new FormData(document.getElementById("bookinform"));
  	    	form.append("skztName", $("#lskzt option:selected").text());
  	    	//alert(form.get("skztName"));
  	          var formdata = convert_FormData_to_json(form);
  	     
	  	      $.ajax({
	  	  	  url:  "/bookshophhit/admin/book/insertts.action",
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
  		  
  	    $("#bookin").click(function(){
  	      LOGIN.login();
  	    });
  	    
  	  });
/*----------------------------------------------------------------*/
    	  
    	  
/*table.html delete-----------------------  ----------------------*/     
  	$("body").on('click','.tsdelete',function(){
  		var now = $(this);
  		var tsId = now.data("id");
  		var dataObj = { "tsId" : tsId };
  		var data = JSON.stringify(dataObj);
  		var url = "/bookshophhit/admin/book/deletets.action";
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
  				    	now.parent().parent().remove();;//then remove from the DOM
  				    	pagetworeload('#pageLimit',cupa);
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
/*table.html delete end-----------------------  ----------------------*/  
  	
  	
/*table.html update-----------------------------------------------------*/
  	//请求修改数据
  	$("body").on('click','.tsupdateinfo',function(){
  		var now = $(this);
  		var tsId = now.data("tsinfo");
  		var dataObj = { "tsId" : tsId };
  		var data = JSON.stringify(dataObj);
  		var url = "/bookshophhit/admin/book/updatetsinfo.action";
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
  	
  	//提交修改
  	$("body").on('click','#bookupdate',function(){
  		var form = new FormData(document.getElementById("bookupdateform"));
  		form.append("skztName", $("#updateskzt option:selected").text());
        var formdata = convert_FormData_to_json(form);
  		var url = "/bookshophhit/admin/book/updatets.action";
  		$.ajax({
  		  url:  url,
  		  dataType: "json",
  		  type:"post",
  		  processData:false,
  		  contentType:"application/json;charset=UTF-8",
  		  data:formdata,
  		  success:function(data){
  		     
  			  if(data.code=="1"){
  				  demo.showNotification('bottom','center',2,"修改成功！");
                // form.get("tsId");
                 $("#dataTables-example tbody tr td").each(function(){
                	 var now = $(this);
                	 var need = form.get("tsId");
                	 
                	 if(now.text() == need){
                		 var nowpa = now.parent();
                		 var obj = '<td>'+form.get("tsId")+'</td><td>'+form.get("tsName")+'</td><td>'+form.get("tsAuthor")+'</td><td>'+form.get("tsPublisher")+'</td><td>'+form.get("tsPrice")+'</td><td>'+form.get("tsSum")+'/'+form.get("tsSum")+'</td><td>'+form.get("tslbName")+'</td><td>'+form.get("skztName")+'</td><td><button class="btn btn-default btn-sm tsupdateinfo" data-toggle="modal" data-tsinfo="'+form.get("tsId")+'" data-target="#myupdateModal">修改</button>&ensp;<button type="button" class="btn btn-danger btn-sm tsdelete" data-id="'+form.get("tsId")+'">删除</button></td>';
                		 nowpa.html(obj); 
                	 }
                	 
                	 //alert(need);
                	 //alert(now.find("td"));
                	 //alert(need);
                	 /*if (now.html() = "111") {
                	    alert("11111111111");
                	 }*/
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
 
 /*update--end-------- --------------------------------------------------*/
});


