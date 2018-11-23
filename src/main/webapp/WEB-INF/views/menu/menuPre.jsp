<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
  <head>
    <title>无线点餐后台</title>
    
    <link rel="stylesheet" type="text/css" href="<%=basePath %>bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath %>bootstrap/css/bootstrap-select.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath %>css/theme.css">
    <link rel="stylesheet" href="<%=basePath %>font-awesome/css/font-awesome.css">
    

	<script src="<%=basePath %>js/jquery-1.7.2.min.js" type="text/javascript"></script>
    <script src="<%=basePath %>bootstrap/js/bootstrap.js"></script>
    <script src="<%=basePath %>bootstrap/js/bootstrap-select.js"></script>
    <script src="<%=basePath %>bootstrap/js/bootstrap-file-input.js"></script>
   
    <link rel="stylesheet" href="<%=basePath %>bootstrap/css/bootstrap-switch.css" />
    <script src="<%=basePath %>bootstrap/js/bootstrap-switch.js"></script>


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
                            <li><a tabindex="-1" href="<%=basePath %>home.do?flag=grzx">个人中心</a></li>
                            <li class="divider"></li>
                            <li><a tabindex="-1" href="<%=basePath %>login.do?flag=logout">退出</a></li>
                        </ul>
                    </li>
                    
                </ul>
                <a class="brand" href="<%=basePath %>home.do?flag=home"><span class="first">无线点餐</span> <span class="second">后台</span></a>
        </div>
    </div>
    


    
    <div class="sidebar-nav">
        <form class="search form-inline">
            <input type="text" placeholder="Search...">
        </form>

        <a href="#dashboard-menu" class="nav-header" data-toggle="collapse"><i class="icon-dashboard"></i>首页</a>
        <ul id="dashboard-menu" class="nav nav-list collapse in">
            <li><a href="<%=basePath %>home.do?flag=home">报表</a></li>
            <li><a href="<%=basePath %>home.do?flag=grzx">个人中心</a></li>
        </ul>

        <a href="#table-menu" class="nav-header" data-toggle="collapse"><i class="icon-table"></i>餐桌
        </a>
        <ul id="table-menu" class="nav nav-list collapse">
            <li ><a href="<%=basePath %>table.do?flag=table">餐桌管理</a></li>
        </ul>

        <a href="#menu-menu" class="nav-header collapsed" data-toggle="collapse"><i class="icon-reorder"></i>菜谱
         </a>
        <ul id="menu-menu" class="nav nav-list collapse">
            <li ><a href="<%=basePath %>menu.do?flag=menu">菜谱管理</a></li>
        </ul>

        <a href="#order-menu" class="nav-header" data-toggle="collapse"><i class="icon-th-large"></i>订单</a>
        <ul id="order-menu" class="nav nav-list collapse">
            <li ><a href="<%=basePath %>order.do?flag=order">订单管理</a></li>
        </ul>
    </div>
    
    <!-- 内容 开始 -->
<div class="content">
        
        <div class="header">
            <h1 class="page-title">菜谱</h1>
        </div>
        
                <ul class="breadcrumb">
            <li><a href="<%=basePath %>home.do?flag=home">主页</a> <span class="divider">/</span></li>
            <li class="active">菜谱</li>
        </ul>

        <div class="container-fluid">
            <div class="row-fluid">
            <div class="page-header" ></div> 
            <div class="row-fluid">
            <div class="span1"></div>
            	<div class="span5">
					<h1>${menu.name}</h1>
					<img src="<%=basePath %>images/${menu.pic}" alt="" width="220" height="170">	
               </div>
               <div class="span6">  	
					<h2>
					<span class="label"> 价 格 : </span> 
					<span class="label label-success" >  ${menu.price}</span>
					</h2>
					<h2>
					<span class="label"> 类 型 : </span>
					</h2>
					
					<select id="mySelect" name="menutypes"  class="selectpicker show-tick"  data-size="4"  disabled>
						<c:forEach items="${menutypelist}" var="mtt">
						<c:if test="${menu.menutypetbl.id==mtt.id}">
						<option  value="${mtt.id}"  selected="selected">${mtt.name}</option>
						</c:if>
  						<c:if test="${menu.menutypetbl.id!=mtt.id}">
						<option  value="${mtt.id}"  >${mtt.name}</option>
						</c:if>
  						</c:forEach>
					</select>
					<h2>
					<span class="label"> 备 注 : </span> 
					</h2>
					<p class="text-success">${menu.remark}</p>
				
					
               </div>
			
               </div>
               <div class="form-actions">
								
								<a href="<%=basePath %>menu.do?flag=menu">
								<input type="button" class="btn" value="返  回">
							  </a>
				</div>

			<footer>
			<hr>
			<p class="pull-right">
				&copy; 2013.8 <a href="#" target="_blank"> shun_fzll</a>
			</p>
			</footer>
            </div>
        </div>
    </div>




			<script type="text/javascript">
			$('.selectpicker').selectpicker({
			      style: 'btn-info',
			      size: 4
			  });
			  
			$(document).ready(function(){ 
			$('#mySelect').change(function(){ 
			//alert($(this).children('option:selected').val()); 
			var p1=$(this).children('option:selected').val();//这就是selected的值 
			//改变隐藏域中的值
			$('#menutype').val(p1);
			//var p2=$('#menutype').val();
			//alert(p2)
			}) 
			}) 	
			$('input[type=file]').bootstrapFileInput();
		$('.file-inputs').bootstrapFileInput();		
			</script>
  </body>
</html>