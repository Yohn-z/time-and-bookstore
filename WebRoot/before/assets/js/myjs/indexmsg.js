var adduser_url = "/bookshophhit/letter/insertletter.action";//添加

function postJson(url,datainfo){
    $.ajax({
        type:'post',
        url:url,
        dataType: 'json',
        contentType:"application/json;charset=UTF-8",
        data: datainfo,
        success: function(data){ if (data.code=="1"){ alert("感谢您为我们提供宝贵的意见！"); }else{ alert(data.msg);  }  },
        error: function(data){  alert("网路异常");  }
    });
}


$("#msgsubmit").click(function(){
    var formjson = getStringjsonformdata("msgform");////////////////
    //alert(formjson);
    postJson(adduser_url,formjson);
    repagereload(userlist_url,"#pageLimit");
});