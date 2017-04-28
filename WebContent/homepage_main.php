<!DOCTYPE html>
<html>
<head>

	<title>Hotel Booking Extravaganza</title>

    <meta charset="utf-8" />
    <meta http-equiv="Content-type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />

    <!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>

	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>

	<script type="text/javascript" src="hotel.js"></script>



	<link rel="stylesheet" type="text/css" href="homestyle.css" />

</head>
<body>

	<nav class="navbar navbar-inverse">

	  	<div class="container">
	  		<!-- Navbar Header -->
		    <?php include 'navbar_nouser.php'; ?>
	  	</div>
	</nav>

	<!-- Banner -->
	<div class="container" id="bannerContainer">
		<div class="row">
			<div class="banner">
				<h1 class="text-center"></h1>
			</div>
		</div>
	</div>

	<!-- Search Room Redirect-->
	<div class="container" id="redirectContainer">
		<div class ="row tex-center">
			<div class="row">
				<h2 class="text-center" id="findHeading">Find a Room</h2>
			</div>


			<div class="col-sm-4 col-md-4 text-center">
	            <!--Empty Slot-->
        	</div>

			<div class="col-sm-4 col-md-4 text-center">
	            <div class="thumbnail">
	                <button type="button" class="btn btn-primary" onclick="location.href = 'reservation.html';" >Find Room</button>
	            </div>
        	</div>

        	<div class="col-sm-4 col-md-4 text-center">
	            <!--Empty Slot-->
        	</div>

		</div>
	</div>

	<!-- Offers -->

	<div class="container" id="offerContainer">

		<div class="row text-center">

			<div class="row">
				<h2 class="text-center" id="offersHeading">Offers and Discounts</h2>
			</div>

			<div class="col-sm-4 col-md-4 text-center">
	            <div class="thumbnail">
	                <h4 class="text-center">
	                    Spa Offers
	                </h4>
	                <img src="images/room1.jpg">
	                <button type="button" class="btn btn-primary">View</button>
	            </div>
        	</div>

        	<div class="col-sm-4 col-md-4 text-center">
	            <div class="thumbnail">
	                <h4 class="text-center">
	                    Room Offers
	                </h4>
	                <img src="images/room2.jpg">
	                <button type="button" class="btn btn-primary">View</button>
	            </div>
        	</div>

        	<div class="col-sm-4 col-md-4 text-center">
	            <div class="thumbnail">
	                <h4 class="text-center">
	                    Other Promotions
	                </h4>
	                <img src="images/room3.jpg">
	                <button type="button" class="btn btn-primary">View</button>
	            </div>
        	</div>

        </div>
	</div>

	

	<!-- -->

	<!-- Register Modal -->
	<!-- Modal -->
  	<div class="modal fade" id="registerModal" role="dialog">
	    <div class="modal-dialog">
	      <!-- Modal content-->
	      <div class="modal-content">

	        <div class="modal-header">
	          <button type="button" class="close" data-dismiss="modal">&times;</button>
	          <h4 class="modal-title">Register</h4>
	        </div>

	        <div class="modal-body">
	          <div class="form-group">
	          	<label for="username">UserID<span style="color: red;"> *</span></label>
	          	<input type="text" class="form-control" placeholder="UserID" name="regUsername" id="registerUsername">
	          </div>
	          <div class="form-group">
	          	<label for="password">Password<span style="color: red;"> *</span></label>
	          	<input type="password" class="form-control" placeholder="********" name="regPassword" id="registerPassword">
	          </div>
	          <div class="form-group">
	          	<label for="confirmPassword">Confirm Password<span style="color: red;"> *</span></label>
	          	<input type="password" class="form-control" placeholder="********" name="regConfirmPassword" id="registerConfirmPassword">
	          </div>
	          <div class="form-group">
	          	<label for="firstname">First Name<span style="color: red;"> *</span></label>
	          	<input type="text" class="form-control" placeholder="" name="regFirstName" id="registerFirstName">
	          </div>
	          <div class="form-group">
	          	<label for="lastname">Last Name<span style="color: red;"> *</span></label>
	          	<input type="text" class="form-control" placeholder="" name="regLastName" id="registerLastName">
	          </div>
	          <div class="form-group">
	          	<label for="gender">Gender<span style="color: red;"> *</span></label>
	          	<input type="radio" class="form-control" name="regGender" value="male" id="registerGender">Male
	          	<input type="radio" class="form-control" name="regGender" value="female" id="registerGender">Female
	          </div>
	          <div class="form-group">
	          	<label for="birthday">Date of Birth<span style="color: red;"> *</span></label>
	          	<input type="date" class="form-control" placeholder="DDMMYYYY" name="regdateOfBirth" id="registerDateOfBirth">
	          </div>
	          <div class="form-group">
	          	<label for="email">Email</label>
	          	<input type="email" class="form-control" placeholder="" name="regEmail" id="registerEmail">
	          </div>
	          <div class="form-group">
	          	<label for="Address">Address</label>
	          	<input type="text" class="form-control" placeholder="" name="regContactNumber" id="registerContactNumber">
	          </div>
	        </div>
	   
	        <div class="modal-footer">
		        <button class="btn btn-default btn-md">Register</button>
	        </div>
	      </div>
	    </div>
  	</div>
	

	<!-- Login Modal -->

	<!-- Modal -->
  	<div class="modal fade" id="loginModal" role="dialog">
	    <div class="modal-dialog">
	      <!-- Modal content-->
	      <div class="modal-content">
	        <div class="modal-header">
	          <button type="button" class="close" data-dismiss="modal">&times;</button>
	          <h4 class="modal-title">Login</h4>
	        </div>
	        <div class="modal-body">
	        <form action="FrontController" method="post">
	          <div class="form-group">
	          	<label for="username">Username</label>
	          	<input type="text" class="form-control" placeholder="username" name="username" id="loginUsername">
	          </div>
	          <div class="form-group">
	          	<label for="username">Password</label>
	          	<input type="password" class="form-control" placeholder="********" name="password" id="loginPassword">
	          </div>
				
	        <div class="modal-footer">
	        
		        <button type="button" class="btn btn-default btn-md" id="register_button" data-dismiss="modal" data-toggle="modal" data-target="#registerModal">Register</button>
		        <!-- Added to connect to back end -->
	        	<input type="hidden" name="action" value="login">
		        <button type="submit" class="btn btn-default btn-md">Login Now</button>
		    </form>
	        </div>
	      </div>
	    </div>
  	</div>

  	<!-- Footer -->

	<div class="" id="footer">
		<div class="container">
			<div class="row text-center">
				<h1>Footer</h1>
			</div>
		</div>
	</div>

</body>
</html> 



<!-- <div class=" col-sm-4 col-md-4 col-lg-4 border"></div> -->
