var cupa = 1; //当前页面，全局变量
var vm = null;
function pagereload(url,id,func){
    $.ajax({
        url:url+'?pageNo='+cupa,
        type:'get',
        dataType:'JSON',
        success:function (data) {
            if(data.code="1"){
                var a = data.data.list;
                func(a);
                Paginatorinit(id,url,data.data.pages)
            }else{
            	demo.showNotification('bottom','center',3,data.msg);
            }

        },
        error: function(data){
            alert("网路异常");
        }
    })
}

function repagereload(url,id){

    var timestamp=new Date().getTime();
    $.ajax({
        url:url+'?pageNo='+cupa+'&timestamp='+timestamp,
        type:'get',
        dataType:'JSON',
        cache: false, //设置为 false 将不会从浏览器缓存中加载请求信息。
       
        success:function (data) {
            if(data.code="1"){
                var b = data.data.list;
                vm.$data.sites = b;
                console.log(JSON.stringify(b));
                Paginatorinit(id,url,data.data.pages)
            }else{
            	demo.showNotification('bottom','center',3,data.msg);
            }

        },
        error: function(data){
            alert("网路异常");
        }
    })
}

function Paginatorinit(id,url,pages){
    $(id).bootstrapPaginator({
        currentPage: 1,
        totalPages: pages,
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
            cupa = page
            $.ajax({
                url:url+'?pageNo='+page,
                type:'get',
                dataType:'JSON',
                success:function (data) {
                    if(data.code="1"){
                        a = data.data.list;

                        vm.$data.sites = a;
                    }else{
                    	demo.showNotification('bottom','center',3,data.msg);
                    }

                },
                error: function(data){
                    alert("网路异常");
                }
            })
        }
    });
}

function searchlist(url,id,uNIckname){
    $.ajax({
        url:url+'?uNickname='+uNIckname,
        type:'get',
        dataType:'JSON',
        success:function (data) {
            if(data.code="1"){
                var b = data.data.list;
                vm.$data.sites = b;
                PaginatorinitSerrch(id,url,data.data.pages,uNIckname)
            }else{
            	demo.showNotification('bottom','center',3,data.msg);
            }

        },
        error: function(data){
            alert("网路异常");
        }
    })
}
function PaginatorinitSerrch(id,url,pages,uNIckname){
    $(id).bootstrapPaginator({
        currentPage: 1,
        totalPages: pages,
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
            cupa = page
            $.ajax({
                url:url+'?pageNo='+page+'&uNickname='+uNIckname,
                type:'get',
                dataType:'JSON',
                success:function (data) {
                    if(data.code="1"){
                        a = data.data.list;
                        JSON.stringify(a)
                        vm.$data.sites = a;
                    }else{
                        alert(JSON.stringify(data.msg));
                    }

                },
                error: function(data){
                    alert("网路异常");
                }
            })
        }
    });
}



function getJson(url,func){$.ajax({
    type:'get',
    url:url,
    dataType: 'json',
    success: function(data){ if (data.code=="1"){var a = data.data.list;func(a);}else{  alert(JSON.stringify(data.msg));  }  },
    error: function(data){  alert("网路异常");  }  });
}


function postJson(url,datainfo){
    $.ajax({
        type:'post',
        url:url,
        dataType: 'json',
        contentType:"application/json;charset=UTF-8",
        data: datainfo,
        success: function(data){ if (data.code=="1"){ demo.showNotification('bottom','center',3,data.msg); }else{ demo.showNotification('bottom','center',3,data.msg);;  }  },
        error: function(data){  alert("网路异常");  }
    });
}

function postJsondata(url,datainfo,func){$.ajax({
    type:'post',
    url:url,
    dataType: 'json',
    contentType:"application/json;charset=UTF-8",
    data: datainfo,
    success: function(data){ if (data.code=="1"){var a = data.data;func(a);}else{  demo.showNotification('bottom','center',3,data.msg);;  }  },
    error: function(data){  alert("网路异常");  }  });
}


function pushDom(datasou){
    vm = new Vue({
        el: '#app',
        data: {
            sites: datasou
        }
    })
}

function updateinfolist(a){

    $("#show").html(a.lMsg);
    
}


var userlist_url = "/bookshophhit/user/letter/findLetterbyuser.action";//请求用户列表
/*var userinfo_url = "../admin/letter/deleteLetterByid";//指定用户信息
*/
var deleteuserinfo_url = "/bookshophhit/user/letter/deleteLetterByid.action";//删除
var adduser_url = "/bookshophhit/user/letter/insertletter.action";//添加
var findmsg_url = "/bookshophhit/user/letter/lettermsg.action"//查看信息


pagereload(userlist_url,"#pageLimit",pushDom);

$("#lettersend").click(function(){
    var formjson = getStringjsonformdata("userupdateform");////////////////
    //alert(formjson);
    postJson(adduser_url,formjson);
    repagereload(userlist_url,"#pageLimit");
});

$("body").on('click','.deleteuserinfo',function(){
    var now = $(this);
    var uId = now.data("id");
    var dataObj = { "lId" : uId };
    var data = JSON.stringify(dataObj);
    
    postJson(deleteuserinfo_url,data);
/*    now.parent().parent().fadeTo("slow", 0.01, function(){//fade
        now.parent().parent().slideUp("slow", function() {//slide up
            now.parent().parent().remove();//then remove from the DOM
        });
    });*/
    repagereload(userlist_url,"#pageLimit");
});

$("body").on('click','.letterinfo',function(){
    var now = $(this);
    var uId = now.data("id");
    var dataObj = { "lId" : uId };
    var data = JSON.stringify(dataObj);
    postJsondata(findmsg_url,data,updateinfolist);

});

