$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/notice/list',
        datatype: "json",
        colModel: [			
			{ label: '标题', name: 'title', index: 'title', width: 80 },
			{ label: '创建人', name: 'creater', index: 'creater', width: 80 }, 			
			{ label: '内容', name: 'content', index: 'content', width: 80 }, 			
			{ label: '发布时间', name: 'publishTime', index: 'publish_time', width: 80 }, 			
			{ label: '创建时间', name: 'createTime', index: 'create_time', width: 80 }, 			

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

//数据树
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
		notice: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.notice = {};
			vm.getPolice();
		},
		update: function (event) {
			var id = getSelectedRow();
			if(id == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            vm.getPolice(id);
            vm.getInfo(id)
		},
		saveOrUpdate: function (event) {
            var nodes = data_ztree.getCheckedNodes(true);
            var policeIdList = new Array();
            console.log("nodes:"+nodes)
            for(var i=0; i<nodes.length; i++) {
            	console.log("node:"+nodes[i].id)
                policeIdList.push(nodes[i].id);
            }
            vm.notice.policeIdList = policeIdList;
			var url = vm.notice.id == null ? "sys/notice/save" : "sys/notice/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.notice),
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
				    url: baseURL + "sys/notice/delete",
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
			$.get(baseURL + "sys/notice/info/"+id, function(r){
                vm.notice = r.notice;
                var deptIds = vm.notice.policeIdList;
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