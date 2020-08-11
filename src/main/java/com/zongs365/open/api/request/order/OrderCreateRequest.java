package com.zongs365.open.api.request.order;

import com.zongs365.open.api.request.base.BaseRequest;
import com.zongs365.open.api.request.base.BaseRequestBody;
import com.zongs365.open.api.response.device.DeviceListResponse;
import com.zongs365.open.api.response.order.OrderCreateResponse;
import lombok.Data;

import java.util.List;


public class OrderCreateRequest extends BaseRequest<OrderCreateRequest.OrderCreateRequestBody, OrderCreateResponse> {


    public OrderCreateRequest() { }

    @Override
    public Class<OrderCreateResponse> getResponseClass() {
        return OrderCreateResponse.class;
    }

    @Override
    public void setBody(OrderCreateRequestBody body) {
        this.body = body;
    }

    @Override
    public String getMethod() {
        return "zs.order.create";
    }

    @Data
    public static class OrderCreateRequestBody extends BaseRequestBody {
        private String outTradeNo;
        private List<OrderCreateProduct> productList;
    }

    @Data
    public static class OrderCreateProduct {
        private int productId;
        private String productCode;
        private int productNum;
    }
}
