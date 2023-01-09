/**
 * 
 */
field = document.getElementById("password-input");
button = document.getElementById("form-submit");

field.addEventListener("input", function() {
  button.disabled = field.value.length < 8;
})

function show(){
	var input = document.getElementById("password-input");
	input.setAttribute('type', 'text');
}

function hide(){
	var input = document.getElementById("password-input");
	input.setAttribute('type', 'password');
}

var is_visible = false;
var btn = document.getElementById("toggle-password");

btn.addEventListener("click", function(){
	
    if(is_visible)
    {
        hide();
        is_visible = false;
        btn.innerHTML = "SHOW";
    }
    else
    {
        show();
        is_visible = true;
        btn.innerHTML = "HIDE";
    }
},false)

var input = document.getElementById("password-input");
input.addEventListener("input", function(){
	input.setAttribute('value',document.getElementById("password-input").value);
})
document.getElementById("password-input").addEventListener("input", function(){
	document.getElementById("toggle-password").style.display = 'block';
	document.getElementById("password-input").style.minWidth = '234px';
})
document.getElementById("password-input").addEventListener("click", function(){
	document.getElementById("toggle-password").style.display = 'block';
	document.getElementById("password-input").style.minWidth = '234px';
})

document.onclick = function(div){
	if(div.target.id !== "password-input" && div.target.id !== "toggle-password"){
		document.getElementById("toggle-password").style.display = 'none';
		document.getElementById("password-input").style.minWidth = '284px';
	}	
}