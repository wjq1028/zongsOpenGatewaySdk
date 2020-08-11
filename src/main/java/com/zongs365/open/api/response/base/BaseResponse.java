package com.zongs365.open.api.response.base;

import lombok.Getter;
import lombok.Setter;

public abstract class BaseResponse <T extends BaseResponseBody> {
    @Getter@Setter
    private Integer code;

    @Getter@Setter
    private String msg;

    @Getter@Setter
    private String timestamp;

    @Getter@Setter
    private String sign;

    @Setter
    private String body;

    public String getBodyStr(){
        return body;
    }


    public abstract T getBody();

}
