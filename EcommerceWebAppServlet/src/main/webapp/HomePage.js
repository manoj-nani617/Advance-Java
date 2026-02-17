/**
 * 
 */

const logout = document.getElementById("logout");
logout.addEventListener("click",() => {
	logOut();
	
})
function logOut() {
	//overlay
	overlay = document.createElement("div");
	overlay.style.position = "fixed";
	overlay.style.bottom = "0";
	overlay.style.background =  "rgba(0,0,0,0.4)";
	overlay.style.width = "100%";
	overlay.style.height = "100%";
	overlay.style.display = "flex";
	overlay.style.justifyContent = "center";
	overlay.style.flexDirection = "column";
	overlay.style.alignItems = "center";


	//div
	div = document.createElement("div");
	div.style.background =  "white";
	div.style.width = "350px";
	div.style.height = "150px";
	div.innerHTML = `
	  <p>Are you sure you want to logout?</p>`;
	div.style.display = "flex";
	div.style.justifyContent = "center";
	div.style.flexDirection = "column";
	div.style.alignItems = "center";
	div.style.borderRadius = "5px";



	//buttons container
	buttons = document.createElement("div");
	buttons.style.display = "flex";
	buttons.style.gap = "100px";
	buttons.style.margin = "20px";

	yes = document.createElement("button");
	yes.id = "yes"
	yes.innerText = "Yes";
	yes.style.backgroundColor = "#3498db"
	yes.style.border = "none";
	yes.style.outline = "none";
	yes.style.color = "white";
	yes.style.borderRadius = "5px";
	yes.style.width = "50px";
	yes.style.height = "30px";
	yes.style.cursor = "pointer";

	no = document.createElement("button");
	no.id = "no"
	no.innerText = "No";
	no.style.width = "50px";
	no.style.height = "30px";
	no.style.backgroundColor = "#3498db"
	no.style.border = "none";
	no.style.outline = "none";
	no.style.color = "white";
	no.style.borderRadius = "5px";
	no.style.cursor = "pointer";

	buttons.appendChild(yes);
	buttons.appendChild(no);

		
	div.appendChild(buttons);
	overlay.appendChild(div);
	document.body.appendChild(overlay);
	no.addEventListener("click",() =>{
		overlay.remove();
	})
	yes.addEventListener("click",()=>{
		window.location.href= "Login.jsp";
	})
	
}

localStorage.clear()