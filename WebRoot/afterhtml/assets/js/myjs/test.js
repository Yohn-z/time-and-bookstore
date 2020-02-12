function pageinit(id,url,pageSize){
       //id为分页插件id,url为后台访问路径，pageSize为每页显示多少个，初始化时，pageNo当前页码默认为1
	   $.ajax({
	           url:url+'?pageNo+=1&pageSize='+pageSize,
	           type:'POST',
	           dataType:'JSON',
	           success:function (data) {
	        	   $('#dataTables-example tbody').empty();//#dataTables-example tbody下添加列表
	     	   for(var i=0;i<data.data.list.length;i++){
	     		  
			      $("#dataTables-example tbody").append(
			    		  '<tr><td>'+data.data.list[i].uId+'</td><td>'+data.data.list[i].uSex+'</td><td>'+data.data.list[i].uName+'</td><td>'+data.data.list[i].uPass+'</td><td>'+data.data.list[i].uTime+'</td><td>'+data.data.list[i].uTel+'</td><td>'+data.data.list[i].uDebt+'</td><td><button class="btn btn-default btn-sm userupdateinfo" data-toggle="modal" data-userinfo="'+data.data.list[i].uId+'" data-target="#myupdateModal">修改</button>&ensp;<button type="button" class="btn btn-danger btn-sm userdelete" data-id="'+data.data.list[i].uId+'">删除</button></td></tr>'
				  ); 
			    }
		       //var pageNum = data.data.pageNum;
		        //$('#last_page').text(data.data.lastPage);
	     	   //---------------------------------------------------------------------------
	     	  re(1,data.data.total,url);
	     	 
	     	   //-----------------------------------------------------------------------
	     	   
		      }
	      })
	  
	
}




function re(currentPage,totalPages,url)
{
	
	$(id).bootstrapPaginator({
		    currentPage: currentPage,
		    totalPages: totalPages,
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
		                url:url+'?pageNo='+page+'&pageSize=7',
		                type:'POST',
		           
		                dataType:'JSON',
		                success:function (data) {
		                        $('#dataTables-example tbody').empty();
		                       for(var i=0;i<data.data.list.length;i++){
		                  		
		            		      $("#dataTables-example tbody").append(
		            		    		 '<tr><td>'+data.data.list[i].uId+'</td><td>'+data.data.list[i].uSex+'</td><td>'+data.data.list[i].uName+'</td><td>'+data.data.list[i].uPass+'</td><td>'+data.data.list[i].uTime+'</td><td>'+data.data.list[i].uTel+'</td><td>'+data.data.list[i].uDebt+'</td><td><button class="btn btn-default btn-sm userupdateinfo" data-toggle="modal" data-userinfo="'+data.data.list[i].uId+'" data-target="#myupdateModal">修改</button>&ensp;<button type="button" class="btn btn-danger btn-sm userdelete" data-id="'+data.data.list[i].uId+'">删除</button></td></tr>'
		            			  ); 
		            		    }
		                    }
		            })
		        }
		});

}


/*
	 	*/

function pagetworeload(id,currentPage){
	
	   $.ajax({
	           url:'/bookshophhit/user/userlist.action?pageNo='+currentPage+'&pageSize=7',
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
	 		                url:'/bookshophhit/user/userlist.action?pageNo='+page+'&pageSize=7',
	 		                type:'POST',
	 		                data:{'page':page,'count':12},
	 		                dataType:'JSON',
	 		                success:function (data) {
	 		                        $('#dataTables-example tbody').empty();
	 		                       for(var i=0;i<data.data.list.length;i++){
	 		                  		
	 		            		      $("#dataTables-example tbody").append(
	 		            			    '<tr><td>'+data.data.list[i].uId+'</td><td>'+data.data.list[i].uSex+'</td><td>'+data.data.list[i].uName+'</td><td>'+data.data.list[i].uPass+'</td><td>'+data.data.list[i].uTime+'</td><td>'+data.data.list[i].uTel+'</td><td>'+data.data.list[i].uDebt+'</td><td><button class="btn btn-default btn-sm userupdateinfo" data-toggle="modal" data-userinfo="'+data.data.list[i].uId+'" data-target="#myupdateModal">修改</button>&ensp;<button type="button" class="btn btn-danger btn-sm userdelete" data-id="'+data.data.list[i].uId+'">删除</button></td></tr>'
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


