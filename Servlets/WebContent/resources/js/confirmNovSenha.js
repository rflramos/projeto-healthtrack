window.onload = function()
{
	var oNewPwd1 = document.getElementById("newpass1");
	var oMsgTextid = document.getElementById("msgtext");
	oNewPwd1.onblur = function(){
	var oRegExpNewPwd1 = new RegExp("^[A-Za-z0-9]{6}$");
		if (oRegExpNewPwd1.test(oNewPwd1.value)==false) {
			oNewPwd1.style.borderColor = "red";
			oMsgTextid.innerHTML = "*Senha de 6 digitos alphanumericos";
		}
		oNewPwd1.onfocus = function(){
			oNewPwd1.style.borderColor = "";
			oMsgTextid.innerHTML = "";
		}
	}
	var oNewPwd2 = document.getElementById("newpass2");
	oNewPwd2.onblur = function(){
	var oRegExpNewPwd2 = new RegExp("^[A-Za-z0-9]{6}$");
		if (oRegExpNewPwd2.test(oNewPwd2.value)==false) {
			oNewPwd2.style.borderColor = "red";
			oMsgTextid.innerHTML = "*Senha de 6 digitos alphanumericos";
		}
		oNewPwd2.onfocus = function(){
			oNewPwd2.style.borderColor = "";
			oMsgTextid.innerHTML = "";
		}
	}
}
