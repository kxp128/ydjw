$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/task/list',
        datatype: "json",
        colModel: [			
			{ label: '任务类型', name: 'taskType', index: 'task_type', width: 80 ,
                formatter: function(value, options, row){
                    return value === 1 ? "普通任务":"常规任务";
                }},
			{ label: '任务状态', name: 'taskStatus', index: 'task_status', width: 80,
				formatter: function(value, options, row){
                return value === 1 ? "未完成":"已完成";
            } },
			{ label: '执行次数', name: 'executionTimes', index: 'execution_times', width: 80 }, 			
			{ label: '完成次数', name: 'completionTimes', index: 'completion_times', width: 80 }, 			
			{ label: '任务内容', name: 'taskContent', index: 'task_content', width: 80 }, 			
			{ label: '创建人名字', name: 'createPersonName', index: 'create_person_name', width: 80 },
			{ label: '创建时间', name: 'createTime', index: 'create_time', width: 80 },
			{ label: '修改时间', name: 'updateTime', index: 'update_time', width: 80 }, 			
			{ label: '任务开始时间', name: 'beginTime', index: 'begin_time', width: 80 }, 			
			{ label: '任务结束时间', name: 'endTime', index: 'end_time', width: 80 }
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});
var data_ztree;
var data_setting = {
    data: {
        simpleData: {
            enable: true,
            idKey: "id",
            pIdKey: "parentId",
            rootPId: -1
        },
        key: {
            url:"nourl"
        }
    },
    check:{
        enable:true,
        nocheckInherit:true,
        chkboxType:{ "Y" : "", "N" : "" }
    }
};
var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		task: {},
        submitFlag:true
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.task = {};
            vm.getPolice();
            vm.task.taskType=1;
		},
		update: function (event) {
			var id = getSelectedRow();
			if(id == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(id);
            vm.getPolice(id);
		},
		saveOrUpdate: function (event) {
            var nodes = data_ztree.getCheckedNodes(true);
            var executorIds = new Array();
            console.log("nodes:"+nodes)
            for(var i=0; i<nodes.length; i++) {
                console.log("node:"+nodes[i].id)
                executorIds.push(nodes[i].id);
            }
            vm.task.executorIds = executorIds;
			var url = vm.task.id == null ? "sys/task/save" : "sys/task/update";
            vm.task.endTime = $("#endTime").val();
            vm.task.beginTime= $("#beginTime").val();
            if (vm.submitFlag){
                vm.submitFlag = false;
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.task),
                    success: function(r){
                        vm.submitFlag = true;
                        if(r.code === 0){
                            alert('操作成功', function(index){
                                vm.reload();
                            });
                        }else{
                            alert(r.msg);
                        }
                    }
                });
            }else{
                alert("请不要重复提交!");
            }

		},
        getPolice: function(id) {
            //加载菜单树
            $.get(baseURL + "police/all/list", function(r){
                data_ztree = $.fn.zTree.init($("#dataTree"), data_setting, r.list);
                //展开所有节点
                data_ztree.expandAll(true);

                if(id != null){
                    vm.getInfo(id);
                }
            });
        },
		del: function (event) {
			var ids = getSelectedRows();
			if(ids == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: baseURL + "sys/task/delete",
                    contentType: "application/json",
				    data: JSON.stringify(ids),
				    success: function(r){
						if(r.code == 0){
							alert('操作成功', function(index){
								$("#jqGrid").trigger("reloadGrid");
							});
						}else{
							alert(r.msg);
						}
					}
				});
			});
		},
		getInfo: function(id){
			$.get(baseURL + "sys/task/info/"+id, function(r){
                vm.task = r.task;
                var deptIds = vm.task.executorIds;
                for(var i=0; i<deptIds.length; i++) {
                    var node = data_ztree.getNodeByParam("id", deptIds[i]);
                    data_ztree.checkNode(node, true, false);
                }
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
                page:page
            }).trigger("reloadGrid");
		}
    }

});

$('.form_date').datetimepicker({
    language:  'cn',
    weekStart: 1,
    todayBtn:  1,
    autoclose: 1,
    todayHighlight: 1,
    startView: 2,
    minView: 2,
    forceParse: 0
});

