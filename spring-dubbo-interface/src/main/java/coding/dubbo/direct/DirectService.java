package coding.dubbo.direct;

import java.util.List;

import coding.dubbo.entity.User;

/**
 * @project 基于点对点直连的dubbo接口
 * @file DirectService.java 创建时间:2017年9月4日下午4:02:42
 * @description 描述（简要描述类的职责、实现方式、使用注意事项等）
 * @author dzn
 * @version 1.0
 *
 */
public interface DirectService {
    
    String sayHello(String name);
    
    List<User> getUsers(); 
}
