package com.jikexueyuan.baiduwaimai.Beans;

import com.jikexueyuan.baiduwaimai.R;

/**
 * 实例化各页面所需数据
 */
public class BeansFactory {

    //首页分类数据
    public static SimpleImageTextCellBean[] categoryCellBeens = {new SimpleImageTextCellBean("餐饮", R.drawable.eat), new SimpleImageTextCellBean("超市购", R.drawable.buy),
            new SimpleImageTextCellBean("水果生鲜", R.drawable.fruit), new SimpleImageTextCellBean("下午茶", R.drawable.tea),
            new SimpleImageTextCellBean("土豪特供", R.drawable.tuhao), new SimpleImageTextCellBean("新店", R.drawable.newdian),
            new SimpleImageTextCellBean("百度配送", R.drawable.deliver), new SimpleImageTextCellBean("网上送药", R.drawable.medicine)};

    //首页商家信息
    public static ShopBean[] shopBeans = {new ShopBean(R.drawable.shopone, ShopBean.IS_NEWDIAN, true, true, true, true, "正宗重庆麻辣烫", "543", "5.0km", "99", "11", "99", "满10减500", "满50免配送费", 4.0f),
            new ShopBean(R.drawable.shopone, ShopBean.NOT_NEWDIAN, true, true, true, false, "麻辣烫2", "2543", "5.0km", "22", "11", "15", "", "test", 4.5f),
            new ShopBean(R.drawable.shoptwo, ShopBean.NOT_NEWDIAN, false, false, true, false, "花店", "22", "500m", "12", "33", "32", "", "", 3.0f),
            new ShopBean(R.drawable.shopthree, ShopBean.NOT_NEWDIAN, true, false, true, true, "一洋码头", "333", "3.0km", "55", "11", "11", "", "", 1.0f),
            new ShopBean(R.drawable.shopone, ShopBean.IS_NEWDIAN, false, false, false, false, "正宗重庆麻辣烫（杭州分店）", "123", "300m", "99", "44", "123", "", "tt", 3.5f),
            new ShopBean(R.drawable.shoptwo, ShopBean.NOT_NEWDIAN, true, true, true, false, "肯德基", "5453", "3.3km", "332", "32", "33", "满10减100", "", 2.0f),
            new ShopBean(R.drawable.shopthree, ShopBean.NOT_NEWDIAN, true, false, true, false, "必胜客", "22", "1km", "123", "13", "22", "满101减300", "满502免配送费", 2.0f)};

    //“我的”选项卡内列表数据
    public static SimpleImageTextCellBean[] meListCellBeans = {new SimpleImageTextCellBean("我的送餐地址", R.drawable.mypage_list_icon_location), new SimpleImageTextCellBean("我的代金券", R.drawable.mypage_list_icon_daijinjuan),
            new SimpleImageTextCellBean("我的退款", R.drawable.mypage_list_icon_refund), new SimpleImageTextCellBean("separator", 0),
            new SimpleImageTextCellBean("我的消息", R.drawable.my_messages), new SimpleImageTextCellBean("我的收藏", R.drawable.mypage_list_icon_star),
            new SimpleImageTextCellBean("我的评论", R.drawable.mypage_list_icon_comment), new SimpleImageTextCellBean("separator", 0),
            new SimpleImageTextCellBean("百度钱包", R.drawable.mypage_list_icon_wallet), new SimpleImageTextCellBean("百度糯米", R.drawable.icon_nuomi),
             new SimpleImageTextCellBean("separator", 0),new SimpleImageTextCellBean("常见问题", R.drawable.icon_common_problem),new SimpleImageTextCellBean("separator", 0)};
}
