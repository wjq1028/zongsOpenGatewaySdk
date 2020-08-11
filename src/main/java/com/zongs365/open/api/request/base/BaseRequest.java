package com.zongs365.open.api.request.base;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zongs365.open.api.response.base.BaseResponse;

public abstract class BaseRequest<S extends BaseRequestBody,T extends BaseResponse<?>> {

    protected String appId;

    protected String timestamp;

    protected String sign;

    protected S body;

    public abstract Class<T> getResponseClass();

    public abstract void setBody(S body);

    public String getBody() {
        return JSON.toJSONString(body);
    }

    public abstract String getMethod();

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getAppId() {
        return appId;
    }


    public String toRequestString(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("appId",appId);
        jsonObject.put("timestamp",timestamp);
        jsonObject.put("sign",sign);
        jsonObject.put("body",getBody());
        jsonObject.put("method",getMethod());
        return jsonObject.toJSONString();
    }
}
