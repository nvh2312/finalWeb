
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
                    <a href="index.html">
                        <img src="images\logo.svg" alt="Bolby">
                    </a>
                </div>
            </div>
            <a href="../src/java/controller/AddCourseServlet.java"></a>
        </header>

        <!-- desktop header -->
        <header class="desktop-header-1 d-flex align-items-start flex-column">

            <!-- logo image -->
            <div class="site-logo">
                <a href="index.html">
                    <img src="images\logo.svg" alt="Bolby">
                </a>
            </div>

            <!-- main menu -->
            <nav>
                <ul class="vertical-menu scrollspy">
                    <li class="active"><a href="index.jsp"><i class="icon-home"></i>Home</a></li>
                    <li><a href="UserDetail.jsp"><i class="icon-user"></i>User</a></li> 
                </ul>
            </nav>

            <!-- site footer -->
            <div class="footer">
                <!-- copyright text -->
                <span class="copyright">© HHHT TEAM 2021.</span>
            </div>

        </header>
        <a href="javascript:" id="return-to-top"><i class="fas fa-arrow-up"></i></a>

    <body>

        <h1 class="text-center">Change Password</h1>

        <c:set var="UID" value="${USER.id}"/>
        <c:if test="${param.txtUserId!=null}">
            <c:set var="UID" value="${param.txtUserId}"/>
        </c:if>

        <c:set var="NAME" value="${USER.username}"/>
        <c:if test="${param.txtUsername!=null}">
            <c:set var="NAME" value="${param.txtUsername}"/>
        </c:if>
        <c:set var="PASS" value="${USER.password}"/>
        <c:if test="${param.txtOldPassword!=null}">
            <c:set var="PASS" value="${param.txtOldPassword}"/>
        </c:if>
        <c:set var="NPASS" value="${USER.password}"/>
        <c:if test="${param.txtNewPassword!=null}">
            <c:set var="PASS" value="${param.txtNewPassword}"/>
        </c:if>

        <c:set var="AVATAR" value="${USER.avatar}"/>
        <c:if test="${param.txtAvatar!=null}">
            <c:set var="AVATAR" value="${param.txtAvatar}"/>
        </c:if>

        <c:set var="TITLE" value="${USER.profileTitle}"/>
        <c:if test="${param.txtProfileTitle!=null}">
            <c:set var="TITLE" value="${param.txtProfileTitle}"/>
        </c:if>

        <c:set var="UDESC" value="${USER.profileDescription}"/>
        <c:if test="${param.txtProfileDescription!=null}">
            <c:set var="UDESC" value="${param.txtTeacherName}"/>
        </c:if>
        <c:set var="FULLNAME" value="${USER.fullname}"/>
        <c:if test="${param.txtFullname!=null}">
            <c:set var="FULLNAME" value="${param.txtCourseDescription}"/>
        </c:if>
        <c:set var="ROLE" value="${USER.role}"/>
        <c:if test="${param.txtRole!=null}">
            <c:set var="ROLE" value="${param.txtRole}"/>
        </c:if>     

        <div class="container">
            <form action="ChangePasswordServlet" method="POST" class="form-group">   

                <!--                New Password:
                                <input class="form-control" type="text" value="${NPASS}" name="txtNewPassword" /><br>    -->
                User ID: 
                <input class="form-control" type="text" value="${UID}" readonly name="txtUserId" /><br> 
                Full Name: 
                <input class="form-control" type="text" value="${FULLNAME}" readonly name="txtFullname" /><br>  
                Username: 
                <input class="form-control" type="text" value="${NAME}" readonly name="txtUsername" /><br>    
                Old Password: 
                <input class="form-control" type="text" value="${PASS}"   readonly name="txtOldPassword" /><br>
                New Password:
                <input class="form-control" type="text" value="${NPASS}"   name="txtNewPassword" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required /><br>
                <input  class="form-control"type="hidden" value="${AVATAR}"readonly name="txtAvatar" />               

                <input class="form-control" type="hidden" value="${TITLE}" readonly name="txtProfileTitle" /><br>     

                <input class="form-control" type="hidden" value="${UDESC}" readonly name="txtProfileDescription" /><br>                           

                <input class="form-control" type="hidden" value="${ROLE}" readonly name="txtRole" /><br>  
                <div class="alert alert-danger" role="alert" ${mess==null?"style='display:none;'":""}>
                    ${mess}
                </div>
                <input class="btn btn-primary" type="submit" value="ChangePassword" name="action" />

            </form>               
        </div>
    </body>
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
