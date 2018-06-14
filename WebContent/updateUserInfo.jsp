<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <title>标签管理系统 - 首页</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!-- basic styles -->
    <link href="ACE/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="ACE/css/font-awesome.min.css" />
    <!--[if IE 7]>
		  <link rel="stylesheet" href="ACE/css/font-awesome-ie7.min.css" />
		<![endif]-->
    <!-- page specific plugin styles -->
    <!-- fonts -->
    <!-- ace styles -->
    <link rel="stylesheet" href="ACE/css/ace.min.css" />
    <link rel="stylesheet" href="ACE/css/ace-rtl.min.css" />
    <link rel="stylesheet" href="ACE/css/ace-skins.min.css" />
    <!--[if lte IE 8]>
		  <link rel="stylesheet" href="ACE/css/ace-ie.min.css" />
		<![endif]-->
    <!-- inline styles related to this page -->
    <!-- ace settings handler -->
    <script src="ACE/js/ace-extra.min.js"></script>
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
		<script src="ACE/js/html5shiv.js"></script>
		<script src="ACE/js/respond.min.js"></script>
		<![endif]-->
</head>
<body>
    <div class="main-container" id="main-container">
        <div class="main-container-inner">
            <div class="breadcrumbs" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li><i class="icon-home home-icon"></i><a href="index.htm">首页</a> </li>
                    <li><a href="#">用户管理</a> </li>
                    <li class="active">用户信息修改</li>
                </ul>
                <!-- .breadcrumb -->
            </div>
            <div class="page-content">
                <div class="row">
                    <div class="col-xs-12">
                        <!-- PAGE CONTENT BEGINS -->
                        <div class="col-xs-12">
                            <!-- PAGE CONTENT BEGINS -->
                            <div class="hr-12"></div>


                            <div>
                            	<form action="/UpdateUserServlet" method="post">
                            	<input type="hidden" name="id" value="${user.id }"/>
	                                <table class="table table-hover table-bordered">
	                                    <thead>
	                                        <tr>
	                                            <th>用户名</th>
	                                            <th>手机号码</th>
	                                            <th>邮箱地址</th>
	                                            <th></th>
	                                        </tr>
	                                    </thead>
	                                    <tbody>
		                                        <tr>
		                                            <td><input type="text" name="username" value="${user.username }" required/></td>
		                                            <td><input type="text" name="phone" value="${user.phone }"/></td>
		                                            <td><input type="email" name="email" value="${user.email }"/></td>
		                                            <td>
		                                                <input type="submit" value="完成"/>
		                                            </td>
		                                        </tr>
	                                    </tbody>
	                                </table>
                                </form>
                            </div>

                            <!-- PAGE CONTENT ENDS -->
                        </div>
                        <!-- /.col -->
                    </div>
                    <!-- /.row -->
                </div>
                <!-- /.page-content -->
            </div>
            <!-- /.main-container-inner -->
            <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse"><i class="icon-double-angle-up icon-only bigger-110">
            </i></a>
        </div>
        <!-- /.main-container -->
        <script src='ACE/js/jquery-2.0.3.min.js' type="text/javascript"></script>
        <script type="text/javascript">
            if ("ontouchend" in document) document.write("<script src='ACE/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
        </script>
        <script src="ACE/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="ACE/js/typeahead-bs2.min.js" type="text/javascript"></script>
        <script src="ACE/js/ace-elements.min.js" type="text/javascript"></script>
        <script src="ACE/js/ace.min.js" type="text/javascript"></script>
        <script type="text/javascript">
 
        </script>
	</div>
</body>
</html>
