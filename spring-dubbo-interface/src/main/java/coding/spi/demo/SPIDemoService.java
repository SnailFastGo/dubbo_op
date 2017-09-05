package coding.spi.demo;

import java.util.List;

import coding.dubbo.entity.User;

/**
 * @project SPI demo 接口
 * @file SPIDemoService.java 创建时间:2017年9月5日下午4:07:38
 * @description 描述（简要描述类的职责、实现方式、使用注意事项等）
 * @author dzn
 * @version 1.0
 *
 */
public interface SPIDemoService {
    String sayHello(String name);
    
    List<User> getUsers(); 
}
