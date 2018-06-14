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

<style type="text/css">
.navbox ul {
	list-style: none;
	display: table;
}

.navbox ul li {
	float: left;
	margin-top: 12px;
	margin-right: 20px;
}

.navbox ul li a {
	display: block;
	padding-left: 20px;
	width: 230px;
	height: 100px;
	line-height: 100px;
	color: #fff;
	font-family: "Microsoft YaHei", "微软雅黑", "黑体";
	font-size: 30px;
	text-decoration: none;
	text-align: center;
}

.navbox ul li a:hover {
	background-color: #E56690;
}
</style>


</head>
<body>
	<div class="main-container" id="main-container">
		<div class="main-container-inner">
			<div class="breadcrumbs" id="breadcrumbs">
				<ul class="breadcrumb">
					<li>
						<i class="icon-home home-icon"></i><a href="welcome.jsp">首页</a>
					</li>
					<li><a href="welcome.jsp">系统设置</a> </li>
					<li class="active">修改密码</li>
				</ul>
				<!-- .breadcrumb -->
			</div>
			<div class="page-content">
				<div class="row">
					<div class="col-xs-12">
						<form role="form" class="form-horizontal" action="/UpdatePasswordServlet" method="post" id="updatePWform">
							<div class="form-group">
								<label class="col-xs-2 control-label no-padding-right" for="ProjectName"> 旧密码 </label>
								<div class="col-xs-10">
									<input class="col-xs-5" type="password" id="Text1" name="oldpw" />
									<span style="color:red;margin-left:5px;">${wrongOldPW}</span>
								</div>
							</div>
							<div class="space-4"></div>

							<div class="form-group">
								<label class="col-xs-2 control-label no-padding-right" for="ProjectName"> 新密码 </label>
								<div class="col-xs-10">
									<input class="col-xs-5" type="password" id="Text2" name="newpw" />
								</div>
							</div>
							<div class="space-4"></div>

							<div class="form-group">
								<label class="col-xs-2 control-label no-padding-right" for="ProjectName"> 确认密码 </label>
								<div class="col-xs-10">
									<input class="col-xs-5" type="password" id="Text3" name="confirmpw" />
								</div>
							</div>
							<div class="space-4"></div>

							<div class="form-group">
								<label class="col-xs-2 control-label no-padding-right" for="form-field-2"> </label>
								<div class="col-xs-10">
									<input type="submit" class="btn btn-primary" value="修改密码">
								</div>
							</div>
						</form>
					</div>
					<!-- /.row -->
				</div>
				<!-- /.page-content -->
			</div>
			<!-- /.main-container-inner -->
			<a href="#" id="btn-scroll-up"
				class="btn-scroll-up btn btn-sm btn-inverse"><i
				class="icon-double-angle-up icon-only bigger-110"> </i></a>
		</div>
	</div>
	<!-- /.main-container -->
	<script src='ACE/js/jquery-2.0.3.min.js' type="text/javascript"></script>
	<script type="text/javascript" src="ACE/js/jquery.validate.min.js"></script>
	<script type="text/javascript">
		if ("ontouchend" in document)
			document.write("<script src='ACE/js/jquery.mobile.custom.min.js'>"
					+ "<" + "/script>");
	</script>
	<script src="ACE/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="ACE/js/typeahead-bs2.min.js" type="text/javascript"></script>
	<script src="ACE/js/ace-elements.min.js" type="text/javascript"></script>
	<script src="ACE/js/ace.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="data.js"></script>
	<script type="text/javascript">
		var sourceColor;
		$(function() {
			$(".navbox a").hover(function() {
				sourceColor = $(this).css("background-color");
				$(this).css("background-color", "#003B5A");
			}, function() {
				$(this).css("background-color", sourceColor);
			});
		});
	</script>
		<script type="text/javascript">
	    	$(function(){
	    		$("#updatePWform").validate({
	        		rules:{
	        			oldpw:"required",
	        			newpw:{
	        				required:true,
	        				minlength:6
	        			},
	        			confirmpw:{
	        				required:true,
	        				minlength:6,
	        				equalTo:"#Text2"
	        			}
	        		},
	        		messages:{
	        			oldpw:" 旧密码不能为空",
	        			newpw:{
	        				required:" 新密码不能为空",
	        				minlength:" 密码长度不少于6位字符"
	        			},
	        			confirmpw:{
	        				required:" 确认密码不能为空",
	        				minlength:" 密码长度不少于6位字符",
	        				equalTo:" 两次输入的密码须相同"
	        			}
	        		}
	        	})
	    	})    	
		</script>
</body>
</html>
