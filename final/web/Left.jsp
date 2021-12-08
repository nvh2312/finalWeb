<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="col-sm-3">
                    <div class="card bg-light mb-3" >
                        <div class="card-header text-white text-uppercase" style="background-color: #353353;"><i class="fa fa-list"></i> Categories</div>
                        <ul class="list-group category_block" style="background-color: #353353;">
                            <c:forEach items="${listCate}" var="o">
                                <li class="list-group-item text-white ${tag == o.cate_id ? "active":""}"><a href="CategoryControl?ccid=${o.cate_id}">${o.cate_name}</a></li>
                            </c:forEach>

                        </ul>
                    </div>
                    <div class="card bg-light mb-3">
                        <div class="card-header bg-success text-white text-uppercase">New Course</div>
                        <div class="card-body">
                            <img class="img-fluid" src="${newCourse.courseImage}" />
                            <h5 class="card-title">${newCourse.courseName}</h5>
                            <p class="card-text">${newCourse.teacherName}</p>
                            <p class="bloc_left_price">${newCourse.fee} $</p>
                        </div>
                    </div>
                </div>