 
    /**   
     * 文件名：MainActivity.java   
     * 包名:com.wl.android.activity
	 * @Author:wangliu94@163.com
	 * @Description:TODO
     * 版本信息：V1.0 
     * 日期：2014-10-31   
     * Copyright Ecity(Wuhan) Corporation 2014    
     * 版权所有   
     *   
     */   
    
package com.wl.android.activity;


import android.app.Activity;
import android.os.Bundle;

import com.wl.android.R;

 
    /** 
 * @类名：MainActivity
 * @description:  
 * @author : wangliu94@163.com   
 * @version : 2014-10-31 下午10:45:58    
 */

public class MainActivity extends Activity {

		 
		    /* (non-Javadoc)   
		     * @see android.app.Activity#onCreate(android.os.Bundle)   
		     */   
		    
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
		}
	

}
