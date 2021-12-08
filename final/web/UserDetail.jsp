

<%@page import="Model.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
                    <a href="index.jsp">
                        <img src="images\logo.svg" alt="Bolby">
                    </a>
                </div>
            </div>
        </header>

        <!-- desktop header -->
        <header class="desktop-header-1 d-flex align-items-start flex-column">

            <!-- logo image -->
            <div class="site-logo">
                <a href="index.jsp">
                    <img src="images\logo.svg" alt="Bolby">
                </a>
            </div>

            <!-- main menu -->
            <nav>
                <ul class="vertical-menu scrollspy">
                    <li><a href="Deposit.jsp"><i class="icon-wallet"></i>Deposit</a></li>
                    <li class="active"><a href="index.jsp"><i class="icon-home"></i>Home</a></li>
                    <li><a href="CoursesControl?index=1"><i class="icon-layers"></i>Courses</a></li>
                    <li><a href="LogOutServlet"><i class="icon-logout"></i>Sign out</a></li>

                    <!-- <li><a href="#contact"><i class="icon-bubbles"></i>Contact</a></li> -->
                </ul>
            </nav>

            <!-- site footer -->
            <div class="footer">
                <!-- copyright text -->
                <span class="copyright">© HHHT TEAM 2021.</span>
            </div>

        </header>
        <jsp:useBean id="userDAO" scope="page" class="dao.UsersDAO" />
        <jsp:setProperty name="userDAO" property="*"/>
        <c:set var="v" value="${userDAO.getUser(USERNAME)}"/>
        <jsp:useBean id="role" scope="page" class="dao.RoleDAO" />
        <jsp:setProperty name="role" property="*" />
        <c:set var="uROLE" value="${role.getList()}"/>
        <link href="css/userDetail.css" rel="stylesheet" type="text/css"/>
        <div class="row py-5 px-4">
            <div class="col-md-5 mx-auto">
                <!-- Profile widget -->
                <div class="bg-white shadow rounded overflow-hidden">
                    <div class="px-4 pt-0 pb-4 cover">
                        <div class="media align-items-end profile-head">
                            <div class="profile mr-3"><img src="${v.avatar}" alt="Your Avatar" width="130" class="rounded mb-2 img-thumbnail"><a href="ProcessingServler?action=EditUser&id=${v.id}" class="btn btn-outline-dark btn-sm btn-block">Edit profile</a></div>
                            <div><a href="ProcessingServler?action=ChangePassword&id=${v.id}" class="btn btn-outline-dark btn-sm btn-block">Change Password</a></div>
                            <div class="media-body mb-5 text-white">
                                <h4 class="mt-0 mb-0">${v.fullname}</h4>
                                <p class="small mb-4"> <i class="fas fa-user mr-1" ></i>${v.profileTitle}</p>
                                <p class="small mb-4"> <i class="fas fa-map-marker-alt mr-2"></i>Viet Nam</p>
                            </div>
                        </div>
                    </div>
                    <div class="bg-light p-4 d-flex justify-content-end text-center">
                        <ul class="list-inline mb-0">
                            <li class="list-inline-item">                    
                                <h5 class="font-weight-bold mb-0 d-block"></h5><small class="text-muted"> <i class="fas fa-eye"></i>${v.role}</small>
                            </li>
                        </ul>
                    </div>
                    <div class="px-4 py-3">
                        <h5 class="mb-0">About</h5>
                        <div class="p-4 rounded shadow-sm bg-light">
                            <p class="font-italic mb-0">${v.profileDescription}</p>
                        </div>
                    </div>            
                </div>
            </div>
        </div>
        <!--        <main class="content">
                    <div class="container">
                        <form class="form-group">
                            Id:
                            <input class="form-control" type="text" readonly name="txtUserId" value="${v.id}" />                   
                            User Name: 
                            <input class="form-control" type="text" readonly name="txtCourseName" value="${v.username}" />
                            Password: 
                            <input class="form-control" type="text" readonly name="txtCourseName" value="${v.password}" />
                            Avatar Link: 
                            <img class="card-img-top" src="${v.avatar}" alt="Card image cap">
                            <input class="form-control" type="text" readonly name="txtAvatar" value="${v.avatar}" />
                            Profile Title: 
                            <input class="form-control" type="text" readonly name="txtProfileTitle" value="${v.profileTitle}" />
                            Profile Description: 
                            <input class="form-control" type="text" readonly name="txtProfileDescription" value="${v.profileDescription}" />
                            Full Name: 
                            <input class="form-control" type="text" readonly name="txtFullname" value="${v.fullname}" />
                            Role
                            <input class="form-control" type="text" readonly name="txtRole" value="${v.role}" />
                            <br>
                            <a  href="ProcessingServler?action=EditUser&id=${v.id}">Update</a>
                        </form>   
                    </div>
        
        
        
        
                </main>-->


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
