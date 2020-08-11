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

public class ProductDeviceListResponse extends BaseResponse<ProductDeviceListResponse.ProductDeviceListResponseBody> {


    @Override
    public ProductDeviceListResponseBody getBody(){
        return JSON.parseObject(getBodyStr(),new TypeReference<ProductDeviceListResponseBody>(){});
    }


    public static class ProductDeviceListResponseBody extends BaseResponseBody {
        @Getter @Setter
        List<ProductDeviceListResponseData> list;
    }

    @Data
    public static class ProductDeviceListResponseData{
        private String barCode;
        private String productCode;
        private Integer productId;
        private String productName;
        private BigDecimal salesPrice;
        private Integer stockNum;
        private String thumbnailUrl;
    }
}
