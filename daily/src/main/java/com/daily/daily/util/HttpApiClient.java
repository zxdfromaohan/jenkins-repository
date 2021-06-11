package com.daily.daily.util;
import com.alibaba.cloudapi.sdk.client.ApacheHttpClient;
import com.alibaba.cloudapi.sdk.enums.HttpMethod;
import com.alibaba.cloudapi.sdk.enums.Scheme;
import com.alibaba.cloudapi.sdk.model.ApiRequest;
import com.alibaba.cloudapi.sdk.model.ApiResponse;
import com.alibaba.cloudapi.sdk.model.HttpClientBuilderParams;


/**
 * @author edz
   *    数据服务_5_1_身份证识别
 */
public class HttpApiClient extends ApacheHttpClient{
    public final static String HOST = "dm-51.data.aliyun.com";
    static HttpApiClient instance = new HttpApiClient();
    public static HttpApiClient getInstance(){return instance;}

    public void init(HttpClientBuilderParams httpClientBuilderParams){
        httpClientBuilderParams.setScheme(Scheme.HTTP);
        httpClientBuilderParams.setHost(HOST);
        super.init(httpClientBuilderParams);
    }


    /**
               * 印刷文字识别_身份证识别
     */ 
    public ApiResponse cardDistinguishSyncMode(byte[] body) {
        String path = "/rest/160601/ocr/ocr_idcard.json";
        ApiRequest request = new ApiRequest(HttpMethod.POST_BODY , path, body);
        return sendSyncRequest(request);
    }
    
    /**
             * 印刷文字识别_身份证识别
    */ 
    public ApiResponse businessLicenseDistinguishSyncMode(byte[] body) {
    	String path = "/rest/160601/ocr/ocr_business_license.json";
    	ApiRequest request = new ApiRequest(HttpMethod.POST_BODY , path, body);
    	return sendSyncRequest(request);
    }


}