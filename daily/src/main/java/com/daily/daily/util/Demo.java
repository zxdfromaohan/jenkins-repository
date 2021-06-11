//
//  Created by  fred on 2016/10/26.
//  Copyright © 2016年 Alibaba. All rights reserved.
//

package com.daily.daily.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.codec.binary.Base64;

import com.alibaba.cloudapi.sdk.constant.SdkConstant;
import com.alibaba.cloudapi.sdk.model.ApiResponse;
import com.alibaba.cloudapi.sdk.model.HttpClientBuilderParams;
import com.alibaba.fastjson.JSONObject;

public class Demo {

	//初始化
    static{
        HttpClientBuilderParams httpParam = new HttpClientBuilderParams();
        httpParam.setAppKey("203948790");
        httpParam.setAppSecret("wO3CACt9U5jCqmAoYAw9riv6VxJgmtay");
        HttpApiClient.getInstance().init(httpParam);
    }

  
    public static void cardDistinguishHttpSyncTest(String param){
        ApiResponse response = HttpApiClient.getInstance().cardDistinguishSyncMode(param.getBytes(SdkConstant.CLOUDAPI_ENCODING));
        try {
        	System.out.println("-----------"+response.getCode());
            System.out.println(new String(response.getBody() , SdkConstant.CLOUDAPI_ENCODING));
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
 

    private static String getResultString(ApiResponse response) throws IOException {
        StringBuilder result = new StringBuilder();
        result.append("Response from backend server").append(SdkConstant.CLOUDAPI_LF).append(SdkConstant.CLOUDAPI_LF);
        result.append("ResultCode:").append(SdkConstant.CLOUDAPI_LF).append(response.getCode()).append(SdkConstant.CLOUDAPI_LF).append(SdkConstant.CLOUDAPI_LF);
        if(response.getCode() != 200){
            result.append("Error description:").append(response.getHeaders().get("X-Ca-Error-Message")).append(SdkConstant.CLOUDAPI_LF).append(SdkConstant.CLOUDAPI_LF);
        }

        result.append("ResultBody:").append(SdkConstant.CLOUDAPI_LF).append(new String(response.getBody() , SdkConstant.CLOUDAPI_ENCODING));

        return result.toString();
    }
    
    public static void main(String[] args) {
    	String imgFile = "E:\\idCard\\5.png";
    	 //configure配置
        JSONObject configObj = new JSONObject();
        configObj.put("side", "face");

        String config_str = configObj.toString();
        JSONObject requestObj = new JSONObject();
        // 对图像进行base64编码
        String imgBase64 = img_base64(imgFile);
        requestObj.put("image", imgBase64);
        if(configObj.size() > 0) {
            requestObj.put("configure", config_str);
        }
        String bodys = requestObj.toString();
        cardDistinguishHttpSyncTest(bodys);
    }
    
    public static String img_base64(String path) {
        /**
         *  对path进行判断，如果是本地文件就二进制读取并base64编码，如果是url,则返回
         */
        String imgBase64="";
        if (path.startsWith("http")){
            imgBase64 = path;
        }else {
            try {
                File file = new File(path);
                byte[] content = new byte[(int) file.length()];
                FileInputStream finputstream = new FileInputStream(file);
                finputstream.read(content);
                finputstream.close();
                imgBase64 = new String(Base64.encodeBase64(content));
            } catch (IOException e) {
                e.printStackTrace();
                return imgBase64;
            }
        }
        
        return imgBase64;
    }

}
