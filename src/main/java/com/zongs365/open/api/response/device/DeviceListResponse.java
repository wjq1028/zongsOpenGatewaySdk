package com.zongs365.open.api.response.device;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONField;
import com.zongs365.open.api.response.base.BaseResponse;
import com.zongs365.open.api.response.base.BaseResponseBody;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

public class DeviceListResponse extends BaseResponse<DeviceListResponse.DeviceListResponseBody> {


    @Override
    public DeviceListResponseBody getBody(){
        return JSON.parseObject(getBodyStr(),new TypeReference<DeviceListResponseBody>(){});
    }


    public static class DeviceListResponseBody extends BaseResponseBody {

        @Getter @Setter
        Integer pageSize;

        @Getter @Setter
        Integer total;

        @Getter @Setter
        List<DeviceListResponseData> data;
    }

    @Data
    public static class DeviceListResponseData{
        private String address;
        private Boolean addressed;
        private String columnType;
        private String deviceAddr;
        private String deviceCode;
        private List<String> deviceModelNames;
        private List<String> deviceModelNos;
        private Integer deviceStatus;
        private String deviceStatusText;
        private Integer employeeId;
        private String employeeName;
        @JSONField(format = "yyyy-MM-dd HH:mm:ss")
        private Date operateTime;
        private String pointAddr;
        private Integer pointId;
        private String pointName;
        private String vmAddr;
    }
}
