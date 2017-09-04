package coding.dubbo.xml;

import java.util.List;

import coding.dubbo.entity.User;

/**
 * @project 基于XML配置的服务接口
 * @file XMLService.java 创建时间:2017年9月4日下午3:38:01
 * @description 描述（简要描述类的职责、实现方式、使用注意事项等）
 * @author dzn
 * @version 1.0
 *
 */
public interface XMLService {
    
    String sayHello(String name);
    
    List<User> getUsers(); 
}
