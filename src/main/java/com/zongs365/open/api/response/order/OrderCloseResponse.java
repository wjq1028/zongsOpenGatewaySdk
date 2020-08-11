package com.zongs365.open.api.response.order;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.zongs365.open.api.response.base.BaseResponse;
import com.zongs365.open.api.response.base.BaseResponseBody;
import lombok.Data;

public class OrderCloseResponse extends BaseResponse<OrderCloseResponse.OrderCloseResponseBody> {


    @Override
    public OrderCloseResponseBody getBody(){
        return JSON.parseObject(getBodyStr(),new TypeReference<OrderCloseResponseBody>(){});
    }


    @Data
    public static class OrderCloseResponseBody extends BaseResponseBody {
        private Boolean success;
    }
}
