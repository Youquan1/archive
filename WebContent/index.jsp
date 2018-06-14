<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>标签管理系统 - 首页</title>
		<meta name="keywords" content="Bootstrap模版,Bootstrap模版下载,Bootstrap教程,Bootstrap中文" />
		<meta name="description" content="站长素材提供Bootstrap模版,Bootstrap教程,Bootstrap中文翻译等相关Bootstrap插件下载" />
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
		<div class="navbar navbar-default" id="navbar">
			<script type="text/javascript">
			    try { ace.settings.check('navbar', 'fixed') } catch (e) { }
			</script>

			<div class="navbar-container" id="navbar-container">
				<div class="navbar-header pull-left">
					<a href="index.jsp" target="_top" class="navbar-brand">
						<small>
							<i class="icon-leaf"></i>
							建筑文档管理系统
						</small>
					</a><!-- /.brand -->
				</div><!-- /.navbar-header -->

				<div class="navbar-header pull-right" role="navigation">
					<ul class="nav ace-nav">

						<li class="light-blue">
							<a data-toggle="dropdown" href="#" class="dropdown-toggle">
								<img class="nav-user-photo" src="ACE/avatars/user.jpg" alt="Jason's Photo" />
								<span class="user-info" >
									<small>欢迎您：</small>
									${loginInfo }
								</span>

								<i class="icon-caret-down"></i>
							</a>

							<ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
								<li>
									<a href="/logout">
										<i class="icon-off"></i>
										退出
									</a>
								</li>
							</ul>
						</li>
					</ul><!-- /.ace-nav -->
				</div><!-- /.navbar-header -->
			</div><!-- /.container -->
		</div>

		<div class="main-container" id="main-container">
			<script type="text/javascript">
			    try { ace.settings.check('main-container', 'fixed') } catch (e) { }
			</script>

			<div class="main-container-inner">
				<a class="menu-toggler" id="menu-toggler" href="#">
					<span class="menu-text"></span>
				</a>

				<div class="sidebar" id="sidebar">
					<script type="text/javascript">
					    try { ace.settings.check('sidebar', 'fixed') } catch (e) { }
					</script>

					<ul class="nav nav-list">
						<li class="active">
							<a href="index.jsp">
								<i class="icon-dashboard"></i>
								<span class="menu-text"> 首页 </span>
							</a>
						</li>

						<li>
							<a href="#" class="dropdown-toggle">
								<i class="icon-text-width"></i>
								<span class="menu-text"> 项目管理 </span>

								<b class="arrow icon-angle-down"></b>
							</a>

							<ul class="submenu">
								<li>
									<a href="/SearchProjectServlet" target="mainFrame">
										<i class="icon-double-angle-right"></i>
										项目列表
									</a>
								</li>
								<li>
									<a href="AddProject.jsp" target="mainFrame">
										<i class="icon-double-angle-right"></i>
										添加项目
									</a>
								</li>
							</ul>
						</li>

						<li>
							<a href="#" class="dropdown-toggle">
								<i class="icon-list"></i>
								<span class="menu-text"> 用户管理 </span>

								<b class="arrow icon-angle-down"></b>
							</a>

							<ul class="submenu">
								<li>
									<a href="addUser.jsp" target="mainFrame">
										<i class="icon-double-angle-right"></i>
										新增用户
									</a>
								</li>

								<li>
									<a href="/SearchUserServlet" target="mainFrame">
										<i class="icon-double-angle-right"></i>
										用户列表
									</a>
								</li>
							</ul>
						</li>

						<li>
							<a href="#" class="dropdown-toggle">
								<i class="icon-desktop"></i>
								<span class="menu-text"> 系统设置 </span>

								<b class="arrow icon-angle-down"></b>
							</a>

							<ul class="submenu">
								<li>
									<a href="updatepassword.jsp" target="mainFrame">
										<i class="icon-double-angle-right"></i>
										修改密码
									</a>
								</li>
							</ul>
						</li>
					</ul><!-- /.nav-list -->

					<div class="sidebar-collapse" id="sidebar-collapse">
						<i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
					</div>

					<script type="text/javascript">
					    try { ace.settings.check('sidebar', 'collapsed') } catch (e) { }
					</script>
				</div>

				<div class="main-content">

                    <iframe id="mainFrame" name="mainFrame"  height="100%" width="100%" src="welcome.jsp"></iframe>

				</div><!-- /.main-content -->


			</div><!-- /.main-container-inner -->

		</div><!-- /.main-container -->


		<script src='ACE/js/jquery-2.0.3.min.js' type="text/javascript"></script>

		<script type="text/javascript">
		    if ("ontouchend" in document) document.write("<script src='ACE/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
		</script>
		<script src="ACE/js/bootstrap.min.js" type="text/javascript"></script>
		<script src="ACE/js/typeahead-bs2.min.js" type="text/javascript"></script>

		<script src="ACE/js/ace-elements.min.js" type="text/javascript"></script>
		<script src="ACE/js/ace.min.js" type="text/javascript"></script>

        <script type="text/javascript">
            $(function () {
                $(window).resize(function () {

                    var maxHeight = $(window).height();
                    var topHeight = $("#navbar").height();
                    var height = maxHeight - topHeight - 10;
                    $("#mainFrame").height(height);
                });
                $(window).resize();
            });
        </script>

</body>
</html>