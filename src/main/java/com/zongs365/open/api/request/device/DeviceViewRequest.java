package com.zongs365.open.api.request.device;

import com.zongs365.open.api.request.base.BaseRequest;
import com.zongs365.open.api.request.base.BaseRequestBody;
import com.zongs365.open.api.response.device.DeviceViewResponse;
import lombok.Data;


public class DeviceViewRequest extends BaseRequest<DeviceViewRequest.DeviceViewRequestBody, DeviceViewResponse> {


    public DeviceViewRequest() { }

    @Override
    public Class<DeviceViewResponse> getResponseClass() {
        return DeviceViewResponse.class;
    }

    @Override
    public void setBody(DeviceViewRequestBody body) {
        this.body = body;
    }

    @Override
    public String getMethod() {
        return "zs.device.view";
    }

    @Data
    public static class DeviceViewRequestBody extends BaseRequestBody {

        private String deviceCode;

        public DeviceViewRequestBody() {
        }

        public DeviceViewRequestBody(String deviceCode) {
            this.deviceCode = deviceCode;
        }
    }
}
