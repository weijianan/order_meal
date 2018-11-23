<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
  <head>
  	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>无线点餐后台</title>
    

    <link rel="stylesheet" type="text/css" href="<%=basePath %>bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath %>css/theme.css">
    <link rel="stylesheet" href="<%=basePath %>font-awesome/css/font-awesome.css">

	<script src="<%=basePath %>js/jquery-1.7.2.min.js" type="text/javascript"></script>
    <script src="<%=basePath %>bootstrap/js/bootstrap.js"></script>
   

    <!-- Demo page code -->

    <style type="text/css">
        #line-chart {
            height:300px;
            width:800px;
            margin: 0px auto;
            margin-top: 1em;
        }
        .brand { font-family: georgia, serif; }
        .brand .first {
            color: #ccc;
            font-style: italic;
        }
        .brand .second {
            color: #fff;
            font-weight: bold;
        }
    </style>

    
  </head>
  <body class=""> 
  <!--<![endif]-->
    
        <div class="navbar">
        <div class="navbar-inner">
                <ul class="nav pull-right">
                    
                    <li><a href="#" class="hidden-phone visible-tablet visible-desktop" role="button">设置</a></li>
                    <li id="fat-menu" class="dropdown">
                        <a href="#" role="button" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="icon-user"></i>${user.username}
                            <i class="icon-caret-down"></i>
                        </a>

                        <ul class="dropdown-menu">
                            <li><a tabindex="-1" href="<%=basePath %>grzx.jsp">个人中心</a></li>
                            <li class="divider"></li>
                            <li><a tabindex="-1" href="<%=basePath %>LogoutAction">退出</a></li>
                        </ul>
                    </li>
                    
                </ul>
                <a class="brand" href="<%=basePath %>index.jsp"><span class="first">无线点餐</span> <span class="second">后台</span></a>
        </div>
    </div>
    


    
    <div class="sidebar-nav">
        <form class="search form-inline">
            <input type="text" placeholder="Search...">
        </form>

        <a href="#dashboard-menu" class="nav-header" data-toggle="collapse"><i class="icon-dashboard"></i>首页</a>
        <ul id="dashboard-menu" class="nav nav-list collapse in">
            <li><a href="<%=basePath %>index.jsp">报表</a></li>
            <li><a href="<%=basePath %>grzx.jsp">个人中心</a></li>
        </ul>

        <a href="#table-menu" class="nav-header" data-toggle="collapse"><i class="icon-table"></i>餐桌
        </a>
        <ul id="table-menu" class="nav nav-list collapse">
            <li ><a href="<%=basePath %>TableAction">餐桌管理</a></li>
        </ul>

        <a href="#menu-menu" class="nav-header collapsed" data-toggle="collapse"><i class="icon-reorder"></i>菜谱
         </a>
        <ul id="menu-menu" class="nav nav-list collapse">
            <li ><a href="<%=basePath %>MenuAction">菜谱管理</a></li>
        </ul>

        <a href="#order-menu" class="nav-header" data-toggle="collapse"><i class="icon-th-large"></i>订单</a>
        <ul id="order-menu" class="nav nav-list collapse">
            <li ><a href="<%=basePath %>OrderAction">订单管理</a></li>
        </ul>
    </div>

    <!-- 内容 开始 -->
   <div class="content">
        
        <div class="header">
            
            <h1 class="page-title">个人中心</h1>
        </div>
        
                <ul class="breadcrumb">
            <li><a href="<%=basePath %>index.jsp">主页</a> <span class="divider">/</span></li>
            <li class="active">个人中心</li>
        </ul>

        <div class="container-fluid">
            <div class="row-fluid">
            
         <form id="tab" action="<%=basePath %>updateUser" method="post">               
			<div class="btn-toolbar">
    			<button class="btn btn-primary"><i class="icon-save"></i> 保存</button>
			</div>
		<div class="well">
    <ul class="nav nav-tabs">
      <li class="active"><a href="#home" data-toggle="tab">基本资料</a></li>
      <li><a href="#profile" data-toggle="tab">密码更改</a></li>
    </ul>
    <div id="myTabContent" class="tab-content">
      <div class="tab-pane active in" id="home">

        <input name="uid"  type="hidden" value="${login_user.id}">
        <label>用户名</label>
        <input name="uname"  type="text" value="${login_user.username}" class="input-xlarge">
        <label>真实姓名</label>
        <input  name="name"  type="text" value="${login_user.name}" class="input-xlarge">
        <label>性别</label>
        <input name="gender"  type="text" value="${login_user.gender}" class="input-xlarge">
        <label>权限</label>
        <input name="permission"  type="text" value="${login_user.permission}" class="input-xlarge">
        <label>备注</label>
        <input name="remark"  type="text" value="${login_user.remark}" class="input-xlarge">
        
    </form>
      </div>
      <div class="tab-pane fade" id="profile">
    <form id="tab2" action="<%=basePath %>updateUaerPass" method="post">
    	<input type="hidden" name="uid" value="${login_user.id}">
        <label>新密码</label>
        <input name="password" type="password" class="input-xlarge">
        <div>
            <button class="btn btn-primary">更改</button>
        </div>
    </form>
      </div>
  </div>

</div>
                    
                  <footer>
                        <hr>
                        <p class="pull-right">&copy; 2013.8 <a href="#" target="_blank"> shun_fzll</a></p>
                    </footer>
                    
            </div>
        </div>
    </div>
    <script type="text/javascript">
        $("[rel=tooltip]").tooltip();
        $(function() {
            $('.demo-cancel-click').click(function(){return false;});
        });
    </script>
  </body>
</html>
