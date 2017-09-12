package coding.annotation.consumer;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import coding.dubbo.entity.User;

/**
 * @project 基于注解的dubbo消费者测试类
 * @file AnnotationConsumerTest.java 创建时间:2017年9月12日下午5:38:21
 * @description 描述（简要描述类的职责、实现方式、使用注意事项等）
 * @author dzn
 * @version 1.0
 *
 */
public class AnnotationConsumerTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "applicationContext.xml" });  
        context.start();  
        AnnotationConsumer annotationConsumer = (AnnotationConsumer)context.getBean("annotationConsumer");  
        String sayHello = annotationConsumer.sayHello("TOM");
        System.out.println(sayHello);
        
        List<User> list = annotationConsumer.getUsers();  
        if (list != null && list.size() > 0) {  
            for (int i = 0; i < list.size(); i++) {  
                System.out.println(list.get(i));  
            }  
        }  
        context.close();
    }
}
