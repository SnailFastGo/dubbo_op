
package coding.demo.provider;

import java.util.ArrayList;
import java.util.List;

import coding.dubbo.demo.DemoService;
import coding.dubbo.entity.User;

public class DemoServiceImpl implements DemoService{

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
