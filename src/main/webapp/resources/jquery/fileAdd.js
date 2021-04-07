/**
 * 
 */
//밖에서 선언해서 안에도 쓸수 있는변수를 전역변수라함, 괄호범위 내에서반 쓰는 변수를 지역변수
//html테그를id의 file에 넣어서 사용

let count=0;

$("#add").click(function(){
	if(count < 5){
	let contents = $("#sample").html();
	$("#files").append(contents);
	count++;
	}else{
		alert("hi")
	}
});


$("#del").click(function(){
	$("#files").empty();
})

//이벤트 전달(위임)
$("#files").on("click", ".delete",function(){
	$(this).parent().remove();
	count--;
});