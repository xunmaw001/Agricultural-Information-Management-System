
var projectName = '农业信息管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '农业技术',
	url: './pages/nongyejishu/list.html'
}, 
{
	name: '农资产品',
	url: './pages/nongzichanpin/list.html'
}, 
{
	name: '农产品',
	url: './pages/nongchanpin/list.html'
}, 

{
	name: '农业政策',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssm4qh7y/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["新增","查看","修改","删除","查看评论"],"menu":"农业技术","menuJump":"列表","tableName":"nongyejishu"}],"menu":"农业技术管理"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["新增","查看","修改","删除"],"menu":"种植户","menuJump":"列表","tableName":"zhongzhihu"}],"menu":"种植户管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["新增","查看","修改","删除"],"menu":"农产品类型","menuJump":"列表","tableName":"nongchanpinleixing"}],"menu":"农产品类型管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["新增","查看","修改","删除"],"menu":"农资类型","menuJump":"列表","tableName":"nongzileixing"}],"menu":"农资类型管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["新增","查看","修改","删除","查看评论"],"menu":"农资产品","menuJump":"列表","tableName":"nongzichanpin"}],"menu":"农资产品管理"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["查看","修改","删除","查看评论"],"menu":"农产品","menuJump":"列表","tableName":"nongchanpin"}],"menu":"农产品管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","修改","删除"],"menu":"农资订单","menuJump":"列表","tableName":"nongzidingdan"}],"menu":"农资订单管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","修改","删除"],"menu":"农产品订单","menuJump":"列表","tableName":"nongchanpindingdan"}],"menu":"农产品订单管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"农业政策","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","查看评论"],"menu":"农业技术列表","menuJump":"列表","tableName":"nongyejishu"}],"menu":"农业技术模块"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看","查看评论","立即购买"],"menu":"农资产品列表","menuJump":"列表","tableName":"nongzichanpin"}],"menu":"农资产品模块"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","查看评论","立即购买"],"menu":"农产品列表","menuJump":"列表","tableName":"nongchanpin"}],"menu":"农产品模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","支付"],"menu":"农产品订单","menuJump":"列表","tableName":"nongchanpindingdan"}],"menu":"农产品订单管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","查看评论"],"menu":"农业技术列表","menuJump":"列表","tableName":"nongyejishu"}],"menu":"农业技术模块"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看","查看评论","立即购买"],"menu":"农资产品列表","menuJump":"列表","tableName":"nongzichanpin"}],"menu":"农资产品模块"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","查看评论","立即购买"],"menu":"农产品列表","menuJump":"列表","tableName":"nongchanpin"}],"menu":"农产品模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["新增","查看","修改","删除","查看评论"],"menu":"农产品","menuJump":"列表","tableName":"nongchanpin"}],"menu":"农产品管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","支付"],"menu":"农资订单","menuJump":"列表","tableName":"nongzidingdan"}],"menu":"农资订单管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看"],"menu":"农产品订单","menuJump":"列表","tableName":"nongchanpindingdan"}],"menu":"农产品订单管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","查看评论"],"menu":"农业技术列表","menuJump":"列表","tableName":"nongyejishu"}],"menu":"农业技术模块"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看","查看评论","立即购买"],"menu":"农资产品列表","menuJump":"列表","tableName":"nongzichanpin"}],"menu":"农资产品模块"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","查看评论","立即购买"],"menu":"农产品列表","menuJump":"列表","tableName":"nongchanpin"}],"menu":"农产品模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"种植户","tableName":"zhongzhihu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
