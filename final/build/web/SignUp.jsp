

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
﻿<!DOCTYPE html>
<html lang="en-US">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HHHT TEAM -  Manage Engrisk course </title>
        <meta name="description" content="HHHT TEAM -  Manage Engrisk course">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <link rel="shortcut icon" type="image/x-icon" href="images\1.png">
        <!-- STYLESHEETS -->
        <link rel="stylesheet" href="css\bootstrap.min.css" type="text/css" media="all">
        <link rel="stylesheet" href="css\all.min.css" type="text/css" media="all">
        <link rel="stylesheet" href="css\simple-line-icons.css" type="text/css" media="all">
        <link rel="stylesheet" href="css\slick.css" type="text/css" media="all">
        <link rel="stylesheet" href="css\animate.css" type="text/css" media="all">
        <link rel="stylesheet" href="css\magnific-popup.css" type="text/css" media="all">
        <link rel="stylesheet" href="css\style.css" type="text/css" media="all">

        <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    </head>

    <body>

        <!-- Preloader -->
        <div id="preloader">
            <div class="outer">
                <!-- Google Chrome -->
                <div class="infinityChrome">
                    <div></div>
                    <div></div>
                    <div></div>
                </div>

                <!-- Safari and others -->
                <div class="infinity">
                    <div>
                        <span></span>
                    </div>
                    <div>
                        <span></span>
                    </div>
                    <div>
                        <span></span>
                    </div>
                </div>
                <!-- Stuff -->
                <svg xmlns="http://www.w3.org/2000/svg" version="1.1" class="goo-outer">
                <defs>
                <filter id="goo">
                    <fegaussianblur in="SourceGraphic" stddeviation="6" result="blur"></fegaussianblur>
                    <fecolormatrix in="blur" values="1 0 0 0 0  0 1 0 0 0  0 0 1 0 0  0 0 0 18 -7" result="goo"></fecolormatrix>
                    <feblend in="SourceGraphic" in2="goo"></feblend>
                </filter>
                </defs>
                </svg>
            </div>
        </div>

        <!-- mobile header -->
        <header class="mobile-header-1">
            <div class="container">
                <!-- menu icon -->
                <div class="menu-icon d-inline-flex mr-4">
                    <button>
                        <span></span>
                    </button>
                </div>
                <!-- logo image -->
                <div class="site-logo">
                    <a href="IndexWithOutLogIn.jspjsp">
                        <img src="images\logo.svg" alt="Bolby">
                    </a>
                </div>
            </div>
        </header>

        <!-- desktop header -->
        <header class="desktop-header-1 d-flex align-items-start flex-column">

            <!-- logo image -->
            <div class="site-logo">
                <a href="IndexWithOutLogIn.jspjsp">
                    <img src="images\logo.svg" alt="Bolby">
                </a>
            </div>

            <!-- main menu -->
            <nav>
                <ul class="vertical-menu scrollspy">
                    <li class="active"><a href="IndexWithOutLogIn.jsp"><i class="icon-home"></i>Home</a></li>
                    <li><a href="IndexWithOutLogIn.jsp"><i class="icon-user-following"></i>About</a></li>
                    <li><a href="IndexWithOutLogIn.jsp"><i class="icon-briefcase"></i>Services</a></li>
                    <li><a href="IndexWithOutLogIn.jsp"><i class="icon-graduation"></i>Orientation</a></li>
                    <li><a href="IndexWithOutLogIn.jsp"><i class="icon-layers"></i>Courses</a></li>
                    <li><a href="IndexWithOutLogIn.jsp"><i class="icon-note"></i>Blog</a></li>
                    <!-- <li><a href="#contact"><i class="icon-bubbles"></i>Contact</a></li> -->
                </ul>
            </nav>

            <!-- site footer -->
            <div class="footer">
                <!-- copyright text -->
                <span class="copyright">© HHHT TEAM 2021.</span>
            </div>

        </header>
        <!-- Go to top button -->
        <main class="content">
            <div class="container">
                <form action="ProcessingServler" method="POST" class="form-group">
                    User Name:<input class="form-control" type="text" name="txtUsername" required/><br>
                    Password:<input class="form-control" id="txtPassword"type="password"  name="txtPassword" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required/><br>                    
                    Confirm Password:<input class="form-control" id="txtConfirmPassword" type="password" required/><br>
                    Avatar Link:<input class="form-control" type="text" name="txtAvatar" required/><br>
                    Email :<input class="form-control" type="text" name="txtEmail" required/><br>
                    Profile Title:<input class="form-control" type="text" name="txtTitle"  /><br>
                    Profile Description:<input class="form-control" type="text" name="txtProfileDesc" required/><br>
                    Full Name:<input class="form-control" type="text" name="txtFullname" required /><br>
                    <button class="btn btn-primary" type="submit" id="btnSubmit" value="addUser" name="action" >Add</button> 
                </form> 
            </div>

        </main>



        <a href="javascript:" id="return-to-top"><i class="fas fa-arrow-up"></i></a>

        <!-- SCRIPTS -->
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
        <script type="text/javascript">
                                $(function () {
                                    $("#btnSubmit").click(function () {
                                        var password = $("#txtPassword").val();
                                        var confirmPassword = $("#txtConfirmPassword").val();
                                        if (password != confirmPassword) {
                                            alert("Passwords do not match.");
                                            return false;
                                        }
                                        return true;
                                    });
                                });
        </script>
        <script src="js\jquery-1.12.3.min.js"></script>
        <script src="js\jquery.easing.min.js"></script>
        <script src="js\jquery.waypoints.min.js"></script>
        <script src="js\jquery.counterup.min.js"></script>
        <script src="js\popper.min.js"></script>
        <script src="js\bootstrap.min.js"></script>
        <script src="js\isotope.pkgd.min.js"></script>
        <script src="js\infinite-scroll.min.js"></script>
        <script src="js\imagesloaded.pkgd.min.js"></script>
        <script src="js\slick.min.js"></script>
        <script src="js\contact.js"></script>
        <script src="js\validator.js"></script>
        <script src="js\wow.min.js"></script>
        <script src="js\morphext.min.js"></script>
        <script src="js\parallax.min.js"></script>
        <script src="js\jquery.magnific-popup.min.js"></script>
        <script src="js\custom.js"></script>

    </body>
</html>
