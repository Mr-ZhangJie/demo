package com.personage.demo.controller;/**
 * @author ZhangJie
 * @date 2019/04/16
 */

import com.personage.demo.pojo.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@ClassName controllerFfind
 *@author ZhangJie
 *@date2019/7/11 16:59
 *@Description TODO
 **/
@RestController
@RequestMapping()
class FindController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/index")
    public Resume hello() {
        Resume resume = mongoTemplate.findById("111111",Resume.class);
        return resume;
    }
}
