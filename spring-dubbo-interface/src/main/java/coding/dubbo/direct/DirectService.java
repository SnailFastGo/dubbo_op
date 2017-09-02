package coding.dubbo.direct;

import java.util.List;

import coding.dubbo.entity.User;

public interface DirectService {
    
    String sayHello(String name);
    
    List<User> getUsers(); 
}
