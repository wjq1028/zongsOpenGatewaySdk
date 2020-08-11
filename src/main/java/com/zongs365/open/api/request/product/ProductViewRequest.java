package com.zongs365.open.api.request.product;

import com.zongs365.open.api.request.base.BaseRequest;
import com.zongs365.open.api.request.base.BaseRequestBody;
import com.zongs365.open.api.response.product.ProductListResponse;
import com.zongs365.open.api.response.product.ProductViewResponse;
import lombok.Data;


public class ProductViewRequest extends BaseRequest<ProductViewRequest.ProductViewRequestBody,ProductViewResponse> {


    public ProductViewRequest() { }

    @Override
    public Class<ProductViewResponse> getResponseClass() {
        return ProductViewResponse.class;
    }

    @Override
    public void setBody(ProductViewRequestBody body) {
        this.body = body;
    }

    @Override
    public String getMethod() {
        return "zs.product.view";
    }

    @Data
    public static class ProductViewRequestBody extends BaseRequestBody {


        private long productId;

        public ProductViewRequestBody() {
        }

        public ProductViewRequestBody(long productId) {
            this.productId = productId;
        }
    }
}
