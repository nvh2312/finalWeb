
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
                    <a href="IndexWithOutLogIn.jsp">
                        <img src="images\logo.svg" alt="Bolby">
                    </a>
                </div>
            </div>
        </header>

        <!-- desktop header -->
        <header class="desktop-header-1 d-flex align-items-start flex-column">

            <!-- logo image -->
            <div class="site-logo">
                <a href="IndexWithOutLogIn.jsp">
                    <img src="images\logo.svg" alt="Bolby">
                </a>
            </div>

            <!-- main menu -->
            <nav>
                <ul class="vertical-menu scrollspy">
                    <li class="active"><a href="IndexWithOutLogIn.jsp"><i class="icon-home"></i>Home</a></li>			
                </ul>
            </nav>

            <!-- site footer -->
            <div class="footer">
                <!-- copyright text -->
                <span class="copyright">© HHHT TEAM 2021.</span>
            </div>

        </header>
        <section id="signin">
            <div class="container">

                
                <h2 class="section-title wow fadeInUp" style="text-align:center" >Join with US</h2>

                <div class="spacer" data-height="60"></div>

                <div class="row">

                    <div class="col-md-4">
                        contact info 
                        <div class="contact-info">
                            <h3 class="wow fadeInUp">Let's talk about everything!</h3>
                            <p class="wow fadeInUp">Don't like forms? Send me an <a href="mailto:name@example.com">email</a>. 👋</p>
                        </div>
                    </div>
                    <div class="col-md-8">
                        <form  action="ProcessingServler" method="POST" class="form-group">

                            <div class="column col-md-6">
                                Username<input class="form-control" type="text" name="txtUsername" placeholder="User Name" required="required" data-error="Name is required."><br>
                            </div>
                            <div class="column col-md-6">
                                Password<input class="form-control" type="password" name="txtPassword" placeholder="Password" required="required" data-error="Password is required."><br>
                            </div>
                            <div>
                                ${MSG}<br>
                            </div>

                            <button  type="submit" name="action" value="Login" class="btn btn-default column col-md-6" style="text-align: center;">Login</button>
                            <h6>Not a member?</h6><a href="SignUp.jsp">Create an account</a>
                        </form>

                    </div>

                </div>




        </section>




        <div class="spacer" data-height="96"></div>

    </main>

    <!-- Go to top button -->
    <a href="javascript:" id="return-to-top"><i class="fas fa-arrow-up"></i></a>

    <!-- SCRIPTS -->
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