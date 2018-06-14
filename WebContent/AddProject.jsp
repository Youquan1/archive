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
                    <li><i class="icon-home home-icon"></i><a href="welcome.jsp">首页</a> </li>
                    <li><a href="welcome.jsp">项目管理</a> </li>
                    <li class="active">新增项目</li>
                </ul>
                <!-- .breadcrumb -->
            </div>
            <div class="page-content">
                <div class="row">
                    <div class="col-xs-12">
                        <!-- PAGE CONTENT BEGINS -->
                        <div class="col-xs-12">
                            <!-- PAGE CONTENT BEGINS -->
                            <form role="form" class="form-horizontal" action="/AddProjectServlet" method="post">
                            <div class="form-group">
                                <label for="form-field-1" class="col-xs-2 control-label no-padding-right">
                                    项目名称
                                </label>
                                <div class="col-xs-10">
                                    <input type="text" class="col-xs-8" placeholder="项目名称" id="form-field-1" name="projectName" required/>
                                    <span class="help-inline col-xs-4" style="margin-top: 4px;"><span class="middle">项目名称不能为空</span>
                                    </span>
                                </div>
                            </div>
                            <div class="space-4">
                            </div>
                            <div class="form-group">
                                <label for="ddlCate1" class="col-xs-2 control-label no-padding-right">
                                    文档分类
                                </label>
                                <div class="col-xs-10">
                                    <select class="col-xs-8" name="categoryId">
                                    <option value="1">城市设计<option>
                                    <option value="2">规划研究<option>
                                    <option value="3">专项规划<option>
                                    <option value="4">村镇规划<option>
                                    <option value="5">景观规划<option>
                                    </select>
                                </div>
                            </div>
                            <div class="space-4">
                            </div>
                            <div class="form-group has-error">
                                <label for="Text12" class="col-xs-2 control-label no-padding-right">
                                    项目属性
                                </label>
                                <div class="col-xs-10">
                                    <div class="row">
                                        <div class="col-xs-8">
                                            <div class="row">
                                                <div class="col-xs-6">
                                                    <div class="input-group">
                                                        <span class="input-group-addon">项目地域 </span>
                                                        <input class="form-control" type="text" id="Text12" name="proArea"/>
                                                    </div>
                                                </div>
                                                <div class="col-xs-6">
                                                    <div class="input-group">
                                                        <span class="input-group-addon">合同编号 </span>
                                                        <input class="form-control" type="text" id="Text2" name="proDocNo"/>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="space-4">
                                            </div>
                                            <div class="row">
                                                        <div class="col-xs-6">
                                                            <div class="input-group">
                                                                <span class="input-group-addon" >规模</span>
                                                                <input class="form-control" type="text" id="Text8" name="proScope"/>
                                                                <span class="input-group-addon" ><span id="spunion">平方公里</span></span>
                                                            </div>
                                                        </div>
                                                        <div class="col-xs-6">
                                                            <div class="input-group">
                                                                <span class="input-group-addon">人口 </span>
                                                                <input class="form-control" type="text" id="Text9" name="proPopulation"/>
                                                                <span class="input-group-addon" title="项目负责人">万人</span>
                                                            </div>
                                                        </div>
                                                <div class="col-xs-4">
                                                    <span class="help-inline" style="margin-top: 4px;"><span class="middle"></span></span>
                                                </div>
                                            </div>
                                            <div class="space-4">
                                            </div>
                                            <div class="row">
                                                <div class="col-xs-4">
                                                    <div class="input-group">
                                                        <span class="input-group-addon" title="项目负责人">负&nbsp;&nbsp;责&nbsp;&nbsp;人 </span>
                                                        <input class="form-control" type="text" id="Text3" name="proHead"/>
                                                    </div>
                                                </div>
                                                <div class="col-xs-4">
                                                    <div class="input-group">
                                                        <span class="input-group-addon">立项时间 </span>
                                                        <input class="form-control" type="text" id="Text19" placeholder="4位年份" name="proYear"/>
                                                    </div>
                                                </div>
                                                <div class="col-xs-4">
                                                    <div class="input-group">
                                                        <span class="input-group-addon">归档年度 </span>
                                                        <input class="form-control" type="text" id="Text1" placeholder="4位年份" name="proArcYear"/>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="space-4">
                                            </div>
                                            <div class="row">
                                                <div class="col-xs-4">
                                                    <div class="input-group">
                                                        <span class="input-group-addon">颁奖年份 </span>
                                                        <input class="form-control" type="text" id="Text7" name="proAwardYear"/>
                                                    </div>
                                                </div>
                                                <div class="col-xs-4">
                                                    <div class="input-group">
                                                        <span class="input-group-addon">颁奖等级 </span>
                                                        <input class="form-control" type="text" id="Text10" name="proAwardLeavel"/>
                                                    </div>
                                                </div>
                                                <div class="col-xs-4">
                                                    <div class="input-group">
                                                        <span class="input-group-addon">颁奖单位 </span>
                                                        <input class="form-control" type="text" id="Text11" name="proAwardOrg"/>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <span class="help-inline col-xs-4" style="margin-top: 4px;"><span class="middle"></span>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="space-4">
                            </div>
                            <div class="form-group has-info">
                                <label for="Text13" class="col-xs-2 control-label no-padding-right">
                                    评优申报材料
                                </label>
                                <div class="col-xs-10">
                                    <div class="row">
                                        <div class="col-xs-8">
                                            <div class="row">
                                                <div class="col-xs-6">
                                                    <div class="input-group">
                                                        <span class="input-group-addon">项目地域 </span>
                                                        <input class="form-control" type="text" id="Text13" name="appraiseArea"/>
                                                    </div>
                                                </div>
                                                <div class="col-xs-6">
                                                    <div class="input-group">
                                                        <span class="input-group-addon" title="项目负责人">项目负责人 </span>
                                                        <input class="form-control" type="text" id="Text5" name="appraiseHead"/>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="space-4">
                                            </div>
                                            <div class="row">
                                                <div class="col-xs-6">
                                                    <div class="input-group">
                                                        <span class="input-group-addon">合同编号 </span>
                                                        <input class="form-control" type="text" id="Text4" name="appraiseDocNum"/>
                                                    </div>
                                                </div>
                                                <div class="col-xs-6">
                                                    <div class="input-group">
                                                        <span class="input-group-addon">项目主持人 </span>
                                                        <input class="form-control" type="text" id="Text6" name="appraisePreside"/>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="space-4">
                                            </div>
                                            <div class="row">
                                                <div class="col-xs-4">
                                                    <div class="input-group">
                                                        <span class="input-group-addon">颁奖年份 </span>
                                                        <input class="form-control" type="text" id="Text14" name="appraiseAwardYear"/>
                                                    </div>
                                                </div>
                                                <div class="col-xs-4">
                                                    <div class="input-group">
                                                        <span class="input-group-addon">颁奖等级 </span>
                                                        <input class="form-control" type="text" id="Text15" name="appraiseAwardLeavel"/>
                                                    </div>
                                                </div>
                                                <div class="col-xs-4">
                                                    <div class="input-group">
                                                        <span class="input-group-addon">颁奖单位 </span>
                                                        <input class="form-control" type="text" id="Text16" name="appraiseAwardOrg"/>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <span class="help-inline col-xs-4" style="margin-top: 4px;"><span class="middle"></span>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="space-4">
                            </div>
                            <div class="form-group has-success">
                                <label for="Text17" class="col-xs-2 control-label no-padding-right">
                                    研究资料
                                </label>
                                <div class="col-xs-10">
                                    <div class="row">
                                        <div class="col-xs-8">
                                            <div class="row">
                                                <div class="col-xs-6">
                                                    <div class="input-group">
                                                        <span class="input-group-addon" title="项目负责人">课题名称</span>
                                                        <input class="form-control" type="text" id="Text17" name="subjectName"/>
                                                    </div>
                                                </div>
                                                <div class="col-xs-6">
                                                    <div class="input-group">
                                                        <span class="input-group-addon">课题主持人 </span>
                                                        <input class="form-control" type="text" id="Text18" name="subjectHost"/>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xs-4">
                                            <span class="help-inline" style="margin-top: 4px;"><span class="middle"></span></span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="hr-2">
                            </div>
                            <div class="form-group">
                                <label for="form-field-2" class="col-xs-2 control-label no-padding-right">
                                </label>
                                <div class="col-xs-10">
                                    <input type="submit" value="保存项目信息" class="btn btn-primary" />
                                </div>
                            </div>
                            </form>
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
        <script type="text/javascript" src="data.js"></script>
        <script type="text/javascript">





        </script>
	</div>
</body>
</html>
