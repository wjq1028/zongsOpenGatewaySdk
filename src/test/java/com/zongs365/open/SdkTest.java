package com.zongs365.open;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.zongs365.open.api.request.device.DeviceListRequest;
import com.zongs365.open.api.request.device.DeviceViewRequest;
import com.zongs365.open.api.request.order.OrderCloseRequest;
import com.zongs365.open.api.request.order.OrderCreateRequest;
import com.zongs365.open.api.request.order.OrderViewRequest;
import com.zongs365.open.api.request.product.ProductDeviceListRequest;
import com.zongs365.open.api.response.device.DeviceListResponse;
import com.zongs365.open.api.response.device.DeviceViewResponse;
import com.zongs365.open.api.response.order.OrderCloseResponse;
import com.zongs365.open.api.response.order.OrderCreateResponse;
import com.zongs365.open.api.response.order.OrderViewResponse;
import com.zongs365.open.api.response.product.ProductDeviceListResponse;
import com.zongs365.open.config.OpenClientConfig;
import com.zongs365.open.exception.ZongsException;
import org.junit.Before;
import org.junit.Test;


public class SdkTest {

    ZongsOpenClient zongsOpenClient;

    @Before
    public void before(){
        OpenClientConfig openClientConfig = new OpenClientConfig();
        openClientConfig.setGatewayUrl("https://devtest.zongs365.cn/open/v1.0/o/open/request.php");
        openClientConfig.setAppId("ZSHKVOu3alXqgWEa");
        openClientConfig.setAppKey("KTysuAik3a0sJI0J");
        zongsOpenClient = new ZongsOpenClient(openClientConfig);
    }

    @Test
    public void productDeviceList() throws ZongsException {
        ProductDeviceListRequest request = new ProductDeviceListRequest();
        request.setBody(new ProductDeviceListRequest.ProductDeviceListRequestBody("9000010016"));
        ProductDeviceListResponse response = zongsOpenClient.doRequest(request);
        System.out.println(JSON.toJSONString(response.getBody()));
    }

    @Test
    public void deviceList() throws ZongsException {
        DeviceListRequest request = new DeviceListRequest();
        request.setBody(new DeviceListRequest.DeviceListRequestBody(1,10));
        DeviceListResponse response = zongsOpenClient.doRequest(request);
        System.out.println(JSON.toJSONString(response.getBody()));
    }

    @Test
    public void deviceView() throws ZongsException {
        DeviceViewRequest request = new DeviceViewRequest();
        request.setBody(new DeviceViewRequest.DeviceViewRequestBody("9000010016"));
        DeviceViewResponse response = zongsOpenClient.doRequest(request);
        System.out.println(JSON.toJSONString(response.getBody()));
    }

    @Test
    public void orderCreate() throws ZongsException {
        OrderCreateRequest request = new OrderCreateRequest();
        OrderCreateRequest.OrderCreateRequestBody body = new OrderCreateRequest.OrderCreateRequestBody();
        body.setOutTradeNo("10000");
        OrderCreateRequest.OrderCreateProduct product = new OrderCreateRequest.OrderCreateProduct();
        product.setProductId(80);
        product.setProductCode("1000068");
        product.setProductNum(500);
        body.setProductList(Lists.newArrayList(product));
        request.setBody(body);
        OrderCreateResponse response = zongsOpenClient.doRequest(request);
        System.out.println(JSON.toJSONString(response.getBody()));
    }

    @Test
    public void orderView() throws ZongsException {
        OrderViewRequest request = new OrderViewRequest();
        OrderViewRequest.OrderViewRequestBody body = new OrderViewRequest.OrderViewRequestBody();
        body.setOutTradeNo("10000");
        request.setBody(body);
        OrderViewResponse response = zongsOpenClient.doRequest(request);
        System.out.println(JSON.toJSONString(response.getBody()));
    }

    @Test
    public void orderClose() throws ZongsException {
        OrderCloseRequest request = new OrderCloseRequest();
        OrderCloseRequest.OrderCloseRequestBody body = new OrderCloseRequest.OrderCloseRequestBody();
        body.setOutTradeNo("10000");
        request.setBody(body);
        OrderCloseResponse response = zongsOpenClient.doRequest(request);
        System.out.println(JSON.toJSONString(response.getBody()));
    }



}




