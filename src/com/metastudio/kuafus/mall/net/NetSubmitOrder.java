package com.metastudio.kuafus.mall.net;


import com.metastudio.kuafus.mall.config.MyConfig;

/**
 * 
 * 
 * 
 * @author liudewei-zzu
 *返回订单提交结果
 */
public class NetSubmitOrder {
	public static int getData(String param) throws Exception {
		
		int state = -1;
		try {
			state = Integer.parseInt(HttpRequest.sendPost(MyConfig.SERVERADDRESS+"?tag=wemall_add_order",param));
		} catch (Exception e) {
			throw e;
		}
		return state;
	}

}
