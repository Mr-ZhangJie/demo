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
 *@ClassName Company
 *@author ZhangJie
 *@date2019/7/11 15:06
 *@Description TODO
 **/
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Company {
    private String time;
    private String cName;
    private String rank;

}
