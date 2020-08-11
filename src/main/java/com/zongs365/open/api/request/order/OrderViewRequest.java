package com.zongs365.open.api.request.order;

import com.zongs365.open.api.request.base.BaseRequest;
import com.zongs365.open.api.request.base.BaseRequestBody;
import com.zongs365.open.api.response.order.OrderViewResponse;
import lombok.Data;


public class OrderViewRequest extends BaseRequest<OrderViewRequest.OrderViewRequestBody, OrderViewResponse> {


    @Override
    public Class<OrderViewResponse> getResponseClass() {
        return OrderViewResponse.class;
    }

    @Override
    public void setBody(OrderViewRequestBody body) {
        this.body = body;
    }

    @Override
    public String getMethod() {
        return "zs.order.view";
    }

    @Data
    public static class OrderViewRequestBody extends BaseRequestBody {
        private String orderId;
        private String outTradeNo;
    }
}
