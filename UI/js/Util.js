function createCookie() {
    const cookies = (function () {
			return {
				setCookie: (cname, cvalue, exdays) => {
					const d = new Date();
					d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));
					const expires = 'expires=' + d.toUTCString();
					document.cookie = cname + '=' + cvalue + '; ' + expires;
				},
				getCookie: (cname) => {
					const name = cname + '=';
					const ca = document.cookie.split(';');
					for (let i = 0; i < ca.length; i += 1) {
						let c = ca[i];
						while (c.charAt(0) === ' ') c = c.substring(1);
						if (c.indexOf(name) === 0) return c.substring(name.length, c.length);
					}
					return '';
				},
				checkCookie: (cname) => {
					const cookie = window.CookieObj.getCookie(cname);
					if (cookie !== '') {
						return true;
					}
					return false;
				},
				deleteCookie(cname) {
					this.setCookie(cname, '', -1);
				},
			};
		}());
		window.CookieObj = cookies;
}

function showUserName() {
    var cookie = window.CookieObj;
    var userInfo = cookie.getCookie("UserInfo");
    if (userInfo == null)
        return;
    var userInfoArray = userInfo.split("&");
    var userNameString = userInfoArray[0];
    if (userNameString.length > 6) {
        var userName = userNameString.substring(6,userNameString.length);
        var element = document.getElementById("userWelcome");
		if (element == null)
			return;
        element.innerHTML = "Welcome " + userName;
    }
}

function updateQuantity(item, price, bookType){
	var x = document.getElementById(item+"-"+bookType+"-select").value;
	var totalElement = document.getElementById(item+"-"+bookType+"-total");
	var currentPrice = parseInt(totalElement.innerText);
	var total = price * x;
	totalElement.innerText = total;

	var subTotal = document.getElementById("subTotal");
	var cartTotal = parseInt(subTotal.innerText);

	cartTotal = cartTotal + total - currentPrice;
	subTotal.innerText = cartTotal;

	var tax = document.getElementById("tax");
	var taxValue = cartTotal*0.075;
	taxValue = Math.round(taxValue * 100) / 100;
	tax.innerText = taxValue;

	var total = document.getElementById("total");
	var totalValue = cartTotal + taxValue;
	total.innerText = 	totalValue;	
}