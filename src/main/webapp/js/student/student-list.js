$(document).ready(function () {
    $('#list').jqGrid({
        url: ctx + '/student/query-list', // 获取数据的地址
        datatype: 'json', // 从服务器端返回的数据类型，默认xml。可选类型：xml，local，json，jsonnp，script，xmlstring，jsonstring，clientside
        mtype: 'POST', // 提交方式，默认为GET
        height: 'auto', // 高度，表格高度。可为数值、百分比或'auto'
        width: 1000, // 如果设置则按此设置为主，如果没有设置则按colModel中定义的宽度计算
        colNames: ['姓名', '性别', '邮箱', '生日', '学历', '状态', '入学时间'], // 列显示名称，是一个数组对象
        colModel: [
            // name 表示列显示的名称；index 表示传到服务器端用来排序用的列名称；width 为列宽度；align 为对齐方式；sortable 表示是否可以排序
            {name: 'name', index: 'name', width: '15%', align: 'center'},
            {name: 'sex', index: 'sex', width: '20%', align: 'center'},
            {name: 'email', index: 'email', width: '20%', align: 'center'},
            {name: 'birth', index: 'birth', width: '20%', align: 'center'},
            {name: 'education', index: 'education', width: '20%', align: 'center'},
            {name: 'status', index: 'status', width: '20%', align: 'center'},
            {name: 'entranceTime', index: 'entranceTime', width: '20%', align: 'center'}
        ],
        rownumbers: true,// 显示左侧的序号
        //altRows:true,// 设置为交替行表格,默认为false
        //sortname:'entranceTime', // 排序列的名称，此参数会被传到后台
        //sortorder:'asc', // 排序顺序，升序或者降序（ASC或DESC）
        viewrecords: true, // 是否在翻页导航栏显示记录总数
        rowNum: 5, // 每页显示记录数
        rowList: [5, 10, 15], // 用于改变显示行数的下拉列表框的元素数组
        pager: $('#pager') // 定义翻页用的导航栏
    });
    $('#list4').jqGrid('setLabel', 'rn', '序号'); // 为序号列命名
});