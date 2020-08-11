package com.zongs365.open.api.response.order;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONField;
import com.zongs365.open.api.response.base.BaseResponse;
import com.zongs365.open.api.response.base.BaseResponseBody;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderViewResponse extends BaseResponse<OrderViewResponse.OrderViewResponseBody> {


    @Override
    public OrderViewResponseBody getBody(){
        return JSON.parseObject(getBodyStr(),new TypeReference<OrderViewResponseBody>(){});
    }


    @Data
    public static class OrderViewResponseBody extends BaseResponseBody {
        private String deviceCode;
        private List<OrderViewItem> items;
        private BigDecimal orderAmount;
        private String orderId;
        private Integer orderSource;
        private String orderSourceText;
        @JSONField(format = "yyyy-MM-dd HH:mm:ss")
        private Date orderTime;
        private Integer outTradeNo;
        private String pickCode;
        private String pointName;
        private BigDecimal productAmount;
        private Integer shipmentStatus;
        private String shipmentStatusText;
        @JSONField(format = "yyyy-MM-dd HH:mm:ss")
        private Date shipmentTime;
        private Integer tradeStatus;
        private String tradeStatusText;
    }

    @Data
    public static class OrderViewItem{
        private String barCode;
        private String brandName;
        private String categoryFullName;
        private BigDecimal productAmount;
        private String productCode;
        private Long productId;
        private String productName;
        private Integer productNum;
        private Integer salesPrice;
        private Integer shipmentStatus;
        private String shipmentStatusText;
        @JSONField(format = "yyyy-MM-dd HH:mm:ss")
        private Date shipmentTime;
        private String spec;
        private String thumbnailUrl;
        private Integer tradeStatus;
        private String tradeStatusText;
    }
}
