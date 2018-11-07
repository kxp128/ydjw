$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'census/queryCensusApprovalByPC',
		postData:{currentCensusType: 6},
        datatype: "json",
        colModel: [			
			{ label: '申请人姓名', name: 'name', index: 'name', width: 80 },
			{ label: '现在户口所在地', name: 'currentCensusRegisterPlace', index: 'current_census_register_place', width: 80 },
            { label: '与死亡人员关系', name: 'relation', index: 'relation', width: 80 },
            { label: '注销人姓名', name: 'cancelledPersonName', index: 'cancelled_person_name', width: 80 },
            { label: '注销人出生时间', name: function (obj) {
                return obj.cancelledPersonBirthDate==null?null:obj.cancelledPersonBirthDate.substring(0,11);
            }, index: 'cancelled_person_birth_date', width: 80 },
            { label: '注销人身份证号', name: 'cancelledPersonIdNumber', index: 'cancelled_person_id_number', width: 80 },
            { label: '注销人死亡原因', name: 'cancelledPersonCauseDeath', index: 'cancelled_person_cause_death', width: 80 },
            { label: '审核状态', name: 'approvalStatus', width: 80, formatter: function(value, options, row){
            	console.log(value);
                if(value== '0'){
                    return '<span class="label label-info">未审核</span>';
                }else if(value== '1'){
                    return '<span class="label label-danger">驳回</span>';
                }else if (value=='2'){
                    return '<span class="label label-success">审核通过</span>';
                }
            }},
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
		censusRegister: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.censusRegister = {};
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
			var url = vm.censusRegister.id == null ? "census/censusregister/save" : "census/censusregister/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.censusRegister),
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
				    url: baseURL + "census/censusregister/delete",
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
            $.get(baseURL + "census/queryCensusById?approvalStage=0&&id="+id, function(r){
                vm.censusRegister = r.result;
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{
                page:page
            }).trigger("reloadGrid");
		},
        pass :function () {
            vm.censusRegister.mapprovalStatus = 2;
            layer.confirm('是否递交给下一级审批？', {
                btn: ['否','是'] //按钮
            }, function(index){
                layer.close(index);
                vm.censusRegister.ifSubmitSuperior = 0;
                vm.censusRegister.approvalSuggestion="无";
                confirm('请带上备审原件及复印件到广元市经开分区公安分局进行办理入户。',function (index) {
                    vm.passEnd();
                });

            }, function(){
                vm.censusRegister.ifSubmitSuperior = 1;
                vm.censusRegister.approvalSuggestion="无";
                confirm('此次审核已提交到下一级审核。',function () {
                    vm.passEnd();
                });

            });
        },
        reject:function () {
            var suggestion = "请核对您的资料信息，再次提交申请。";
            vm.censusRegister.mapprovalStatus = 1;
            confirm(suggestion, function(index){
                vm.censusRegister.ifSubmitSuperior = 0;
                vm.censusRegister.approvalSuggestion=suggestion;
                vm.passEnd();
            });
        },
        passEnd:function () {
            var policeId= localStorage.getItem("policeId");
            var id = vm.censusRegister.id;
            var approvalStage  = vm.censusRegister.approvalStage;
            var approvalStatus = vm.censusRegister.mapprovalStatus;
            var ifSubmitSuperior = vm.censusRegister.ifSubmitSuperior;
            var approvalSuggestion = vm.censusRegister.approvalSuggestion;
            var data = {
                policeId:policeId,
                id:id,
                approvalStage:approvalStage,
                approvalStatus:approvalStatus,
                ifSubmitSuperior:ifSubmitSuperior,
                approvalSuggestion:approvalSuggestion
            };
            $.ajax({
                type: "POST",
                url: baseURL + "census/approvalCensus",
                data: data,
                success: function(r){
                    if(r.status === 0){
                        alert('操作成功', function(index){
                            vm.reload();
                        });
                    }else{
                        alert(r.msg);
                    }
                }
            });
        },
	}
});