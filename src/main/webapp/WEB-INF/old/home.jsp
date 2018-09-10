<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
<title>Make My Trip</title>
<style type="text/css">

.button {
    background-color: green;
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
	float:center;
	box-shadow: 0 9px #999;
	border-radius: 15px;
}
.button:hover{
background-color:#3e8e41;
}
.button:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
.img {
    display: block;
    margin-left: auto;
    margin-right: auto;
}
.carousel-inner img {
      /*width: 100%;  Set width to 100% */
      margin: auto;
     /* min-height:200px;*/
  }
  @media (max-width: 600px) {
    .carousel-caption {
      display: none; 
    }
  }
.p{
align:center;}
.block-menu {
                display: block;
                <%--background: #f94f25;
                --%>background: rgba(249, 79, 37, 0.7);
}

.block-menu li {
                display: inline-block;
}

.block-menu li a {
                color: #ed3a0e;
                display: block;
                text-decoration: none;
                font-family: 'Passion One', Arial, sans-serif;
                font-smoothing: antialiased;
                text-transform: uppercase;
                overflow: visible;
                line-height: 20px;
                font-size: 24px;
                padding: 15px 10px;
}
.column {
    float: left;
    width: 50%;
    padding: 10px;
    height: 300px; /* Should be removed. Only for demonstration */
}
.row:after {
    content: "";
    display: table;
    clear: both;
}

/* animation domination */
.three-d {
                perspective: 200px;
                transition: all .07s linear;
                position: relative;
                cursor: pointer;
}
                /* complete the animation! */
                .three-d:hover .three-d-box, 
                .three-d:focus .three-d-box {
                                transform: translateZ(-25px) rotateX(90deg);
                }

.three-d-box {
                transition: all .3s ease-out;
                transform: translatez(-25px);
                transform-style: preserve-3d;
                pointer-events: none;
                position: absolute;
                top: 0;
                left: 0;
                display: block;
                width: 100%;
                height: 100%;
}

/* 
                put the "front" and "back" elements into place with CSS transforms, 
                specifically translation and translatez
*/
.front {
                transform: rotatex(0deg) translatez(25px);
}

.back {
                transform: rotatex(-90deg) translatez(25px);
                color: #f94f25;
}

.front, .back {
                display: block;
                width: 100%;
                height: 100%;
                position: absolute;
                top: 0;
                left: 0;
               
                background: rgba(249, 79, 37, 0.3);
                padding: 15px 10px;
                color: white;
                pointer-events: none;
                box-sizing: border-box;
}
.header{
align:center;}
</style>
</head>
<body background="\images\paris3.jpg">

<center>
<img src="\images\mmt.png" height="150" width="200">
</center>
<center>
<!--  <nav>
<form action="/flights.jsp"><input type="submit" class="button" value="Flights"> </form>
<form action="/hotels.jsp"><input type="submit" class="button" value="Hotels"> </form>
<form action="/login"><input type="submit" class="button" value="login" ></form>
<form action="/getAllCustomers"><input type="submit" class="button" value="Sign Up"></form>
</nav>-->
</center>
<center>
<ul class="block-menu">
                <li><a href="/flights" class="three-d">
                                Flights
                                <span aria-hidden="true" class="three-d-box">
                                                <span class="front">Flights</span>
                                                <span class="back">Flights</span>
                                </span>
                </a></li>
                <li><a href="/hotels" class="three-d">
                                Hotels
                                <span aria-hidden="true" class="three-d-box">
                                                <span class="front">Hotels</span>
                                                <span class="back">Hotels</span>
                                </span>
                </a></li>
                <li><a href="/login" class="three-d">
                                Login
                                <span aria-hidden="true" class="three-d-box">
                                                <span class="front">Login</span>
                                                <span class="back">Login</span>
                                </span>
                </a></li>
                <li><a href="/getAllCustomers" class="three-d">
                                Signup
                                <span aria-hidden="true" class="three-d-box">
                                                <span class="front">Signup</span>
                                                <span class="back">Signup</span>
                                </span>
                </a></li>
                <!-- more items here -->
</ul>
</center>

<marquee behavior="scroll" direction="left" scrollamount="15">
<img src="\images\etihad.png" height="150" width="300">
</marquee>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
      <li data-target="#myCarousel" data-slide-to="4"></li>
      <li data-target="#myCarousel" data-slide-to="5"></li>
      <li data-target="#myCarousel" data-slide-to="6"></li>
    </ol>
<div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="\images\Hotel4.jpeg" alt="Image" height="150" width="200">
        <div class="carousel-caption">
         
        </div>      
      </div>

      <div class="item">
        <img src="\images\Hotel1.jpg" alt="Image" width="200" height="150">
        <div class="carousel-caption">
          
          
        </div>      
      </div>
      <div class="item">
        <img src="\images\Hotel3.jpg" alt="Image" width="200" height="150">
        <div class="carousel-caption">
          
          
        </div>      
      </div>
      <div class="item">
        <img src="\images\Hotel.jpg" alt="Image" width="200" height="150">
        <div class="carousel-caption">
        </div>      
      </div>
      <div class="item">
        <img src="\images\h1.jpg" alt="Image" width="200" height="150">
        <div class="carousel-caption">
        </div>      
      </div>
      <div class="item">
        <img src="\images\h2.jpg" alt="Image" width="200" height="150">
        <div class="carousel-caption">
        </div>      
      </div>
      <div class="item">
        <img src="\images\h3.jpg" alt="Image" width="200" height="150">
        <div class="carousel-caption">
        </div>      
      </div>
    </div>
	<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>
<marquee behavior="scroll" direction="right" scrollamount="15">
<img src="\images\f3.png" height="130" width="250">
</marquee>


<center>
<footer>


<h4><b> About Make My Trip</b></h4>
<p>MakeMyTrip.com, India’s leading online travel company was founded in the year 2000 by Deep Kalra. 
Created to empower the Indian traveller with instant booking and comprehensive choices, the company began its journey in the US-India travel market. 
It aimed to offer a range of best-value products and services along with cutting-edge technology and dedicated round-the-clock customer support.
</p>

<a href="https://play.google.com/store/apps/details?id=com.makemytrip"><img src="\images\Play.png" height="40"></a>
<br>
<br>

<a href="https://itunes.apple.com/us/app/makemytrip/id530488359"><img src="\images\Apple.png" height="40"></a>
</footer>
</center>

</body>
</html>