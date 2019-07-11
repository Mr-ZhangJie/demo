package com.personage.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *@ClassName Resume
 *@author ZhangJie
 *@date2019/7/11 14:19
 *@Description TODO
 **/
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Resume {

    private String _id;//个人介绍
    private Introduce introduce;//个人介绍
    private Technology technology;//专业技术
    private ProExperience proExperience;//项目经验
    private Experience experience;//工作经验
}
