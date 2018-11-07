$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'census/censusapprovalset/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '审核内容(1 户籍办理审批  2 流动人口办理审批。)', name: 'approvalSetContent', index: 'approval_set_content', width: 80 }, 			
			{ label: '审核层级(1 指1级，2  指2级...)', name: 'approvalSetTier', index: 'approval_set_tier', width: 80 }, 			
			{ label: '审核级别(1 当前为第一阶段  2 当前为第二阶段...)', name: 'approvalSetLevel', index: 'approval_set_level', width: 80 }, 			
			{ label: '审核人员', name: 'approvalSetPerson', index: 'approval_set_person', width: 80 }, 			
			{ label: '编号', name: 'approvalSetNumber', index: 'approval_set_number', width: 80 }, 			
			{ label: '所属派出所', name: 'policeStation', index: 'police_station', width: 80 }, 			
			{ label: '所属警务室', name: 'policeOffice', index: 'police_office', width: 80 }, 			
			{ label: '所属工作站', name: 'workStation', index: 'work_station', width: 80 }, 			
			{ label: '所属行政区划', name: 'administrativeDivision', index: 'administrative_division', width: 80 }, 			
			{ label: '创建时间', name: 'createTime', index: 'create_time', width: 80 }, 			
			{ label: '修改时间', name: 'updateTime', index: 'update_time', width: 80 }, 			
			{ label: '删除标记1表示删除 0 表示未删除', name: 'deleteFlag', index: 'delete_flag', width: 80 }, 			
			{ label: '预留字段', name: 'spareField1', index: 'spare_field1', width: 80 }			
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

var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		censusApprovalSet: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.censusApprovalSet = {};
		},
		update: function (event) {
			var id = getSelectedRow();
			if(id == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(id)
		},
		saveOrUpdate: function (event) {
			var url = vm.censusApprovalSet.id == null ? "census/censusapprovalset/save" : "census/censusapprovalset/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.censusApprovalSet),
			    success: function(r){
			    	if(r.code === 0){
						alert('操作成功', function(index){
							vm.reload();
						});
					}else{
						alert(r.msg);
					}
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
				    url: baseURL + "census/censusapprovalset/delete",
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
			$.get(baseURL + "census/censusapprovalset/info/"+id, function(r){
                vm.censusApprovalSet = r.censusApprovalSet;
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