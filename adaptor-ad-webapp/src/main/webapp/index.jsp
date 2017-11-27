<!DOCTYPE html>
<%--
 Copyright (c) 2017 KTH Royal Institute of Technology.

 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 and Eclipse Distribution License v. 1.0 which accompanies this distribution.

 The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 and the Eclipse Distribution License is available at
 http://www.eclipse.org/org/documents/edl-v10.php.

 Contributors:

  Andrew Berezovskyi - initial implementation

 This file is generated by org.eclipse.lyo.oslc4j.codegenerator
--%>

<%@page import="org.eclipse.lyo.oslc4j.core.OSLC4JUtils"%>
<%@page import="javax.ws.rs.core.UriBuilder"%>
<%@page import="java.net.URI"%>
<%--
Start of user code "indexBody"
TODO: Replace/adjust this default content as necessary.
All manual changes in this "protected" user code area will NOT be overwritten upon subsequent code generations.
To revert to the default generated content, delete all content in this file, and then re-generate.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Latest compiled and minified CSS -->
    <title>Adaptor home</title>

    <link href="<c:url value="/static/css/bootstrap-4.0.0-beta.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/static/css/adaptor.css"/>" rel="stylesheet">

    <script src="<c:url value="/static/js/jquery-3.2.1.min.js"/>"></script>
    <script src="<c:url value="/static/js/bootstrap-4.0.0-beta.min.js"/>"></script>
</head>
<body>
<div class="container">

    <div class="jumbotron">
        <h1 class="display-3">Adaptor home!</h1>
        <p class="lead">This is a homepage of the <em>ActiveDirectory Adaptor</em> that was generated using
            Eclipse Lyo Toolchain Designer.</p>
        <hr class="my-4">
        <p>In order to begin exploring it, start from the Service Provider Catalog to see the
            available Service Providers
            .</p>
        <p class="lead">
            <a class="btn btn-primary btn-lg" href="<%= UriBuilder.fromUri(OSLC4JUtils.getServletURI()).path("/catalog/singleton").build() %>" role="button">Service Provider
                Catalog</a>
        </p>
    </div>
</div>
</body>
</html>
<%--
End of user code
--%>
