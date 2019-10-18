package cn.com.mos.server.api.dto.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
@ApiModel(value="基础返回类",description="基础返回类")
public class ResponseDto<T> implements Serializable {

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

    @NotNull
    @ApiModelProperty(value = "status",example="消息应答编码")
    private Integer status;

    @NotNull
    @ApiModelProperty(value = "message",example="消息响应内容")
    private String message;

    @ApiModelProperty(value = "responseObj")
    private T responseObj;

}
