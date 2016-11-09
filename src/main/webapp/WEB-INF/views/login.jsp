<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="icon" href="/resources/img/train.png">
    <title>Login</title>
    <link href="<c:url value='/resources/css/bootstrap.css' />"  rel="stylesheet"/>
    <link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />
</head>
<body>
<div id="mainWrapper">
    <div class="login-container">
        <div class="login-card">
            <div class="login-form">
                <c:url var="loginUrl" value="/login" />
                <form action="${loginUrl}" method="post" class="form-horizontal">
                    <c:if test="${param.error != null}">
                        <div class="alert alert-danger">
                            <p>Invalid username and password.</p>
                        </div>
                    </c:if>
                    <c:if test="${param.logout != null}">
                        <div class="alert alert-success">
                            <p>You have been logged out successfully.</p>
                        </div>
                    </c:if>
                    <div class="input-group input-sm">
                        <label class="input-group-addon" for="username"><i class="fa fa-user"></i></label>
                        <input type="text" class="form-control" id="username" name="userLogin" placeholder="Enter Username" required>
                    </div>
                    <div class="input-group input-sm">
                        <label class="input-group-addon" for="password"><i class="fa fa-lock"></i></label>
                        <input type="password" class="form-control" id="password" name="password" placeholder="Enter Password" required>
                    </div>
                    <input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />

                    <div class="form-actions">
                        <input type="submit"
                               class="btn btn-block btn-primary btn-default" value="Log in">
                    </div>
                </form>
            </div>
        </div>
    </div>
</div><%--
<div class="row"></div>
<div class="row"></div>
<div class="row"></div>
<div class="container z-depth-3">
    <div class="card-panel teal lime">
        <form action="/login" method="POST" >
            <h3 class="center-align white-text">PLEASE LOG IN</h3>
            <c:if test="${param.error != null}">
                <p>
                    Invalid username and password.
                </p>
            </c:if>
            <p class="teal-text lighten-2"><b>Login</b></p>
            <c:choose>
                <c:when test="${!empty errorLog}">
                    <input type="text" name="login">
                    <span class="red-text"><b><i><sup><c:out value="${errorLog}"/></sup></i></b></span>
                </c:when>
                <c:otherwise>
                    <input type="text" name="login" >
                </c:otherwise>
            </c:choose>

            <p class="teal-text lighten-2"><b>Password</b></p>
            <c:choose>
                <c:when test="${!empty errorPas}">
                    <input type="password" name="password">
                    <span class="red-text"><b><i><sup><c:out value="${errorPas}"/></sup></i></b></span>
                </c:when>
                <c:otherwise>
                    <input type="password" name="password">
                </c:otherwise>
            </c:choose>
            <div class="row">
                <div class="col s6">
                    <button type="submit" class="btn waves-light waves-effect">
                        Log in
                        <i class="material-icons right">send</i>
                    </button>
                </div>
                <div class="col s6 right-align">
                    <a href="/registration" class="btn waves-effect waves-light">Registration<i class="material-icons right">add</i></a>
                </div>
            </div>
        </form>
    </div>
</div>--%>
</body>
</html>
