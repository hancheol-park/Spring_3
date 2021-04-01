/**
 * 
 */

function check(){
	let all = document.getElementById("ALL");
	let ch = document.getElementsByClassName("form-check-input");
	let result = true;
	
	for(let c of ch){
		if(!c.checked){
			result=false;
			break
		}
		all.checked=result;
	}

}