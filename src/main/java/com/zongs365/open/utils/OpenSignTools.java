package com.zongs365.open.utils;

import com.google.common.collect.Lists;
import com.zongs365.open.api.request.base.BaseRequest;
import com.zongs365.open.api.response.base.BaseResponse;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenSignTools {

    public final static String SIGN = "sign";

    public static boolean validSign(BaseResponse<?> baseResponse, String appKey){
        Map<String, String> stringMap = new HashMap<>(4);
        stringMap.put("code",String.valueOf(baseResponse.getCode()));
        stringMap.put("msg",baseResponse.getMsg());
        stringMap.put("body",baseResponse.getBodyStr());
        stringMap.put("timestamp",baseResponse.getTimestamp());
        return getSign(stringMap,appKey).equals(baseResponse.getSign());
    }

    public static BaseRequest<?,?>  signRequest(BaseRequest<?,?> baseRequest, String appKey){
        String timestamp = String.valueOf(System.currentTimeMillis());
        Map<String, String> stringMap = new HashMap<>(4);
        stringMap.put("appId",baseRequest.getAppId());
        stringMap.put("timestamp",timestamp);
        stringMap.put("body",baseRequest.getBody());
        stringMap.put("method",baseRequest.getMethod());
        String sign = getSign(stringMap, appKey);
        baseRequest.setTimestamp(timestamp);
        baseRequest.setSign(sign);
        return baseRequest;
    }

    private static String getSign(Map<String,String> data,String md5edAppKey){
        List<String> keyList = Lists.newArrayList(data.keySet());
        Collections.sort(keyList);
        StringBuilder stringBuilder = new StringBuilder();
        for (String key : keyList) {
            if (!SIGN.equals(key)) {
                String value = data.get(key);
                if (StringUtils.isNotBlank(value)) {
                    stringBuilder.append(key).append("=").append(value).append("&");
                }
            }
        }
        stringBuilder.append("key=").append(md5edAppKey);
        return DigestUtils.md5Hex(stringBuilder.toString().getBytes()).toUpperCase();
    }

}
