package coding.dubbo.api;

import java.util.List;

import coding.dubbo.entity.User;

/**
 * @project 基于Dubbo API实现的服务接口
 * @file APIService.java 创建时间:2017年9月4日下午3:40:46
 * @description 描述（简要描述类的职责、实现方式、使用注意事项等）
 * @author dzn
 * @version 1.0
 *
 */
public interface APIService {
    
    String sayHello(String name);
    
    List<User> getUsers(); 
}
