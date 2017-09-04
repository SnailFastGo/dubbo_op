package coding.xml.consumer;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import coding.dubbo.entity.User;
import coding.dubbo.xml.XMLService;

/**
 * @project 基于XML配置的服务消费者
 * @file Consumer.java 创建时间:2017年9月4日下午1:00:55
 * @description 描述（简要描述类的职责、实现方式、使用注意事项等）
 * @author dzn
 * @version 1.0
 *
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "applicationContext.xml" });  
        context.start();  
  
        XMLService xmlService = (XMLService) context.getBean("xmlService");  
        String res = xmlService.sayHello("hejingyuan");  
        System.out.println(res);  
  
        List<User> list = xmlService.getUsers();  
        if (list != null && list.size() > 0) {  
            for (int i = 0; i < list.size(); i++) {  
                System.out.println(list.get(i));  
            }  
        }  
    }
}
