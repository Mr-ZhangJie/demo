package com.personage.demo.pojo;/**
 * @author ZhangJie
 * @date 2019/04/16
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *@ClassName Projects
 *@author ZhangJie
 *@date2019/7/11 15:03
 *@Description TODO
 **/
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Projects {
    private String pName;//项目名
    private String describe;//项目描述
    private String environment;//开发环境
    private String selection;//技术选型
    private Modules module;//技术选型
    private Duty duty;//责任描述

}
