package com.zongs365.open.config;

import lombok.Data;

@Data
public class OpenClientConfig {

    private String gatewayUrl;

    private String appId;

    private String appKey;

    private String md5edAppKey;

}
