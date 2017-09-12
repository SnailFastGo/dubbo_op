package coding.annotation.provider;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;

import coding.dubbo.annotation.AnnotationService;
import coding.dubbo.entity.User;

/**
 * @project 基于注解的dubo服务提供者
 * @file AnnotationServiceImpl.java 创建时间:2017年9月12日下午5:39:11
 * @description 描述（简要描述类的职责、实现方式、使用注意事项等）
 * @author dzn
 * @version 1.0
 *
 */
@Service(version = "1.0.0")
public class AnnotationServiceImpl implements AnnotationService{

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }

    @Override
    public List<User> getUsers() {
        List<User> list = new ArrayList<>();  
        User u1 = new User(); 
        u1.setId(1);
        u1.setName("hejingyuan");  
        u1.setAge(20);  
        u1.setSex("f");  
  
        User u2 = new User();  
        u2.setId(2);
        u2.setName("xvshu");  
        u2.setAge(21);  
        u2.setSex("m");  
          
        list.add(u1);  
        list.add(u2);  
          
        return list; 
    }
    
    
}
