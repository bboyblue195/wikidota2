// Xo menu khi responsive
function menuIn() {
	var el = document.getElementById("floatmenu");
	if (el.className == "show") {
		menuOut();
	}
	else {
		el.className="show";
		var eld = document.getElementById("dark");
		eld.className="showd";
	}
}

// An menu
function menuOut() {
	var el = document.getElementById("floatmenu");
	el.className="hide";
	var eld = document.getElementById("dark");
	eld.className="hided";
	subOut();
}

// Xo menu account
function subIn() {
	var el = document.getElementById("floatsubmenu");
	if (el.className == "hidesub") {
		el.className="showsub";
	}
}

// An menu account
function subOut() {
	var el = document.getElementById("floatsubmenu");
	el.className="hidesub";
}

// Tao cac nut chon mau o tren cung + do vao tag select
function colorButtonsRendering(colors) {
	var colorArray = colors.split(",");
	var colorContainer = document.getElementsByClassName("colors")[0];
	var colorSelect = document.getElementsByName("color")[0];
	for (var i = 0; i <= colorArray.length - 1; i++) {
		var divTag = document.createElement("div");
		var aTag = document.createElement("a");
		var optionTag = document.createElement("option");
		var optionText = document.createTextNode(colorArray[i].toUpperCase());
		divTag.setAttribute("class", "cc " + colorArray[i]);
		divTag.setAttribute("onclick", "colorChange('" + colorArray[i] + "')");
		aTag.setAttribute("href", "#color");
		aTag.appendChild(divTag);
		colorContainer.appendChild(aTag);
		optionTag.setAttribute("value", colorArray[i]);
		optionTag.appendChild(optionText);
		colorSelect.appendChild(optionTag);
	}
	colorChange(colorArray[0]);
}

// Thay doi lua chon trong form sau khi xem mau
function colorSelecting(c) {
	var colorSelect = document.getElementsByName("color")[0];
	colorSelect.value = c;
//	colorChange(c);
}

//Chon mau ao o muc xem hang
function colorChange(c) {
	var el = document.getElementById("color");
	el.className = c;
	colorSelecting(c);
}

//Lay mau ao dau tien o trang index va shop
function firstColor(id, c) {
	var el = document.getElementById(id);
	var getColor = c.split(",")[0];
	el.classList.add(getColor);
}

// Do vao tag select de chon size
function sizeSelectRendering(sizes) {
	var sizeArray = sizes.split(",");
	var selectTag = document.getElementsByName("size")[0];
	for (var i = 0; i <= sizeArray.length - 1; i++) {
		var optionTag = document.createElement("option");
		var optionText = document.createTextNode(sizeArray[i]);
		optionTag.setAttribute("value", sizeArray[i]);
		optionTag.appendChild(optionText);
		selectTag.appendChild(optionTag);
	}
	selectTag.value = sizeArray[0];
}