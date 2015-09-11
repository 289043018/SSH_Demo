package com.hand.action;

import java.util.Date;
import java.util.UUID;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.model.User;
import com.hand.service.UserServiceI;
import com.opensymphony.xwork2.ActionSupport;

@ParentPackage("basePackage")
@Action(value="strust2Test")//使用convention-plugin插件提供的@Action注解将一个普通java类标注为一个可以处理用户请求的Action，Action的名字为struts2Test
//@Namespace("/")//使用convention-plugin插件提供的@Namespace注解为这个Action指定一个命名空间
public class TestAction {
	
	 /**
      * 注入userService
      */
     
//     private UserServiceI userService;
   //通过spring.xml配置文件创建Spring的应用程序上下文环境
     ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-hibernate.xml"});
     //从Spring的IOC容器中获取bean对象
     UserServiceI userService = (UserServiceI) ac.getBean("userService");
 
     /**
      * http://localhost:8080/SSHE/strust2Test!test.action
      * MethodName: test
      * Description: 
      * @author xudp
      */
     public void test(){
         System.out.println("进入TestAction");
       
         userService.test();
     }
     
     /**
      * http://localhost:8080/SSHE/strust2Test!saveUser.action
      */
     public void saveUser(){
         User user = new User();
         user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
         user.setName("xdp孤傲苍狼");
         user.setPwd("123456");
         user.setCreatedatetime(new Date()); 
         userService.save(user);
     }
 
}
