/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: HelloController
 * Author:   19399
 * Date:     2020/5/25 11:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.lingnan.demo1.controller;

import com.lingnan.demo1.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 19399
 * @create 2020/5/25
 * @since 1.0.0
 */
@Controller
public class HelloController {
    /*
     * ${}：可以取环境变量的值，知识取值
     * #{}：字符串做""，数值不加
     * */
    @Value("${neu.className}")
    private String className;
    @Value("${neu.count}")
    private int count;

    @Autowired
    private Teacher teacher;

    @RequestMapping("hello")
    @ResponseBody//json格式返回
    public String hello() {
        return "课程名称：" + className + "，上课人数：" + count +",教师信息"+teacher+ "hello spring boot";
    }
}

