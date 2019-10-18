package cn.com.mos.server.api.dto.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * InputDto
 *
 * @author 19010370 wangchaodz@gmail.com
 * @version 1.0
 * @Company Haier
 * @date 15:59 2019/10/17
 */
@Data
@ApiModel(value="演示类",description="请求参数类" )
public class RequestDto<T> implements Serializable {

    @NotNull
    @ApiModelProperty(value = "messageId",example="消息Id,保证唯一性,yyyyMMddHHmmssSSS + 3位随机数,20191010010203456999")
    private String messageId;

    @NotNull
    @ApiModelProperty(value = "createBy",example="消息请求来源")
    private String createBy;

    @NotNull
    @ApiModelProperty(value = "dateTime",example="消息请求时间,yyyyMMddHHmmss,20191010010203")
    private String dateTime;

    @NotNull
    @ApiModelProperty(value = "address",example="消息请求地址,127.0.0.1")
    private String address;

    @NotNull
    @ApiModelProperty(value = "eventType",example="消息请求事件,参考枚举类型")
    private String eventType;

    @ApiModelProperty(value = "sign",example="消息签名,参考枚举类型")
    private String sign;

    @ApiModelProperty(value = "signType",example="消息签名方式,参考枚举类型")
    private String signType;

    @ApiModelProperty(value = "requestObj")
    private T requestObj;
}
