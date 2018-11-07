$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'census/censusapproval/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '户籍登记表id', name: 'censusRegisterId', index: 'census_register_id', width: 80 }, 			
			{ label: '受理编号', name: 'acceptNumber', index: 'accept_number', width: 80 }, 			
			{ label: '办理类型', name: 'approvalType', index: 'approval_type', width: 80 }, 			
			{ label: '办理地点', name: 'approvalPlace', index: 'approval_place', width: 80 }, 			
			{ label: '当前审核阶段(0户政大厅，1治安大队,2领导)', name: 'approvalStage', index: 'approval_stage', width: 80 }, 			
			{ label: '审核状态(0未审核，1驳回,2审核通过)', name: 'approvalStatus', index: 'approval_status', width: 80 }, 			
			{ label: '是否提交上级，0-否；1-是', name: 'ifSubmitSuperior', index: 'if_submit_superior', width: 80 }, 			
			{ label: '审核意见', name: 'approvalSuggestion', index: 'approval_suggestion', width: 80 }, 			
			{ label: '预约日期（保留字段，目前不用）', name: 'appointmentDate', index: 'appointment_date', width: 80 }, 			
			{ label: '审核时间', name: 'approvalTime', index: 'approval_time', width: 80 }, 			
			{ label: '流动人口表id', name: 'personFlowId', index: 'person_flow_id', width: 80 }, 			
			{ label: '警员id（操作人）', name: 'policeId', index: 'police_id', width: 80 }, 			
			{ label: '创建时间', name: 'createTime', index: 'create_time', width: 80 }, 			
			{ label: '修改时间', name: 'updateTime', index: 'update_time', width: 80 }, 			
			{ label: '删除标记1表示删除 0 表示未删除', name: 'deleteFlag', index: 'delete_flag', width: 80 }			
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
		censusApproval: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.censusApproval = {};
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
			var url = vm.censusApproval.id == null ? "census/censusapproval/save" : "census/censusapproval/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.censusApproval),
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
				    url: baseURL + "census/censusapproval/delete",
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
			$.get(baseURL + "census/censusapproval/info/"+id, function(r){
                vm.censusApproval = r.censusApproval;
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