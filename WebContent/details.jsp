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
            #searchbox dl dd span{margin-bottom:0px;text-decoration:underline;}
            .btn-search{height:30px;margin:0px;margin-top:-1px;line-height:30px;padding:0px;border-width:0px;width:80px;}
            
            #filebox{border:1px solid #E8E8E8;padding:0px;margin-top:30px;}
            #filebox dl{margin:0px;display:table;width:100%;}
            #filebox dl dt{border-bottom:1px solid #E8E8E8;padding:0px 0px 0px 15px;line-height:35px;}
            #filebox dl dd{float:left;margin:10px;}
            #filebox dl dd a{}
            #filebox dl dd a:hover{cursor:pointer;}
        </style>
	</head>

	<body>
		<div class="navbar navbar-default" id="navbar">
			<script type="text/javascript">
			    try { ace.settings.check('navbar', 'fixed') } catch (e) { }
			</script>

			<div class="navbar-container" id="navbar-container">
				<div class="navbar-header pull-left">
					<a href="projectList.jsp" class="navbar-brand">
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

                        <div class="page-header">
                            <h1>${pro.projectName }</h1>
                        </div>


                        <div id="searchbox">
                            <dl>
                                <dt>规模（公顷）</dt>
                                <dd>
                                    <span>${pro.proScope }</span>
                                </dd>
                            </dl>
                            <dl>
                                <dt>人口（万人）</dt>
                                <dd>
                                    <span>${pro.proPopulation }</span>
                                </dd>
                            </dl>
                            <dl class="other">
                                <dt>获奖情况</dt>
                                <dd>
                                    获奖等级：<span>${pro.proAwardLeavel }</span>
                                </dd>
                                <dd>
                                    颁奖年份：<span>${pro.proAwardYear }年</span>
                                </dd>
                                <dd>
                                    颁奖单位：<span>${pro.proAwardOrg }</span>
                                </dd>
                            </dl>
                            <dl class="other">
                                <dt>项目属性</dt>
                                <dd>
                                    地域信息：<span>${pro.appraiseArea }</span>
                                </dd>
                                <dd>
                                    合同编号：<span>${pro.appraiseDocNum }</span>
                                </dd>
                                <dd>
                                    项目负责人：<span>${pro.appraiseHead }</span>
                                </dd>
                                <dd>
                                    归档年度：<span>${pro.proArcYear }年</span>
                                </dd>
                            </dl>
                            <dl class="other">
                                <dt>评优申报材料</dt>
                                <dd>
                                    颁奖等级：<span>${pro.appraiseAwardLeavel }</span>
                                </dd>
                                <dd>
                                    颁奖年份：<span>${pro.appraiseAwardYear }年</span>
                                </dd>
                                <dd>
                                    颁奖单位：<span>${pro.appraiseAwardOrg }</span>
                                </dd>
                                <dd>
                                    项目主持人：<span>${pro.appraisePreside }</span>
                                </dd>
                            </dl>
                        
                        </div>
                        </div>

                    </div>
                </div>
                </div>




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

</body>
</html>
