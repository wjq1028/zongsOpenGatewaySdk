package com.zongs365.open;

import com.alibaba.fastjson.JSON;
import com.zongs365.open.api.request.base.BaseRequest;
import com.zongs365.open.api.request.product.ProductDeviceListRequest;
import com.zongs365.open.api.response.base.BaseResponse;
import com.zongs365.open.config.OpenClientConfig;
import com.zongs365.open.exception.SignValidErrorException;
import com.zongs365.open.exception.ZongsException;
import com.zongs365.open.utils.HttpUtils;
import com.zongs365.open.utils.OpenSignTools;
import org.apache.commons.codec.digest.DigestUtils;

public class ZongsOpenClient {

    private OpenClientConfig openClientConfig;

    public ZongsOpenClient(OpenClientConfig openClientConfig){
        openClientConfig.setMd5edAppKey(DigestUtils.md5Hex(openClientConfig.getAppKey()).toUpperCase());
        this.openClientConfig = openClientConfig;
    }

    public <T extends BaseResponse<?>> T doRequest(BaseRequest<?,T> request) throws ZongsException {
        request.setAppId(openClientConfig.getAppId());
        OpenSignTools.signRequest(request,openClientConfig.getMd5edAppKey());
        try {
            String responseStr = HttpUtils.httpPostJson(openClientConfig.getGatewayUrl(), request.toRequestString());
            T t = JSON.parseObject(responseStr, request.getResponseClass());
            if (t.getCode() != 20000) {
                throw new ZongsException(t.getMsg());
            }
            if(OpenSignTools.validSign(t,openClientConfig.getMd5edAppKey())){
                return t;
            }else{
                throw new SignValidErrorException("签名验证失败");
            }
        } catch (Exception e) {
            throw new ZongsException(e);
        }
    }


    public static void main(String[] args) {
        ProductDeviceListRequest productDeviceListRequest = new ProductDeviceListRequest();
        productDeviceListRequest.setBody(new ProductDeviceListRequest.ProductDeviceListRequestBody("9000010016"));
        productDeviceListRequest.setAppId("ZSHKVOu3alXqgWEa");
        OpenSignTools.signRequest(productDeviceListRequest,"9BCE194727CF9DEC1B292DE57A89FCF8");
        System.out.println(productDeviceListRequest.toRequestString());
    }


}
