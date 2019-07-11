package com.personage.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *@ClassName Introduce
 *@author ZhangJie
 *@date2019/7/11 14:23
 *@Description TODO
 **/
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Introduce {
    private String name;//姓名
    private String nativePlace ;//籍贯
    private String profession;//专业
    private String sex;//性别
    private String education;//学历
    private String school;//学校
    private String age;//年龄
    private String phone;//手机
    private String email;//邮箱

}
