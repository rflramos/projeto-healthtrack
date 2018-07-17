window.onload = function()
{
	var oEmailType = document.getElementById("email");
	var oMsgTextid = document.getElementById("msgtext")
	oEmailType.onblur = function(){
		var oRegExpEmail = new RegExp("^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+).(\.[a-z]{2,3})$");
		if (oRegExpEmail.test(oEmailType.value) == false) {
			oEmailType.style.borderColor = "red";
			oMsgTextid.innerHTML = "*Formato de e-mail invalido";
		}
		oEmailType.onfocus = function(){
			oEmailType.style.borderColor = "";
			oMsgTextid.innerHTML = "";
		}
	}
}