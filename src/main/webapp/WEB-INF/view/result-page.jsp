<html>
<head>
<title>Love Calculator</title>
<link  type="text/css" href="/resources/css/style.css" rel="stylesheet"  />
</head>

<body>
	

<jsp:include page="header.jsp"></jsp:include>



	<div align="center">
		<h2>
			<p>You : ${userInfo.name}</p>
		</h2>
		<h2>
			<p>Crush: ${userInfo.crushname}</p>
		</h2>
		
		<h2>
			<p>prediction: ${loveresult}</p>
		</h2>
		<h2>
			<a href="sendEmail" >Send to your mail</a>
		</h2>
	</div>


</body>
</html>