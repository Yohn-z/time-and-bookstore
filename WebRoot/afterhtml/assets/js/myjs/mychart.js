	var manco;
	var womanco;
	var otherco;
		
$(document).ready(function(){
	

		$.ajax({
  	  		  url:  "/bookshophhit/admin/chart/sexcount.action",
  	  		  dataType: "json",
  	  		  type:"post",
  	  		  processData:false,
  	  		  contentType:"application/json;charset=UTF-8",
  	  		  success:function(data){
  	  		      //alert("2222222");
  	  			  if(data.code=="1"){
					manco = data.data.manCount;
					womanco = data.data.womanCount;
					
			     	var man = Number(100*manco/(manco+womanco)).toFixed(1);
			     	
		            var woman = Number(100*womanco/(manco+womanco)).toFixed(1);
		            //alert(manco);
  	  	            
		            var pie ={
  	  		          labels: [man+'%',woman+'%'],
  	  		          series: [manco,womanco]
  	  		        };

  	  	    	demo.initChartist(pie);
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
   
		 
		/* var pie ={
		          labels: ['45%','50%','5%'],
		          series: [45,50,5]
		        }; */
		
		
		
        
		
		//alert("1111111");
		

    	$.notify({
        	icon: 'pe-7s-gift',
        	message: "欢迎来到  叶子。。。书店 - 由于时间不足的问题，本店各种功能还未完善,敬请期待."

        },{
            type: 'info',
            timer: 4000
        });

    	});