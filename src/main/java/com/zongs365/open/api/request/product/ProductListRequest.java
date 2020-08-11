package com.zongs365.open.api.request.product;

import com.zongs365.open.api.request.base.BaseRequest;
import com.zongs365.open.api.request.base.BaseRequestBody;
import com.zongs365.open.api.response.product.ProductListResponse;
import lombok.Data;


public class ProductListRequest extends BaseRequest<ProductListRequest.ProductListRequestBody,ProductListResponse> {


    public ProductListRequest() { }

    @Override
    public Class<ProductListResponse> getResponseClass() {
        return ProductListResponse.class;
    }

    @Override
    public void setBody(ProductListRequestBody body) {
        this.body = body;
    }

    @Override
    public String getMethod() {
        return "zs.product.list";
    }

    @Data
    public static class ProductListRequestBody extends BaseRequestBody {


        private int pageNum;

        private int pageSize;

        public ProductListRequestBody() {
        }

        public ProductListRequestBody(int pageNum, int pageSize) {
            this.pageNum = pageNum;
            this.pageSize = pageSize;
        }
    }
}
