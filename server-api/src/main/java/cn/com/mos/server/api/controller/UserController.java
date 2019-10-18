package cn.com.mos.server.api.controller;

import cn.com.mos.server.api.dto.base.RequestDto;
import cn.com.mos.server.api.dto.base.ResponseDto;
import cn.com.mos.server.api.dto.user.RequestUserDto;
import cn.com.mos.server.api.dto.user.ResponseUserDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户管理
 *
 * @author 19010370 wangchaodz@gmail.com
 * @version 1.0
 * @Company Haier
 * @date 15:16 2019/10/17
 */
@Slf4j
@Controller
@RequestMapping("/user")
@Api(value = "eureka-provider", description = "用户查询接口")
public class UserController {


    /**
     * 查询所有的学生信息
     */
    @ApiOperation(value = "post请求调用示例", notes = "invokePost说明", httpMethod = "POST")
    @ResponseBody
    @PostMapping("/list")
    public ResponseDto<List<ResponseUserDto>> list(@ApiParam(name="传入对象",value="传入json格式",required=true) @RequestBody RequestDto<RequestUserDto> requestDto) {
        ResponseDto<List<ResponseUserDto>> responseDto = new ResponseDto<>();
        try {
            responseDto.setMessageId(requestDto.getMessageId());
            responseDto.setCreateBy(requestDto.getCreateBy());
            responseDto.setDateTime(requestDto.getDateTime());
            responseDto.setAddress(requestDto.getAddress());
            responseDto.setEventType(requestDto.getEventType());
            responseDto.setStatus(0);
            responseDto.setMessage("");
        } catch (Exception e) {
            responseDto.setStatus(-1);
            responseDto.setMessage("查询失败");
            log.error("查询失败===>" , e);
        }
        return responseDto;
    }
}
