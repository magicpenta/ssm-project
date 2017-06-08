// JavaScript Document
function checkUserName(str){
	if(str==""){
		document.getElementById("errorDiv1").style.display = "block";
		document.getElementById("errorSpan1").innerHTML = "请输入用户名！";
		form.userName.focus();return false;
	} else {
		document.getElementById("errorDiv1").style.display = "none";
		document.getElementById("errorSpan1").innerHTML = "";
		return true;
	}
}

function checkPwd(str){
	if(str==""){
		document.getElementById("errorDiv2").style.display = "block";
		document.getElementById("errorSpan2").innerHTML = "请输入密码！";
		form.userName.focus();return false;
	} else {
		document.getElementById("errorDiv2").style.display = "none";
		document.getElementById("errorSpan2").innerHTML = "";
		return true;
	}
}

function loginSubmit(form){
	if(form.userName.value==""){
		document.getElementById("errorDiv1").style.display = "block";
		document.getElementById("errorSpan1").innerHTML = "请输入用户名！";
		form.userName.focus();return false;
	}
	if(form.pwd.value==""){
		document.getElementById("errorDiv2").style.display = "block";
		document.getElementById("errorSpan2").innerHTML = "请输入密码！";
		form.pwd.focus();return false;
	}
	document.getElementById("myform").submit();
}
