import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import nongchanpin from '@/views/modules/nongchanpin/list'
    import news from '@/views/modules/news/list'
    import discussnongzichanpin from '@/views/modules/discussnongzichanpin/list'
    import discussnongyejishu from '@/views/modules/discussnongyejishu/list'
    import nongchanpindingdan from '@/views/modules/nongchanpindingdan/list'
    import zhongzhihu from '@/views/modules/zhongzhihu/list'
    import nongzileixing from '@/views/modules/nongzileixing/list'
    import nongyejishu from '@/views/modules/nongyejishu/list'
    import discussnongchanpin from '@/views/modules/discussnongchanpin/list'
    import nongzichanpin from '@/views/modules/nongzichanpin/list'
    import yonghu from '@/views/modules/yonghu/list'
    import nongzidingdan from '@/views/modules/nongzidingdan/list'
    import config from '@/views/modules/config/list'
    import nongchanpinleixing from '@/views/modules/nongchanpinleixing/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/nongchanpin',
        name: '农产品',
        component: nongchanpin
      }
      ,{
	path: '/news',
        name: '农业政策',
        component: news
      }
      ,{
	path: '/discussnongzichanpin',
        name: '农资产品评论',
        component: discussnongzichanpin
      }
      ,{
	path: '/discussnongyejishu',
        name: '农业技术评论',
        component: discussnongyejishu
      }
      ,{
	path: '/nongchanpindingdan',
        name: '农产品订单',
        component: nongchanpindingdan
      }
      ,{
	path: '/zhongzhihu',
        name: '种植户',
        component: zhongzhihu
      }
      ,{
	path: '/nongzileixing',
        name: '农资类型',
        component: nongzileixing
      }
      ,{
	path: '/nongyejishu',
        name: '农业技术',
        component: nongyejishu
      }
      ,{
	path: '/discussnongchanpin',
        name: '农产品评论',
        component: discussnongchanpin
      }
      ,{
	path: '/nongzichanpin',
        name: '农资产品',
        component: nongzichanpin
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/nongzidingdan',
        name: '农资订单',
        component: nongzidingdan
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/nongchanpinleixing',
        name: '农产品类型',
        component: nongchanpinleixing
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
