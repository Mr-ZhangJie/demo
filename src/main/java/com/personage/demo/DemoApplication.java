package com.personage.demo;

import com.personage.demo.pojo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.ArrayList;
import java.util.List;
@SpringBootApplication
@Slf4j
public class DemoApplication implements ApplicationRunner {

	@Autowired
	private MongoTemplate mongoTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
        Introduce introduce = Introduce.builder()
                .name("张诗杰")
                .nativePlace("武汉")
                .profession("计算机及应用")
                .sex("男")
                .education("本科")
                .school("武警工程学院")
                .age("28")
                .phone("18162650986")
                .email("9399984@qq.com").build();
        List techniques = new ArrayList<String>();
        techniques.add("熟练使用并掌握 Spring 全家桶,持久层框架 Mybatis,Hibernate 以及控制层框架 Struts2 ");
        techniques.add("熟练使用并掌握 JavaWeb基础知识: Jsp,Listener,Filer,Tomcat,Http,Servler等 ");
        techniques.add("熟练使用并掌握搜索引擎 ELK:ElasticSearch对数据的存储, Logstash对日志的收集,Kibana 对数据的展示,可视 化等 ");
        techniques.add("熟练使用并掌握的数据库 Mysql,mongodb:对 SQL语句的使用优化等掌握良好 ");
        techniques.add("熟练使用工具 Svn,Git,Maven:熟练使用常用的工具 ");
        techniques.add("了解前端框架:Js,LayUI,Bootstrap,AngularJS:了解前端框架 ");
        techniques.add("了解定时调度框架 Quartz ");
        techniques.add("了解权限框架:Spring Security,Apache Shiro ");
        techniques.add("了解的队列 ActiveMQ ");
        techniques.add("了解的报表工具 Spache POI  ");
        List language = new ArrayList<String>();
        language.add("java ");
        language.add("Python");
        Technology technology = Technology.builder().technique(techniques).language(language).build();
        List module1 = new ArrayList<String>();
        module1.add("ELK模块:主要是展示设备的信息,包括更新成功与否的监控,系统日志的监控,以及后台可视化的制作 ");
        module1.add("udpService模块:收集 TOI2040发送的 udp数据进行转发,转发到 ElasticSearch 与 headBeat接口 ");
        module1.add("后台管理模块:主要是展示设备的状态以及进行更新,重置,log查看,删除,设置默认版本号等 ");
        module1.add("Gitlab模块:主要是使用 java进行 Gitlab增删改查操作 ");
        module1.add("proguard主要是对项目的代码进行混淆 ");
        Module module = Module.builder().module(module1).build();
        Modules modules = Modules.builder().modules(module).build();
        List duty1 = new ArrayList<String>();
        duty1.add("ElasticSearch存储的数据主要有两种.其一:IOT2040发送的日志信息,其二: udpService发送的 hearBeat数据 ");
        duty1.add("Logstash,手机日志信息,并通过正则表达式将数据格式化存储到 ElasticSearch ");
        duty1.add("kibana进行数据的展示,以及可视化的监控 ");
        duty1.add("mongdb对设备的相关信息进行存储,包括设备的基础信息,心跳信息,更新信息,指定软件包版本信息等 ");
        duty1.add("gitlab主要作用是保存软件包的程序信息,其中软件包包含 IOT2040的软件包,以及本地服务软件包 ");
        duty1.add("udpService主要作用是使用 python收集 IOT2040发送的心跳进行收集请求心跳接口,以及将心跳数据保存 ElasticSearch ");
        duty1.add("Swagger 主要提供更方便的 API ");
        duty1.add("文档的编写,主要是负责复杂操作的文档编写,以及设计文档的编写等");



        Duty dutys = Duty.builder().dutys(duty1).build();
        Projects pro1 = Projects.builder().pName("西门子(SIMATIC)IOT2040(2018.09-2019.06) ").describe("IOT2040是西门子的一个智能网关可以将不同数据源间的通信进行标准化，分析数据内容并 将通信内容转发给相应接收者是一个易于实现的解决方案。即使是现有工厂设备，利用该 解决方案，也可以实现面向未来的生产方案。该项目主要是对软件的集成,包括系统软件 的安装,更新,系统日志收集,设备的监控").environment("IDEA +JDK 1.8 +MongoDB 4.0+ELK7.0+Python 3.7+GitLab+Tomcat 8.5 ").selection("Spring Boot 2.0.0， MongoDB+Data，Maven3.5，Swagger 2.8，Lombok，Git, proguard6.0.3 ").module(modules).duty(dutys).build();

        List module2 = new ArrayList<String>();
        module2.add("后端使用 Web 开源框架 Spring Boot 2.0.3+MyBatis，服务器为 Tomcat8，数据库为 MySQL，Maven 管理项目架构； ");
        module2.add("前端使用 安卓 和 ios以及 layUi ");
        module2.add("短信验证码,门锁授权以及解除授权使用阿里大鱼通知  ");
        module2.add("Quartz 时间控制框架每分钟定时对门锁授权过期进行解除授权");
        module2.add("Redis进行单次授权存储,过期自动删除 ");
        Module mo2 = Module.builder().module(module2).build();
        Modules modules2 = Modules.builder().modules(mo2).build();
        List duty2 = new ArrayList<String>();
        duty2.add(":人脸校验,实名认证,添加,解除门锁权限,设备的添加,解绑,转让,收回以及门锁详情等 ");
        duty2.add("人脸校验:其中人脸校验调用自己内部接口 ");
        duty2.add("实名认证:调用国政通接口 ");
        duty2.add("添加,解除门锁权限(房东+管理员权限,房东权限,管理员权限,使用者权限,以及单次授权权限)其中授权分为 app授权和二代\n");
        duty2.add("身份证授权以及钥匙卡授权三种方式 ");
        duty2.add("添加,解除,转让,收回权限 ");
        Duty dutys2 = Duty.builder().dutys(duty2).build();
        Projects pro2 = Projects.builder().pName("：智慧门锁(2018.05-2018.09) ").describe("河北君通亿龙科技有限公司推行短租房项目，使用二代证智能门锁来管控短租人员信 息，门锁通过蓝牙手机 APP通讯，将门锁角色、开锁信息等监控指标上报云平台。对门 锁设备进行管理，并通过获取上报数据，对设备的故障、离线、在线等状态进行监控，统 计分析").environment("Eclipse. Oxygen +JDK1.8 +MySQL5.7 ").selection("Spring Boot 2.0.3， MyBatis，Maven，Redis，swagger2，lombok，svn，阿里大鱼").module(modules2).duty(dutys2).build();

        List module3 = new ArrayList<String>();
        module2.add("前台使用 Web 开源框架 SSM，服务器为 Tomcat8，数据库为 MySQL，Maven 管理项目架构");
        module2.add("前台前端使用 VUE+node.js");
        module2.add("后台前端使用layUI+jquery");
        module2.add("Redis实现考题进行缓存 ");
        module2.add("Shiro 实现登陆控制");
        module2.add("Quartz 时间控制框架进行考试时间控制");
        module2.add("POI实现考试的题目以及答案进行上传下载");
        Module mo3 = Module.builder().module(module3).build();
        Modules modules3 = Modules.builder().modules(mo3).build();
        List duty3 = new ArrayList<String>();
        duty2.add("考试题目包含单选题,多选题,填空题,判断,实操题,其中实操题还包含了静态实操题与动态实操题");
        duty2.add("报名系统包含在线登陆,在线报名,我的考试,发票管理,报名信息提交展示");
        duty2.add("后台主要是题库管理,题目管理,考试管理.成绩管理,问卷管理,基础支撑管理报名系统管理等");
        duty2.add("题目管理主要有题目的新增(手动录入与POI导入)");
        duty2.add("题库管理包含,题库的增删改查 ");
        duty2.add("考试管理包主要是给考试分配试卷");
        duty2.add("成绩管理包含考生的成绩展示以及成绩的导出");
        duty2.add("基础支撑管理包含从业人员管理,住址架构管理,用户管理,角色管理,报名审核管理");
        Duty dutys3 = Duty.builder().dutys(duty3).build();
        Projects pro3 = Projects.builder().pName("CII考试系统(2017/12~~2018/05) ").describe("CII考试系统是网络关键信息基础设施安全考试系统其分为前台与后台, 前台主要是考生考试以及报名系统 \n" +
                "后台主要是题库管理,题目管理,考试管理.成绩管理,问卷管理,基础支撑管理报名系统管 理等 ").environment("eclipse.Oxygen +JDK1.8+Tomcat8+MySQL").selection("Spring MVC，Spring，MyBatis，Maven，Redis，ElasticSearch，Shiro，Quartz，POI，swagger2 ").module(modules3).duty(dutys3).build();

        List<Projects> projects = new ArrayList<>();
        projects.add(pro1);
        projects.add(pro2);
        projects.add(pro3);
        ProExperience pros = ProExperience.builder().project(projects).build();
        List<Company> exp = new ArrayList<>();
        Company  exp1 = Company.builder().time("2018.09-今").cName("北京瑞友科技股份有限公司上海分公司").rank("高级java工程师").build();
        exp.add(exp1);
        Company  exp2 = Company.builder().time("2016.12-2018.09").cName("恒鸿达科技有限公司 ").rank("中级java工程师").build();
        exp.add(exp2);
        Company  exp3 = Company.builder().time("2015.09-2016.12").cName("广州蓝图信息技术有限公司").rank("运维,测试 java工程师").build();
        exp.add(exp3);
        Experience expBuild = Experience.builder().company(exp).build();
        Resume builder = Resume.builder()._id("111111").introduce(introduce).technology(technology).proExperience(pros).experience(expBuild).build();
//        new Query.query(addCriteria());
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is("111111"));
        mongoTemplate.remove(query,Resume.class);
        mongoTemplate.save(builder);
        List<Resume> all = mongoTemplate.findAll(Resume.class);
        log.info(all.toString());

    }

}
