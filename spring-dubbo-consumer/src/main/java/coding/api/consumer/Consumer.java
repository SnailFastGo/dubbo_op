package coding.api.consumer;

import java.util.List;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;

import coding.dubbo.api.APIService;
import coding.dubbo.entity.User;

/**
 * @project 基于Dubbo API实现的服务消费者
 * @file Consumer.java 创建时间:2017年9月4日下午3:41:21
 * @description 描述（简要描述类的职责、实现方式、使用注意事项等）
 * @author dzn
 * @version 1.0
 *
 */
public class Consumer {
    public static void main(String[] args) {
        // 当前应用配置
        ApplicationConfig application = new ApplicationConfig();
        application.setName("yyy");
        
        // 连接注册中心配置
        RegistryConfig registry = new RegistryConfig();
        registry.setProtocol("zookeeper");
        registry.setAddress("172.24.8.31:2181");
//        registry.setUsername("aaa");
//        registry.setPassword("bbb");
        
        // 此实例很重，封装了与注册中心的连接以及与提供者的连接，请自行缓存，否则可能造成内存和连接泄漏
        ReferenceConfig<APIService> reference = new ReferenceConfig<APIService>(); 
        reference.setApplication(application);
        reference.setRegistry(registry); // 多个注册中心可以用setRegistries()
        reference.setInterface(APIService.class);
        reference.setVersion("1.0.0");
        
        // 和本地bean一样使用xxxService. 注意：此代理对象内部封装了所有通讯细节，对象较重，请缓存复用
        APIService apiService = reference.get();
        String res = apiService.sayHello("tom");
        System.out.println(res);
        List<User> users = apiService.getUsers();
        if (users != null && users.size() > 0) {  
            for (int i = 0; i < users.size(); i++) {  
                System.out.println(users.get(i));  
            }  
        }  

    }
}
