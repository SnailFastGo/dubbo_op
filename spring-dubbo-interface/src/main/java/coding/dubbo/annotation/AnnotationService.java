package coding.dubbo.annotation;

import java.util.List;

import coding.dubbo.entity.User;

/**
 * @project 基于注解的dubbo接口
 * @file AnnotationService.java 创建时间:2017年9月12日下午5:38:51
 * @description 描述（简要描述类的职责、实现方式、使用注意事项等）
 * @author dzn
 * @version 1.0
 *
 */
public interface AnnotationService {
    String sayHello(String name);
    
    List<User> getUsers(); 
}
