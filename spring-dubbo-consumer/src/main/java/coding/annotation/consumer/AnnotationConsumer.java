package coding.annotation.consumer;

import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

import coding.dubbo.annotation.AnnotationService;
import coding.dubbo.entity.User;

/**
 * @project 基于注解的dubbo消费者
 * @file AnnotationConsumer.java 创建时间:2017年9月12日下午5:37:50
 * @description 描述（简要描述类的职责、实现方式、使用注意事项等）
 * @author dzn
 * @version 1.0
 *
 */
@Component
public class AnnotationConsumer {
    
    @Reference(version = "1.0.0")
    private AnnotationService annotationService;
    
    public String sayHello(String name){
        return annotationService.sayHello(name);
    }
    
    public List<User> getUsers(){
        return annotationService.getUsers();
    }
}
