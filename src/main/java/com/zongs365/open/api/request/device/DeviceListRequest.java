package com.zongs365.open.api.request.device;

import com.zongs365.open.api.request.base.BaseRequest;
import com.zongs365.open.api.request.base.BaseRequestBody;
import com.zongs365.open.api.response.device.DeviceListResponse;
import lombok.Data;


public class DeviceListRequest extends BaseRequest<DeviceListRequest.DeviceListRequestBody, DeviceListResponse> {


    public DeviceListRequest() { }

    @Override
    public Class<DeviceListResponse> getResponseClass() {
        return DeviceListResponse.class;
    }

    @Override
    public void setBody(DeviceListRequestBody body) {
        this.body = body;
    }

    @Override
    public String getMethod() {
        return "zs.device.list";
    }

    @Data
    public static class DeviceListRequestBody extends BaseRequestBody {

        private int pageNum;

        private int pageSize;

        public DeviceListRequestBody() {
        }

        public DeviceListRequestBody(int pageNum, int pageSize) {
            this.pageNum = pageNum;
            this.pageSize = pageSize;
        }
    }
}
