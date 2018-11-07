$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'census/censusregisterattachment/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '监护人书面申请', name: 'guardianWrittenApplication', index: 'guardian_written_application', width: 80 }, 			
			{ label: '医学证明', name: 'medicalProof', index: 'medical_proof', width: 80 }, 			
			{ label: '生育服务证明', name: 'birthCertificate', index: 'birth_certificate', width: 80 }, 			
			{ label: '婴儿血型单', name: 'babyBloodType', index: 'baby_blood_type', width: 80 }, 			
			{ label: '父母双方的户口本', name: 'parentsAccount', index: 'parents_account', width: 80 }, 			
			{ label: '父母双方结婚证', name: 'parentsMarriageCertificate', index: 'parents_marriage_certificate', width: 80 }, 			
			{ label: '被投靠人书面申请', name: 'patronWrittenApplication', index: 'patron_written_application', width: 80 }, 			
			{ label: '结婚证', name: 'marriedCertificate', index: 'married_certificate', width: 80 }, 			
			{ label: '双方（投靠人，被投靠人）户口原件或户籍证明', name: 'borthCensusRegister', index: 'borth_census_register', width: 80 }, 			
			{ label: '双方（投靠人，被投靠人）身份证复印件', name: 'borthCard', index: 'borth_card', width: 80 }, 			
			{ label: '死亡证明', name: 'deathCertificate', index: 'death_certificate', width: 80 }, 			
			{ label: '户口本原件', name: 'censusRegister', index: 'census_register', width: 80 }, 			
			{ label: '创建时间', name: 'createTime', index: 'create_time', width: 80 }, 			
			{ label: '修改时间', name: 'updateTime', index: 'update_time', width: 80 }, 			
			{ label: '删除标记1表示删除 0 表示未删除', name: 'deleteFlag', index: 'delete_flag', width: 80 }, 			
			{ label: '备用字段1', name: 'spareField1', index: 'spare_field1', width: 80 }, 			
			{ label: '备用字段2', name: 'spareField2', index: 'spare_field2', width: 80 }, 			
			{ label: '备用字段3', name: 'spareField3', index: 'spare_field3', width: 80 }			
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
		censusRegisterAttachment: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.censusRegisterAttachment = {};
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
			var url = vm.censusRegisterAttachment.id == null ? "census/censusregisterattachment/save" : "census/censusregisterattachment/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.censusRegisterAttachment),
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
				    url: baseURL + "census/censusregisterattachment/delete",
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
			$.get(baseURL + "census/censusregisterattachment/info/"+id, function(r){
                vm.censusRegisterAttachment = r.censusRegisterAttachment;
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