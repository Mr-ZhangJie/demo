package com.personage.demo.pojo;/**
 * @author ZhangJie
 * @date 2019/04/16
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 *@ClassName Duty
 *@author ZhangJie
 *@date2019/7/11 15:53
 *@Description TODO
 **/
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Duty {
    private List<String> dutys;
}
