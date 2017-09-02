package coding.dubbo.api;

import java.util.List;

import coding.dubbo.entity.User;

public interface APIService {
    
    String sayHello(String name);
    
    List<User> getUsers(); 
}
