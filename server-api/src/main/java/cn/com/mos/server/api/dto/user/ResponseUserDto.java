package cn.com.mos.server.api.dto.user;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

@Data
public class ResponseUserDto implements Serializable {

    @ApiModelProperty(value = "userName",example="用户名")
    private String userName;

    @ApiModelProperty(value = "userPwd",example="密码")
    private String userPwd;

}
