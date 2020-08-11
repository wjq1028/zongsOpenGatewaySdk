package com.zongs365.open.api.response.device;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONField;
import com.zongs365.open.api.response.base.BaseResponse;
import com.zongs365.open.api.response.base.BaseResponseBody;
import lombok.Data;

import java.util.Date;
import java.util.List;

public class DeviceViewResponse extends BaseResponse<DeviceViewResponse.DeviceListResponseBody> {


    @Override
    public DeviceListResponseBody getBody(){
        return JSON.parseObject(getBodyStr(),new TypeReference<DeviceListResponseBody>(){});
    }


    @Data
    public static class DeviceListResponseBody extends BaseResponseBody {

        private String address;
        private boolean addressed;
        private String columnType;
        private String deviceAddr;
        private String deviceAlias;
        private String deviceCode;
        private List<String> deviceModelNames;
        private List<String> deviceModelNos;
        private int deviceStatus;
        private String deviceStatusText;
        private int employeeId;
        private String employeeName;
        @JSONField(format = "yyyy-MM-dd HH:mm:ss")
        private Date operateTime;
        private String pointAddr;
        private int pointId;
        private String pointName;
        private String vmAddr;
    }
}
