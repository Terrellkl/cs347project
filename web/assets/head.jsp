<%-- 

    Document   : head
    Created on : Nov 9, 2014, 2:57:17 PM
    Author     : terrelkl

--%>
<%@ page errorPage="stderror.jsp" %>
<!DOCTYPE html>
<html>
    <mt:secure/>
    <head>
        <title>TodoList</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="assets/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="assets/style.css">
        
    </head>
    <body>
        <div class="container">
            <div class="navbar navbar-inverse">
                <div class="navbar-header">
                    <a class="navbar-brand" href="index.jsp">Todo List</a>
                </div>  
                <div class="navbar-collapse collapse navbar-inverse-collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="dashboard.jsp">{User}'s Dashboard</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="login.jsp">Logged in ()</a></li>
                        <li><a href="logout.jsp">Logout</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-12">