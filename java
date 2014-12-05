<html>
<body>
<button onlick="stop();">Stop</button>
<script>
changeColor = function() {
red = Math.floor(Math.random()*255);
green = Math.floor(Math.random()*255);
blue = Math.floor(Math.random()*255);
colorStr = "rgb(" + red + "," + green + "," + blue + ")";
document.body.style.backgroundColor = colorStr;
//window.setInterval(changeColor, 10000);
}
stop = function() {
window.clearInterval(intId);
}
intId = window.setInterval(changeColor, 10000);
</script>
</body>
</html>
