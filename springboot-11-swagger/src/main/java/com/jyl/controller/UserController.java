package com.jyl.controller;


import com.jyl.bean.User;
import com.sun.org.apache.xpath.internal.operations.Mod;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/user")
@Api(tags = "用户相关的接口" , description = "对用户进行增删改查的操作")
public class UserController {



    @GetMapping
    @ApiOperation("查询用户列表")
    public String list(Model model){

        return "list";
    }

    @GetMapping("/toAdd")   //因为 /user提前了只需要 GetMapping("/toAdd") ，想要访问到这个请求只需要 @{/guest/toAdd}
    @ApiIgnore
    public String toAdd(){
        return "add";
    }

    /**
     * 将/guest 格式的url映射到此方法
     * @PostMapping 代表需要添加的操作
     * @param user
     * @return
     */
    //@RequestMapping("/guest/add")
    @PostMapping  // 想要访问到这个请求只需要 @{/guest}
    @ApiOperation("添加用户接口")
    public String add(User user){


        //return "redirect:/guest/list";  //转发不需要 加guest了 ，
        return "redirect:/user";

    }


    /**
     * 前端请求方式 @{/user/toUpdate/}+${user.name}
     * 将/user/toUpdate/{name}格式的url映射到此方法
     * 其中的name属性值  通过注解 @PathVariable("name")映射到方法的属性中
     * 其中的“name” 代表去url中查找的属性值
     * 直译的意思就是  从路径中获取name的值 赋值给 String name
     *
     * @param model
     * @param name
     * @return
     */
    //@RequestMapping("/user/toUpdate")
    //更新操作之前需要获取对象，传入的参数需要用/{name}并添加@PathVariable("name")注解对应
    @GetMapping("/toUpdate/{name}")
    @ApiIgnore
    public String toUpdate(Model model,@PathVariable("name") String name){
        return "update";
    }

    //@RequestMapping("/user/update")
    @PutMapping  //PutMapping注解代表的就是更新操作 所有只需要URL请求   /user 就可以访问到了
    @ApiOperation("更新用户接口")
    public String update(User user){

        //return "redirect:/user/list";
        return "redirect:/user";

    }
    //@RequestMapping("/user/delete")
    @DeleteMapping("/{name}")
    @ApiImplicitParam(name = "name",value = "姓名")
    @ApiOperation("删除用户接口")
    public String delete(@PathVariable("name") String name){

        //return "redirect:/user/list";
        return "redirect:/user";

    }

}
