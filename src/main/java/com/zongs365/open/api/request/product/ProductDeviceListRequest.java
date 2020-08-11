package com.zongs365.open.api.request.product;

import com.zongs365.open.api.request.base.BaseRequest;
import com.zongs365.open.api.request.base.BaseRequestBody;
import com.zongs365.open.api.response.product.ProductDeviceListResponse;
import lombok.Data;


public class ProductDeviceListRequest extends BaseRequest<ProductDeviceListRequest.ProductDeviceListRequestBody,ProductDeviceListResponse> {


    public ProductDeviceListRequest() { }

    @Override
    public Class<ProductDeviceListResponse> getResponseClass() {
        return ProductDeviceListResponse.class;
    }

    @Override
    public void setBody(ProductDeviceListRequestBody body) {
        this.body = body;
    }

    @Override
    public String getMethod() {
        return "zs.product.device_list";
    }

    @Data
    public static class ProductDeviceListRequestBody extends BaseRequestBody {

        public ProductDeviceListRequestBody() {
        }

        public ProductDeviceListRequestBody(String deviceCode) {
            this.deviceCode = deviceCode;
        }

        private String deviceCode;
    }
}
