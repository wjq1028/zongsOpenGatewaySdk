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

public class ProductViewResponse extends BaseResponse<ProductViewResponse.ProductViewResponseBody> {


    @Override
    public ProductViewResponseBody getBody(){
        return JSON.parseObject(getBodyStr(),new TypeReference<ProductViewResponseBody>(){});
    }


    @Data
    public static class ProductViewResponseBody extends BaseResponseBody {
        private String barCode;
        private String productCode;
        private Long productId;
        private String productName;
        private BigDecimal salesPrice;
        private String thumbnailUrl;
    }

}
