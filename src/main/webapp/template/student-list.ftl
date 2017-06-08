<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>学生信息列表</title>
<#assign ctx = request.contextPath />
</head>

<link rel="stylesheet" href="${ctx}/css/style.css" />
<link rel="stylesheet" href="${ctx}/js/jqGrid/theme/jquery-ui.min.css" />
<link rel="stylesheet" href="${ctx}/js/jqGrid/theme/ui.jqgrid.css" />

<script language="javascript" src="${ctx}/js/jquery-3.1.1.min.js" ></script>
<script language="javascript" src="${ctx}/js/login.js" ></script>

<script language="javascript" src="${ctx}/js/jqGrid/js/jquery-ui.min.js" ></script>
<script language="javascript" src="${ctx}/js/jqGrid/js/i18n/grid.locale-cn.js" ></script>
<script language="javascript" src="${ctx}/js/jqGrid/js/jquery.jqGrid.js" ></script>

<script language="javascript" src="${ctx}/js/student/student-list.js" ></script>
<script language="javascript">
    var ctx = "${ctx}";
</script>
<body>
    <div class="content-wrap">
        <!-- jqGrid 表格 -->
        <table id="list"></table>
        <!-- 翻页导航栏 -->
        <div id="pager" class="pager"></div>
    </div>
</body>
</html>
