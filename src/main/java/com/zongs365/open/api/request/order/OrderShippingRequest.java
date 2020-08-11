package com.zongs365.open.api.request.order;

import com.zongs365.open.api.request.base.BaseRequest;
import com.zongs365.open.api.request.base.BaseRequestBody;
import com.zongs365.open.api.response.order.OrderShippingResponse;
import lombok.Data;


public class OrderShippingRequest extends BaseRequest<OrderShippingRequest.OrderShippingRequestBody, OrderShippingResponse> {


    @Override
    public Class<OrderShippingResponse> getResponseClass() {
        return OrderShippingResponse.class;
    }

    @Override
    public void setBody(OrderShippingRequestBody body) {
        this.body = body;
    }

    @Override
    public String getMethod() {
        return "zs.order.shipping";
    }

    @Data
    public static class OrderShippingRequestBody extends BaseRequestBody {
        private String deviceCode;
        private String orderId;
        private String outTradeNo;
        private String pickCode;
    }
}
