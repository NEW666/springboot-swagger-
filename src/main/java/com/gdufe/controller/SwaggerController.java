package com.gdufe.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Controller类接口")
public class SwaggerController {

    @ApiOperation(value = "Tom",notes = "输入返回的姓名")
    @ApiImplicitParam(name = "name",required = true,value = "用户的姓名")
    @ApiResponse(code = 301,message = "成功处理请求")
    @GetMapping("/getString/{name}")
   public String  getString(@PathVariable("name") String name){
        return  name;
   }
}
