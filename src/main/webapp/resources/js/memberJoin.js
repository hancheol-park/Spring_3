/**
 * 
 */

let id = document.getElementById("id");

id.addEventListener("vlur",function(){
	let message = "6글자 미만";
	if(id.value.length>5){
		message="6글자이상";
	}
	
	let idResult = document.getElementById("idResult");
	idResult.innerHTML=message;
});