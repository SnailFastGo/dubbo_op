
package coding.direct.provider;

import java.util.ArrayList;
import java.util.List;

import coding.dubbo.direct.DirectService;
import coding.dubbo.entity.User;

/**
 * @project 基于点对点直连的dubbo接口实现类
 * @file DirectServiceImpl.java 创建时间:2017年9月4日下午4:02:26
 * @description 描述（简要描述类的职责、实现方式、使用注意事项等）
 * @author dzn
 * @version 1.0
 *
 */
public class DirectServiceImpl implements DirectService{

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
