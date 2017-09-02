package coding.demo.consumer;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import coding.dubbo.demo.DemoService;
import coding.dubbo.entity.User;

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "applicationContext.xml" });  
        context.start();  
  
        DemoService demoService = (DemoService) context.getBean("demoService");  
        String res = demoService.sayHello("hejingyuan");  
        System.out.println(res);  
  
        List<User> list = demoService.getUsers();  
        if (list != null && list.size() > 0) {  
            for (int i = 0; i < list.size(); i++) {  
                System.out.println(list.get(i));  
            }  
        }  
    }
}
