package coding.dubbo.demo;

import java.util.List;

import coding.dubbo.entity.User;

public interface DemoService {
    
    String sayHello(String name);
    
    List<User> getUsers(); 
}
