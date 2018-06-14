<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>后台登录</title>
    <meta name="author" content="DeathGhost" />
    <link rel="stylesheet" type="text/css" href="css/login.css" />
    <style>
        body {
            height: 100%;
            background: #1870a7;
            overflow: hidden;
        }

        canvas {
            z-index: -1;
            position: absolute;
        }
    </style>
    <script src="js/jquery.js"></script>
    <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
    <script src="js/Particleground.js"></script>
    <script>
        $(document).ready(function () {
            //粒子背景特效
            $('body').particleground({
                dotColor: '#40a4ce',
                lineColor: '#40a4ce'
            });
        });
    </script>
    <script type="text/javascript">
    	var url1 = window.top.location.href;
    	var url2 = window.location.href;
    	if (url1 != url2) {
			window.top.location.href = url2;
		}
    </script>
</head>
<body>
    <form runat="server" id="form1" target="_top" action="/LoginServlet" method="post">
        <dl class="admin_login">
            <dt style="color: white;">
                <strong>
                    <img style="width: 50px; margin-right: 10px;" src="img/logo.png" />重庆大学建筑文档管理系统
                </strong>
                <em>&nbsp;</em>
                <p style="color:red; font-size:14px; text-indent:54px;">${wrongInfo }</p>
            </dt>
            <dd class="user_icon">
                <input type="text" name="username" class="login_txtbx" placeholder="用户名" runat="server" value="" required minlength="3">
            </dd>
            <dd class="pwd_icon">
                <input type="password" name="password" class="login_txtbx" placeholder="密码" runat="server" value="" required minlength="6">
            </dd>
            <dd>
                <input type="submit" class="submit_btn" placeholder="帐号" value="登录">
            </dd>
            <dd>

                <p>© 2016-2026 MYRPLUS 版权所有</p>
                <p>重庆大学建筑学院</p>
            </dd>
        </dl>
    </form>
</body>
</html>