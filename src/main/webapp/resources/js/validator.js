function validateUserDetails() {
		var username = document.getElementById("yn").value;
		var crushname = document.getElementById("cn").value;
		if (username.length < 1 || crushname.length < 1) {
			alert("Enter valid entry");
			return false;
		}
		return true;
}
