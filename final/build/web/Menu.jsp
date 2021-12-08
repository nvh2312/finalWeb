<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--begin of menu-->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<nav class="navbar navbar-expand-md navbar-dark " style="background-color: #353353;">
    <div class="container">        
        <a class="navbar-brand" href="CoursesControl?index=1">Course</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        
        <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
            
            <form action="SearchControl?index=1" method="post">
                <input type="text" class="form-control"  placeholder="Search" value="${txtSearch}" name="txtSearch" size="12" style="height:45px">
<!--                <input value="${txtSearch}" class="searchBox" type="text" name="txtSearch" size="15" required>-->
                <input class="searchButton" type="hidden" name="btnGo" value="Go">
            </form>
        </div>
    </div>
</nav>
z