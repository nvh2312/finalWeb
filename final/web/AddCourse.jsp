
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
                    <li class="active"><a href="index.jsp"><i class="icon-home"></i>Home</a></li>
                    
                </ul>
            </nav>

            <!-- site footer -->
            <div class="footer">
                <!-- copyright text -->
                <span class="copyright">© HHHT TEAM 2021.</span>
            </div>

        </header>
        <main class="content">
            <jsp:useBean id="cate" scope="page" class="dao.CategoryDAO" />
            <jsp:setProperty name="cate" property="*" />
            <c:set var="uCATEGORY" value="${cate.getList()}"/>
            <h1 class="text-center">Add Course!</h1>
            <div class="container">
                <form action="ProcessingServler" method="POST" class="form-group">
                    Course Name: 
                    <input class="form-control" type="text" name="txtCourseName" value="${param.txtCourseName}" />
                    Course Image Link: 
                    <input  class="form-control"type="text" name="txtCourseImage" value="${param.txtCourseImage}" />               
                    Course Fee: 
                    <input class="form-control" type="text" name="txtFee" value="${param.txtFee}" />
                    Course Duration: 
                    <input  class="form-control"type="text" name="txtCourseDuration" value="${param.txtCourseDuration}" /> 
                    Teacher Name: 
                    <input  class="form-control"type="text" name="txtTeacherName" value="${param.txtTeacherName}" /> 
                    Course Description: 
                    <input  class="form-control"type="text" name="txtCourseDescription" value="${param.txtCourseDescription}" />                     
                    Skill:
                    <select class="form-control" name="txtCategory">
                        <c:forEach items="${uCATEGORY}" var="crr">
                            <option ${param.txtCategory==crr.cate_id?"selected":""} value="${crr.cate_id}">${crr.cate_name}</option>
                        </c:forEach>
                    </select>
                    <div class="alert alert-danger" role="alert" ${mess==null?"style='display:none;'":""}>
                        ${mess}
                    </div>
                    <br>
                    <button  class="btn btn-primary"  type="submit" name="action" value="addCourse">Add</button>
                    <button  class="btn btn-secondary"  onclick="location.href = 'CoursesControl?index=1';return false;">Return to Courses</button>

                </form>
            </div>
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
