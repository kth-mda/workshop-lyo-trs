<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html><%--
 Copyright (c) 2011, 2012 IBM Corporation and others.

 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 and Eclipse Distribution License v. 1.0 which accompanies this distribution.

 The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 and the Eclipse Distribution License is available at
 http://www.eclipse.org/org/documents/edl-v10.php.

 Contributors:

  Andrii Berezovskyi - initial implementation of a sample delegated UI client

 This file is generated by org.eclipse.lyo.oslc4j.codegenerator
--%>
<%@page import="org.eclipse.lyo.oslc4j.core.model.ServiceProvider" %>
<%--
Start of user code imports
--%>
<%--
End of user code
--%>
<%@ page contentType="text/html" language="java" pageEncoding="UTF-8" %>
<%
  String selectionDialogUri = request.getParameter("selectionUri");
  selectionDialogUri += "#oslc-core-postMessage-1.0";
%>
<%--
Start of user code getRequestAttributes
--%>
<%--
End of user code
--%>
<html>
<head>
  <title>Selection Dialog client</title>
  <link href="<c:url value="/static/css/bootstrap-4.0.0-beta.min.css"/>" rel="stylesheet">
  <link href="<c:url value="/static/css/adaptor.css"/>" rel="stylesheet">

  <script src="<c:url value="/static/js/jquery-3.2.1.min.js"/>"></script>
  <script src="<c:url value="/static/js/popper-1.11.0.min.js"/>"></script>
  <script src="<c:url value="/static/js/bootstrap-4.0.0-beta.min.js"/>"></script>
</head>
<body>

<nav class="navbar sticky-top navbar-light bg-light">
  <div class="container">
    <a class="navbar-brand" href="<c:url value="/services/catalog/singleton"/>">User Directory Adaptor</a>
  </div>
</nav>

<div class="container">

  <div class="page-header">
    <h1>Selection Dialog client</h1>
  </div>

  <div class="row">
    <div class="col-md-6 col-md-offset-3">
      <div class="panel panel-primary">
        <div class="panel-heading">Selection Dialog frame</div>
        <div class="panel-body">
          <iframe src="<%= selectionDialogUri %>" id="delegatedUI"></iframe>
        </div>
        <div class="panel-footer">
          <p>URI: <em style="word-wrap:break-word;"><%= selectionDialogUri %></em></p>
        </div>
      </div>
    </div>
  </div>

  <div class="row">
    <div class="col-md-6 col-md-offset-3">
      <div class="panel panel-success">
        <div class="panel-heading">Selection Dialog results</div>
        <div class="panel-body" id="results">
            <ul></ul>
        </div>
      </div>
    </div>
  </div>

</div>

<footer class="footer">
  <div class="container">
    <p class="text-muted">
      OSLC Adaptor was generated using <a href="http://eclipse.org/lyo">Eclipse Lyo</a> 2.3.0.M2.
    </p>
  </div>
</footer>

<script type="text/javascript">
  $(function () {
    function handleMessage(message) {
            var resultsUl = document.querySelector('#results ul')
            while(resultsUl.hasChildNodes()) {
              resultsUl.removeChild(resultsUl.lastChild)
            }
      var results = JSON.parse(message)["oslc:results"];
      for (var item in results) {
          var aResult = {
            label: results[item]["oslc:label"],
            uri: results[item]["rdf:resource"]
          }
          handleOslcSelection(aResult);
      }
    }

    function handleOslcSelection(resource) {
      $("#results ul").append('<li><a href="' + resource.uri + '"><span>' + resource.label + '</span></a></li>');
    }

    window.addEventListener('message', function (e) {
      var HEADER = "oslc-response:";
      if (e.source == document.getElementById("delegatedUI").contentWindow
          && e.data.indexOf(HEADER) == 0) {
        handleMessage(e.data.slice(HEADER.length));
      }
    }, false);
  });
</script>

</body>
</html>
