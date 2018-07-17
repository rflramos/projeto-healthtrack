$(document).ready(function(){
	$("p").hide();
	$("input").on({

		blur: function(){
			if($(this).val().length==0){
			$(this).addClass("vermelho");
			$("p").show();
		} else {
			$(this).addClass("white");
			$("p").hide();
		}

		},

		focus: function(){
			$(this).addClass("white");
		}
		
	});
});	


window.onload = function()
{
	var otxttype = document.getElementById("nome");
	var oMsgTextid = document.getElementById("msgtext")
	otxttype.onblur = function(){
		var oRegExptxt = new RegExp("^[A-Za-z ]+$");
		if (oRegExptxt.test(otxttype.value) == false) {
			otxttype.style.borderColor = "red";
			oMsgTextid.innerHTML = "*Campo permite somente letras";
		}
		otxttype.onfocus = function(){
			otxttype.style.borderColor = "";
			oMsgTextid.innerHTML = "";
		}
	}

	var oEmailType = document.getElementById("email");
	var oMsgTextid = document.getElementById("msgtext")
	oEmailType.onblur = function(){
		var oRegExpEmail = new RegExp("^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+).(\.[a-z]{2,3})$");
		if (oRegExpEmail.test(oEmailType.value) == false) {
			oEmailType.style.borderColor = "red";
			oMsgTextid.innerHTML = "*Necessário informar um e-mail válido.";
		}
		oEmailType.onfocus = function(){
			oEmailType.style.borderColor = "";
			oMsgTextid.innerHTML = "";
		}
	}

	var oPwd1 = document.getElementById("pwd1");
	oPwd1.onblur = function(){
		var oRegExpPwd1 = new RegExp("^[A-Za-z0-9]{6}$");
		if (oRegExpPwd1.test(oPwd1.value)==false) {
			oPwd1.style.borderColor = "red";
			oMsgTextid.innerHTML = "*Senha máximo 6 digitos alphanuméricos";
		}
		oPwd1.onfocus = function(){
			oPwd1.style.borderColor = "";
			oMsgTextid.innerHTML = "";
		}
	}

	var oPwd2 = document.getElementById("pwd2");
	oPwd2.onblur = function(){
		var oRegExpPwd2 = new RegExp("^[A-Za-z0-9]{6}$");
		if (oRegExpPwd2.test(oPwd2.value)==false) {
			oPwd2.style.borderColor = "red";
			oMsgTextid.innerHTML = "*Senha máximo 6 digitos alphanuméricos";
		}
		oPwd1.onfocus = function(){
			oPwd2.style.borderColor = "";
			oMsgTextid.innerHTML = "";
		}
	}
	var oSex = document.getElementById("sex");
	oSex.onblur = function(){
		var oRegExpSex = new RegExp("^[A-Za-z ]+$");
		if (oRegExpSex.test(oSex.value)==false) {
			oSex.style.borderColor = "red";
			oMsgTextid.innerHTML = "*Campo permite somente letras";
		}
		oSex.onfocus = function(){
			oSex.style.borderColor = "";
			oMsgTextid.innerHTML = "";
		}
	}

	var oAltura = document.getElementById("altura");
	oAltura.onblur = function(){
		var oRegExpAltura = new RegExp("^[0-9]{1}\,[0-9]{2}$");
		if (oRegExpAltura.test(oAltura.value)==false) {
			oAltura.style.borderColor = "red";
			oMsgTextid.innerHTML = "*Campo permite somente números";
		}
		oAltura.onfocus = function(){
			oAltura.style.borderColor = "";
			oMsgTextid.innerHTML = "";
		}
	}
}

	

	