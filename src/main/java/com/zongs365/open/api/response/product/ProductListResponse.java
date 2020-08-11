package com.zongs365.open.api.response.product;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.zongs365.open.api.response.base.BaseResponse;
import com.zongs365.open.api.response.base.BaseResponseBody;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

public class ProductListResponse extends BaseResponse<ProductListResponse.ProductListResponseBody> {


    @Override
    public ProductListResponseBody getBody(){
        return JSON.parseObject(getBodyStr(),new TypeReference<ProductListResponseBody>(){});
    }


    public static class ProductListResponseBody extends BaseResponseBody {

        @Getter @Setter
        Integer pageSize;

        @Getter @Setter
        Integer total;

        @Getter @Setter
        List<ProductListResponseData> list;
    }

    @Data
    public static class ProductListResponseData{
        private String barCode;
        private String productCode;
        private Long productId;
        private String productName;
        private BigDecimal salesPrice;
        private String thumbnailUrl;
    }
}
