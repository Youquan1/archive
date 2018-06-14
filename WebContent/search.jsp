<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>项目文档管理系统 - 项目查询</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />

		<!-- basic styles -->

		<link href="ACE/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="ACE/css/font-awesome.min.css" />

		<!--[if IE 7]>
		  <link rel="stylesheet" href="ACE/css/font-awesome-ie7.min.css" />
		<![endif]-->

		<!-- page specific plugin styles -->

		<!-- fonts -->

        <link rel="stylesheet" href="ACE/css/jquery-ui-1.10.3.custom.min.css" />
		<link rel="stylesheet" href="ACE/css/chosen.css" />


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
            #searchbox{border:1px solid #E8E8E8;padding:0px;}
            #searchbox dl{display:table;padding:0px;margin:0px;border-bottom:1px dotted #EDEDED;width:100%;}
            #searchbox dl dt{background-color:#fff8fa;color:#f56293;width:150px;float:left;line-height:35px;padding-left:15px;margin-right:20px;}
            #searchbox dl dd{float:left;line-height:35px;margin:0px;padding:0px;margin-right:20px;}
            #searchbox dl dd div.checkbox{margin-top: 0px; margin-bottom: 0px;padding-left: 0px;}
            #searchbox a.focus{background-color:Purple;color:White;}
            #searchbox a.selected{background-color:#e73839;color:White;}
            #catebox a.cover{color:#ACACAC;}
            .btn-search{height:30px;margin:0px;margin-top:-1px;line-height:30px;padding:0px;border-width:0px;width:80px;}
            
            #rightbox{position:fixed;right:5px;top:50px;}
            #rightbox ul{list-style:none;margin:0px;padding:0px;}
            #rightbox ul li{margin:0px;padding:0px;}
            #rightbox ul li a{border:3px solid green;width:30px;display:block;font-size:15px;text-align:center;padding:10px 3px;text-decoration:none;margin-bottom:-3px;}
            #rightbox ul li a.active{color:#FFFFFF;background-color:red;font-weight:bold;border:3px solid purple;position:relative;z-index:888;}
            #rightbox ul li a:hover{color:#FFFFFF;background-color:#6f89c0;font-weight:bold;border:3px solid green;position:relative;z-index:999;}
        </style>
	</head>

	<body>
		<div class="navbar navbar-default" id="navbar">
			<script type="text/javascript">
			    try { ace.settings.check('navbar', 'fixed') } catch (e) { }
			</script>

			<div class="navbar-container" id="navbar-container">
				<div class="navbar-header pull-left">
					<a href="#" class="navbar-brand">
						<small>
							<i class="icon-leaf"></i>
							建筑文档查询系统
						</small>
					</a><!-- /.brand -->
				</div>
			</div><!-- /.container -->
		</div>

		<div class="main-container" id="main-container">
			<div class="main-container-inner">
				


                <div class="page-content">
                <div class="row">
                    <div class="col-xs-12">

                    <div class="container">


                        <div id="searchbox">
                            <dl>
                                <dt>项目名称</dt>
                                <dd>
                                    <input type="text" name="minScale" class="input-xxlarge" placeholder="项目名称、标签过滤" />
                                </dd>
                                <dd>
                                    <button type="submit" class="btn btn-primary btn-sm btn-search"> 搜  索 </button>
                                </dd>
                            </dl>
                            <dl>
                                <dt>规模</dt>
                                <dd>
                                    <input type="text" name="minScale" />
                                    <span>-</span>
                                    <input type="text" name="maxScale" />
                                </dd>
                            </dl>
                        
                        </div>

                        <div class="hr-16"></div>

                        <div>
                            <table class="table table-hover table-bordered">
                                    <thead>
                                        <tr>
                                            <th>项目名称</th>
                                            <th class="text-center" style="width:210px;">项目分类</th>
                                            <th class="text-center" style="width:110px">人口（万人）</th>
                                            <th class="text-center" style="width:110px">规模（公顷）</th>
                                            <th class="text-center">项目属性</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td><a href="details.htm">重庆七中图书馆承建项目</a></td>
                                            <td>
                                                <span class="text-danger">修建性详细规划</span>&nbsp;&nbsp;
                                                <span class="text-success">校园</span>
                                            </td>
                                            <td class="text-right">
                                                2.5
                                            </td>
                                            <td class="text-right">
                                                234
                                            </td>
                                            <td>
                                                <span>合同编号</span>
                                                <span>项目地域</span>
                                                <span>项目负责人</span>
                                                <span>归档年度</span>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><a href="details.htm">重庆七中图书馆承建项目</a></td>
                                            <td>
                                                <span class="text-danger">修建性详细规划</span>&nbsp;&nbsp;
                                                <span class="text-success">校园</span>
                                            </td>
                                            <td class="text-right">
                                                2.5
                                            </td>
                                            <td class="text-right">
                                                234
                                            </td>
                                            <td>
                                                <span>合同编号</span>
                                                <span>项目地域</span>
                                                <span>项目负责人</span>
                                                <span>归档年度</span>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><a href="details.htm">重庆七中图书馆承建项目</a></td>
                                            <td>
                                                <span class="text-danger">修建性详细规划</span>&nbsp;&nbsp;
                                                <span class="text-success">校园</span>
                                            </td>
                                            <td class="text-right">
                                                2.5
                                            </td>
                                            <td class="text-right">
                                                234
                                            </td>
                                            <td>
                                                <span>合同编号</span>
                                                <span>项目地域</span>
                                                <span>项目负责人</span>
                                                <span>归档年度</span>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><a href="details.htm">重庆七中图书馆承建项目</a></td>
                                            <td>
                                                <span class="text-danger">修建性详细规划</span>&nbsp;&nbsp;
                                                <span class="text-success">校园</span>
                                            </td>
                                            <td class="text-right">
                                                2.5
                                            </td>
                                            <td class="text-right">
                                                234
                                            </td>
                                            <td>
                                                <span>合同编号</span>
                                                <span>项目地域</span>
                                                <span>项目负责人</span>
                                                <span>归档年度</span>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><a href="details.htm">重庆七中图书馆承建项目</a></td>
                                            <td>
                                                <span class="text-danger">修建性详细规划</span>&nbsp;&nbsp;
                                                <span class="text-success">校园</span>
                                            </td>
                                            <td class="text-right">
                                                2.5
                                            </td>
                                            <td class="text-right">
                                                234
                                            </td>
                                            <td>
                                                <span>合同编号</span>
                                                <span>项目地域</span>
                                                <span>项目负责人</span>
                                                <span>归档年度</span>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><a href="details.htm">重庆七中图书馆承建项目</a></td>
                                            <td>
                                                <span class="text-danger">修建性详细规划</span>&nbsp;&nbsp;
                                                <span class="text-success">校园</span>
                                            </td>
                                            <td class="text-right">
                                                2.5
                                            </td>
                                            <td class="text-right">
                                                234
                                            </td>
                                            <td>
                                                <span>合同编号</span>
                                                <span>项目地域</span>
                                                <span>项目负责人</span>
                                                <span>归档年度</span>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><a href="details.htm">重庆七中图书馆承建项目</a></td>
                                            <td>
                                                <span class="text-danger">修建性详细规划</span>&nbsp;&nbsp;
                                                <span class="text-success">校园</span>
                                            </td>
                                            <td class="text-right">
                                                2.5
                                            </td>
                                            <td class="text-right">
                                                234
                                            </td>
                                            <td>
                                                <span>合同编号</span>
                                                <span>项目地域</span>
                                                <span>项目负责人</span>
                                                <span>归档年度</span>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                        </div>

                        </div>

                    </div>
                </div>
                </div>




			</div><!-- /.main-container-inner -->

		</div><!-- /.main-container -->


		<script src='ACE/js/jquery-2.0.3.min.js' type="text/javascript"></script>

		<script type="text/javascript">
		    if ("ontouchend" in document) 
		    	document.write("<script src='ACE/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
		</script>
		<script src="ACE/js/bootstrap.min.js" type="text/javascript"></script>
		<script src="ACE/js/typeahead-bs2.min.js" type="text/javascript"></script>


        <script src="ACE/js/jquery-ui-1.10.3.custom.min.js"></script>
		<script src="ACE/js/jquery.ui.touch-punch.min.js"></script>
		<script src="ACE/js/chosen.jquery.min.js"></script>
		<script src="ACE/js/fuelux/fuelux.spinner.min.js"></script>
		<script src="ACE/js/date-time/bootstrap-datepicker.min.js"></script>
		<script src="ACE/js/date-time/bootstrap-timepicker.min.js"></script>
		<script src="ACE/js/date-time/moment.min.js"></script>
		<script src="ACE/js/date-time/daterangepicker.min.js"></script>
		<script src="ACE/js/bootstrap-colorpicker.min.js"></script>
		<script src="ACE/js/jquery.knob.min.js"></script>
		<script src="ACE/js/jquery.autosize.min.js"></script>
		<script src="ACE/js/jquery.inputlimiter.1.3.1.min.js"></script>
		<script src="ACE/js/jquery.maskedinput.min.js"></script>
		<script src="ACE/js/bootstrap-tag.min.js"></script>

		<script src="ACE/js/ace-elements.min.js" type="text/javascript"></script>
		<script src="ACE/js/ace.min.js" type="text/javascript"></script>

        <script type="text/javascript" src="data.js"></script>

        <script type="text/javascript">
            
        </script>

</body>
</html>
