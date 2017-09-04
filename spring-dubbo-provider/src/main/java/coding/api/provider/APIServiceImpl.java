
package coding.api.provider;

import java.util.ArrayList;
import java.util.List;

import coding.dubbo.api.APIService;
import coding.dubbo.entity.User;

/**
 * @project 基于Dubbo API实现的服务接口实现类
 * @file APIServiceImpl.java 创建时间:2017年9月4日下午3:39:57
 * @description 描述（简要描述类的职责、实现方式、使用注意事项等）
 * @author dzn
 * @version 1.0
 *
 */
public class APIServiceImpl implements APIService{

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
