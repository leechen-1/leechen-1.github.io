function $(id){
	return document.getElementById(id);
}
window.onload = function(){
	$("slider_1").style.display = "block";
	var index = 0;
	var opc;
	var timerId1, timerId2;
	var animated = false;
	var btns_li = $("btns").getElementsByTagName('li');
	var divs = $("slider_box").getElementsByTagName('div');
	$("slider_box").onmouseover = function(){
		clearInterval(timerId2);
	}
	$("slider_box").onmouseout = function(){
		timerId2 = setInterval(play, 4000);
	}
	for (var i = 0; i < btns_li.length; i++) {
		btns_li[i].onclick = function(){
			if (index == this.getAttribute("index")) {
				return;
			} else {
				if (timerId1) {
					clearInterval(timerId1);
				}
				index = this.getAttribute("index");
			}
			show();
			animated = true;
		}
	}
	function show(){
		if (timerId1) {
			clearInterval(timerId1);
		}
		for (var i = 0; i < btns_li.length; i++) {
			btns_li[i].style.opacity = 0.5;
		}
		btns_li[index].style.opacity = 1;
		for (var i = 0; i < divs.length; i++) {
			divs[i].style.display = "none";
		}
		divs[index].style.display = "block";
		opc = 0;
		divs[index].style.opacity = opc;
		timerId1 = setInterval(animate, 20);
	}
	function animate(){
		opc += 3;
		divs[index].style.opacity = opc/100;
		if (opc == 100) {
			animated = false;
			clearInterval(timerId1);
		}
	}
	function play(){
		index++;
		if (index == 5) {
			index = 0;
		}
		show();
	}
	timerId2 = setInterval(play, 4000);
}