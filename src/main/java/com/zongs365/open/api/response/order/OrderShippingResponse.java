package com.zongs365.open.api.response.order;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.zongs365.open.api.response.base.BaseResponse;
import com.zongs365.open.api.response.base.BaseResponseBody;
import lombok.Data;

public class OrderShippingResponse extends BaseResponse<OrderShippingResponse.OrderShippingResponseBody> {


    @Override
    public OrderShippingResponseBody getBody(){
        return JSON.parseObject(getBodyStr(),new TypeReference<OrderShippingResponseBody>(){});
    }


    @Data
    public static class OrderShippingResponseBody extends BaseResponseBody {
        private Boolean success;
    }
}
