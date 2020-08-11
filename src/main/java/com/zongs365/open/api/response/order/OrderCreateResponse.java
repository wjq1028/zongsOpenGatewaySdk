package com.zongs365.open.api.response.order;

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

public class OrderCreateResponse extends BaseResponse<OrderCreateResponse.OrderCreateResponseBody> {


    @Override
    public OrderCreateResponseBody getBody(){
        return JSON.parseObject(getBodyStr(),new TypeReference<OrderCreateResponseBody>(){});
    }


    @Data
    public static class OrderCreateResponseBody extends BaseResponseBody {
        private String orderId;
        private String outTradeNo;
        private String pickCode;
    }
}
