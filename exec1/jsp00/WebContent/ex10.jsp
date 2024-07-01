<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>relative 부모요소, absolute 자식요소</title>
	<style type="text/css">
		body{
			margin: 0;
		}
		.parent {
			margin: 100px;
			width: 300px;
			height: 300px;
			background-color: aqua;
			border: 1px solid red;
			position: relative;
		}
		.child {
			width: 50px;
			height: 50px;
			background-color: blue;
			position: absolute;
			bottom: -25px;
			left: 50%;
			transform: translatex(-50%);
		}
	</style>	
</head> 
<body>
	<div class="parent">
		<div class="child"></div>
	</div>
</body>
</html>