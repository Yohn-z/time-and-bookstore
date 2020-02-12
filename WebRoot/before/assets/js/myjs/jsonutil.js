//formdata转换成json字符串
var convert_FormData_to_json = function (formData) {
	    var objData = {};
	    
	    for (var entry of formData.entries()){
	        objData[entry[0]] = entry[1];
	    }
	    return JSON.stringify(objData);
	};
	
	function getStringjsonformdata(id){
	    var form = new FormData(document.getElementById(id));
	    var formjson = convert_FormData_to_json(form);
	    return formjson;
	}