/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: teacher
 * Author:   19399
 * Date:     2020/5/25 22:16
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.lingnan.demo1.entity;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 19399
 * @create 2020/5/25
 * @since 1.0.0
 */
@Component
@ConfigurationProperties(prefix="neu.teacher")
@Validated
public class Teacher {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //@Value("${neu.teacher.name}")
    //@Value("${neu.teacher.name}")
    private String name;
    private int age;
    private String[] skill;

    public String[] getSkill() {
        return skill;
    }

    public void setSkill(String[] skill) {
        this.skill = skill;
    }



    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skill=" + Arrays.toString(skill) +
                '}';
    }
}

